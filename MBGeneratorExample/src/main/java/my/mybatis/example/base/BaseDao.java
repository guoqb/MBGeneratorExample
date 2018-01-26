package my.mybatis.example.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * BaseMapper 基类
 * @param <T> 表示与table表对应的实体类（Entity）
 * @param <PK> 表示可能会用到主键 (比如Integer等)
 */
public interface BaseDao<T, PK extends Serializable> {

    /**
     * 新增
     * @param entity
     * @return
     */
    int insert(T entity);

    /**
     * 删除
     * @param id 主键
     * @return
     */
    int delete(PK id);

    /**
     * 修改
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 获取符合条件参数的所有数据
     * @param entity
     * @return
     */
    List<T> getList(T entity);

    /**
     * 获取符合条件的单条数据
     * @param entity
     * @return
     */
    T getOne(T entity);

    /**
     * 根据id获取指定的数据
     * @param id
     * @return
     */
    T getByPrimaryKey(PK id);


    /**
     * 根据Map参数查询分页数据(Key: sortClumn - 排序字段,pageNo - 当前页码,pageSize - 页大小,以及对应的属性参数名)
     * eg: paramMap.put("sortClumn","CREATE_TIME");
     * eg: paramMap.put("pageNo",1);
     * eg: paramMap.put("pageSize",10);
     * eg: paramMap.put("stCode",stTaskInfo.getStCode());
     * eg: paramMap.put("stName",stTaskInfo.getStName());
     * @param paramMap
     * @return
     */
    List<T> getPageData(Map<String,Object> paramMap);

    /**
     * 根据参数符合条件的数据总量,参考 getPageData
     * @param paramMap
     * @return
     */
    Long getPageCount(Map<String,Object> paramMap);

}