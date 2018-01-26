package my.mybatis.example.plugin;

import org.mybatis.generator.api.*;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.*;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */
public class BaseMapperGeneratorPlugin extends PluginAdapter {
    public boolean validate(List<String> warnings) {
        return true;
    }

    /**
     * 生成dao 接口
     */
    @Override
    public boolean clientGenerated(Interface interfaze,
                                   TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        /**
         * 主键默认采用java.lang.Integer
         */
        FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType("BaseDao<"
                + introspectedTable.getBaseRecordType() + ","
                //+ introspectedTable.getExampleType() + ","
                + "java.lang.Long" + ">");
        FullyQualifiedJavaType imp = new FullyQualifiedJavaType(
                "my.mybatis.example.base.BaseDao");
        /**
         * 添加 extends MybatisBaseMapper
         */
        interfaze.addSuperInterface(fqjt);

        /**
         * 添加import my.mabatis.example.base.MybatisBaseMapper;
         */
        interfaze.addImportedType(imp);
        /**
         * 方法不需要
         */
        interfaze.getMethods().clear();
        interfaze.getAnnotations().clear();

       /* FullyQualifiedJavaType type = interfaze.getType();
        type.getShortName();*/



        return true;
    }

    /**
     * 生成实体中每个属性
     */
    @Override
    public boolean modelGetterMethodGenerated(Method method, TopLevelClass topLevelClass,
                                              IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        return true;
    }

    /**
     * 生成实体
     */
    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        addSerialVersionUID(topLevelClass, introspectedTable);
        return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
    }

    private void addSerialVersionUID(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        CommentGenerator commentGenerator = context.getCommentGenerator();
        Field field = new Field();
        field.setVisibility(JavaVisibility.PRIVATE);
        field.setType(new FullyQualifiedJavaType("long"));
        field.setStatic(true);
        field.setFinal(true);
        field.setName("serialVersionUID");
        field.setInitializationString("1L");
        commentGenerator.addFieldComment(field, introspectedTable);
        topLevelClass.addField(field);
    }

    /**
     * 生成mapping
     */
    @Override
    public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
        return super.sqlMapGenerated(sqlMap, introspectedTable);
    }

    /**
     * 生成mapping 添加自定义sql
     */
    @Override
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {

        String tableName = introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime();// 数据库表名
        List<IntrospectedColumn> columns = introspectedTable.getAllColumns();
        XmlElement parentElement = document.getRootElement();

        List<Element> elements = new ArrayList<Element>();
        elements.add(0,parentElement.getElements().get(0));//resultMap##

        //1.添加sql-字段列表
        XmlElement columnSql = getColumnsXmlElement(introspectedTable);
        elements.add(1,columnSql);

        //2.添加sql——where
        XmlElement whereSql = getWhereXmlElement(introspectedTable);
        elements.add(2,whereSql);

        //3.添加sql--insert
        XmlElement insert = getInsertXmlElement(introspectedTable);
        elements.add(3,insert);

        //4.添加sql--deleteBy
        XmlElement deleteBy = getDeleteXmlElement(introspectedTable);
        elements.add(4,deleteBy);

        //5.添加sql--update
        XmlElement update = getUpdateXmlElement(introspectedTable);
        elements.add(5,update);

        //6.添加sql--getByParam
        XmlElement getByParam = getByParamXmlElement(introspectedTable);
        elements.add(6,getByParam);

        //7.添加sql-分页查询
        XmlElement pageDataXmlElement = getPageDataXmlElement(introspectedTable);
        elements.add(7,pageDataXmlElement);

        //7.添加sql-分页查询获取数据总数量
        XmlElement getPageCountXmlElement = getPageCountXmlElement(introspectedTable);
        elements.add(8,getPageCountXmlElement);

        //添加getList
        XmlElement select = new XmlElement("select");
        select.addAttribute(new Attribute("id", "getList"));
        select.addAttribute(new Attribute("resultMap", "BaseResultMap"));
        select.addAttribute(new Attribute("parameterType", introspectedTable.getBaseRecordType()));
        select.addElement(new TextElement(" select * from "+ introspectedTable.getFullyQualifiedTableNameAtRuntime()));

        XmlElement include = new XmlElement("include");
        include.addAttribute(new Attribute("refid", "where"));

        select.addElement(include);
        parentElement.addElement(select);

        //



        //添加getPageCount
        XmlElement getPageCount = new XmlElement("select");
        getPageCount.addAttribute(new Attribute("id", "getPageCount"));
        getPageCount.addAttribute(new Attribute("parameterType","java.util.Map"));
        getPageCount.addAttribute(new Attribute("resultType", "java.util.Long"));
        getPageCount.addElement(new TextElement(" select COUNT(0) from "+ introspectedTable.getFullyQualifiedTableNameAtRuntime()));

        XmlElement getPageCountInclude = new XmlElement("include");
        getPageCountInclude.addAttribute(new Attribute("refid", "where"));

        getPageCount.addElement(getPageCountInclude);

        parentElement.addElement(getPageCount);

        //添加getPageData
        XmlElement getPageData = new XmlElement("select");
        getPageData.addAttribute(new Attribute("id", "getPageData"));
        getPageData.addAttribute(new Attribute("parameterType", "java.util.Map"));
        getPageData.addAttribute(new Attribute("resultMap", "BaseResultMap"));
        getPageData.addElement(new TextElement(" select * from "+ introspectedTable.getFullyQualifiedTableNameAtRuntime()));

        XmlElement getPageDataInclude = new XmlElement("include");
        getPageDataInclude.addAttribute(new Attribute("refid", "where"));

        getPageData.addElement(getPageDataInclude);

        getPageData.addElement(new TextElement(" order by ${sortClumn} desc limit #{pageNo},#{pageSize}"));//默认降序
        parentElement.addElement(getPageData);

        parentElement.getElements().removeAll(parentElement.getElements());
        parentElement.getElements().addAll(elements);


        for (int i = 0; i < parentElement.getElements().size(); i++) {
            if (i % 2 == 0) {
                parentElement.getElements().add(i + 1, new TextElement(""));
            }
        }

        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }

    private XmlElement getPageCountXmlElement(IntrospectedTable introspectedTable) {
        XmlElement getPageCount = new XmlElement("select");
        getPageCount.addAttribute(new Attribute("id", "getPageCount"));
        getPageCount.addAttribute(new Attribute("resultType", "java.lang.Integer"));
        getPageCount.addAttribute(new Attribute("parameterType", "java.util.Map"));
        getPageCount.addElement(new TextElement(" select COUNT(1) from "+ introspectedTable.getFullyQualifiedTableNameAtRuntime()));
        XmlElement wheresEl = new XmlElement("include");
        wheresEl.addAttribute(new Attribute("refid", "where"));
        getPageCount.addElement(wheresEl);
        return getPageCount;
    }

    private XmlElement getPageDataXmlElement(IntrospectedTable introspectedTable) {
        XmlElement getPageData = new XmlElement("select");
        getPageData.addAttribute(new Attribute("id", "getPageData"));
        getPageData.addAttribute(new Attribute("resultMap", "BaseResultMap"));
        getPageData.addAttribute(new Attribute("parameterType", "java.util.Map"));
        getPageData.addElement(new TextElement(" select * from "+ introspectedTable.getFullyQualifiedTableNameAtRuntime()));
        XmlElement wheresEl = new XmlElement("include");
        wheresEl.addAttribute(new Attribute("refid", "where"));
        getPageData.addElement(wheresEl);
        XmlElement anIf = new XmlElement("if");
        anIf.addAttribute(new Attribute("test","sortColumn != null and sortColumn != ''"));
        anIf.addElement(new TextElement(" ORDER BY #{sortColumn}"));
        getPageData.addElement(anIf);
        getPageData.addElement(new TextElement(" LIMIT #{offset},#{pageSize}"));
        return getPageData;
    }

    private XmlElement getByParamXmlElement(IntrospectedTable introspectedTable) {
        XmlElement getByParam = new XmlElement("select");
        getByParam.addAttribute(new Attribute("id", "getByParam"));
        getByParam.addAttribute(new Attribute("resultMap", "BaseResultMap"));
        getByParam.addAttribute(new Attribute("parameterType", "java.util.Map"));
        getByParam.addElement(new TextElement(" select * from "+ introspectedTable.getFullyQualifiedTableNameAtRuntime()));

        XmlElement getOneInclude = new XmlElement("include");
        getOneInclude.addAttribute(new Attribute("refid", "where"));

        getByParam.addElement(getOneInclude);
        return getByParam;
    }

    private XmlElement getUpdateXmlElement(IntrospectedTable introspectedTable) {
        XmlElement update = new XmlElement("update");//insert##
        update.addAttribute(new Attribute("id","update"));
        update.addAttribute(new Attribute("parameterType",introspectedTable.getBaseRecordType()));
        update.addElement(new TextElement("UPDATE  "+ introspectedTable.getFullyQualifiedTableNameAtRuntime() +" SET "));

        //组装 if 标签
        StringBuilder sb1 = new StringBuilder();
        List<IntrospectedColumn> nonPrimaryKeyColumns = introspectedTable.getAllColumns();
        for (int i=0;i<nonPrimaryKeyColumns.size();i++) {
            sb1.setLength(0);
            sb1.append(MyBatis3FormattingUtilities.getEscapedColumnName(nonPrimaryKeyColumns.get(i))+ " = "+ dealParameterClause(nonPrimaryKeyColumns.get(i)));
            if (i<nonPrimaryKeyColumns.size()-1) sb1.append(","); //$NON-NLS-1$
            update.addElement(new TextElement(sb1.toString()));
        }

        IntrospectedColumn introspectedColumn = introspectedTable.getPrimaryKeyColumns().get(0);
        update.addElement(new TextElement(" WHERE "+introspectedColumn.getActualColumnName() + " = " +dealParameterClause(introspectedColumn)));
        return update;
    }

    private String dealParameterClause(IntrospectedColumn introspectedColumn) {
        String parameterClause = MyBatis3FormattingUtilities.getParameterClause(introspectedColumn);
        parameterClause = parameterClause.substring(0,parameterClause.indexOf(","))+"}";
        return parameterClause;
    }

    private XmlElement getDeleteXmlElement(IntrospectedTable introspectedTable) {
        XmlElement deleteBy = new XmlElement("delete");//insert##
        deleteBy.addAttribute(new Attribute("id","deleteBy"));
        deleteBy.addAttribute(new Attribute("parameterType","java.util.Map"));
        deleteBy.addElement(new TextElement("DELETE FROM "+ introspectedTable.getFullyQualifiedTableNameAtRuntime() +" "));

        XmlElement include = new XmlElement("include");
        include.addAttribute(new Attribute("refid", "where"));

        deleteBy.addElement(include);

        return deleteBy;
    }

    private XmlElement getInsertXmlElement(IntrospectedTable introspectedTable) {
        XmlElement insert = new XmlElement("insert");//insert##
        insert.addAttribute(new Attribute("id","insert"));
        insert.addAttribute(new Attribute("parameterType",introspectedTable.getBaseRecordType()));
        insert.addElement(new TextElement("INSERT INTO "+ introspectedTable.getFullyQualifiedTableNameAtRuntime() +" ("));

        //组装 if 标签
        StringBuilder sb1 = new StringBuilder();
        List<IntrospectedColumn> nonPrimaryKeyColumns = introspectedTable.getAllColumns();
        for (int i=0;i<nonPrimaryKeyColumns.size();i++) {
            //insert 语句上半部分
            XmlElement isNotNullElement = new XmlElement("if"); //$NON-NLS-1$
            sb1.setLength(0);
            sb1.append(nonPrimaryKeyColumns.get(i).getJavaProperty());
            sb1.append(" != null"); //$NON-NLS-1$
            isNotNullElement.addAttribute(new Attribute("test", sb1.toString())); //$NON-NLS-1$
            insert.addElement(isNotNullElement);
            sb1.setLength(0);
            if (i<nonPrimaryKeyColumns.size()-1&& i !=0) sb1.append(","); //$NON-NLS-1$
            sb1.append(MyBatis3FormattingUtilities.getEscapedColumnName(nonPrimaryKeyColumns.get(i)));
            isNotNullElement.addElement(new TextElement(sb1.toString()));
        }

        insert.addElement(new TextElement(") VALUES ("));

        for (int i=0;i<nonPrimaryKeyColumns.size();i++) {
            //insert 语句下半部分
            XmlElement isNotNullElement = new XmlElement("if"); //$NON-NLS-1$
            sb1.setLength(0);
            sb1.append(nonPrimaryKeyColumns.get(i).getJavaProperty());
            sb1.append(" != null"); //$NON-NLS-1$
            isNotNullElement.addAttribute(new Attribute("test", sb1.toString())); //$NON-NLS-1$
            insert.addElement(isNotNullElement);
            sb1.setLength(0);
            if (i<nonPrimaryKeyColumns.size()-1&& i !=0) sb1.append(","); //$NON-NLS-1$
            sb1.append(dealParameterClause(nonPrimaryKeyColumns.get(i)));
            isNotNullElement.addElement(new TextElement(sb1.toString()));
        }

        insert.addElement(new TextElement(")"));
        return insert;
    }

    private XmlElement getWhereXmlElement(IntrospectedTable introspectedTable) {
        XmlElement sql = new XmlElement("sql");
        sql.addAttribute(new Attribute("id", "where"));
        XmlElement where = new XmlElement("where");
        StringBuilder sb = new StringBuilder();
        for (IntrospectedColumn introspectedColumn : introspectedTable.getAllColumns()) {
            XmlElement isNotNullElement = new XmlElement("if"); //$NON-NLS-1$
            sb.setLength(0);
            sb.append(introspectedColumn.getJavaProperty());
            sb.append(" != null"); //$NON-NLS-1$
            isNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$
            where.addElement(isNotNullElement);

            sb.setLength(0);
            sb.append(" and ");
            sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(introspectedColumn));
            sb.append(" = "); //$NON-NLS-1$
            sb.append(dealParameterClause(introspectedColumn));
            isNotNullElement.addElement(new TextElement(sb.toString()));
        }
        sql.addElement(where);
        return sql;
    }

    private XmlElement getColumnsXmlElement(IntrospectedTable introspectedTable) {
        XmlElement columnSql = new XmlElement("sql");
        columnSql.addAttribute(new Attribute("id","columns"));
        StringBuilder stringBuilder = new StringBuilder();
        for (IntrospectedColumn introspectedColumn : introspectedTable.getAllColumns()) {
            stringBuilder.append(introspectedColumn.getActualColumnName()+",");
        }
        String str = stringBuilder.toString();
        str = str.substring(0, str.lastIndexOf(","));
        columnSql.addElement(new TextElement(str));
        return columnSql;
    }

    @Override
    public boolean sqlMapInsertElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        //element.
        System.out.println(element);
        return false;
    }

    @Override
    public boolean sqlMapUpdateByExampleSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapUpdateByExampleWithBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapUpdateByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapDeleteByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    public boolean sqlMapUpdateByPrimaryKeySelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    public boolean sqlMapUpdateByPrimaryKeyWithBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return true;
    }

    @Override
    public boolean sqlMapExampleWhereClauseElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapSelectByExampleWithBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapSelectByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        element.getAttributes().remove(0);
        element.getAttributes().add(0,new Attribute("id", "getByPrimaryKey"));
        return true;
    }

    /**
     * 根据条件查询数量
     * @param element
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean sqlMapCountByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }


    /**
     * 根据主键修改单条数据
     * @param element
     * @param introspectedTable
     * @return
     */
    public boolean sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        element.getAttributes().remove(0);
        element.getAttributes().add(0,new Attribute("id", "update"));
        return true;
    }

    /**
     * 重写根据主键单条删除数据的方法
     * @param element
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean sqlMapDeleteByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        element.getAttributes().remove(0);
        element.getAttributes().add(0,new Attribute("id", "delete"));
        return true;
    }

    /**
     * 重写新增一条数据的方法
     * @param element
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        element.getAttributes().remove(0);
        element.getAttributes().add(0,new Attribute("id", "insert"));
        return true;
    }

}
