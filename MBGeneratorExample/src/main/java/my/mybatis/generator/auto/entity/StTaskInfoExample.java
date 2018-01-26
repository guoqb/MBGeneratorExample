package my.mybatis.generator.auto.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StTaskInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StTaskInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStIdIsNull() {
            addCriterion("ST_ID is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("ST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(Long value) {
            addCriterion("ST_ID =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(Long value) {
            addCriterion("ST_ID <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(Long value) {
            addCriterion("ST_ID >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ST_ID >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(Long value) {
            addCriterion("ST_ID <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(Long value) {
            addCriterion("ST_ID <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<Long> values) {
            addCriterion("ST_ID in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<Long> values) {
            addCriterion("ST_ID not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(Long value1, Long value2) {
            addCriterion("ST_ID between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(Long value1, Long value2) {
            addCriterion("ST_ID not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStCodeIsNull() {
            addCriterion("ST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStCodeIsNotNull() {
            addCriterion("ST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStCodeEqualTo(String value) {
            addCriterion("ST_CODE =", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeNotEqualTo(String value) {
            addCriterion("ST_CODE <>", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeGreaterThan(String value) {
            addCriterion("ST_CODE >", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ST_CODE >=", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeLessThan(String value) {
            addCriterion("ST_CODE <", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeLessThanOrEqualTo(String value) {
            addCriterion("ST_CODE <=", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeLike(String value) {
            addCriterion("ST_CODE like", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeNotLike(String value) {
            addCriterion("ST_CODE not like", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeIn(List<String> values) {
            addCriterion("ST_CODE in", values, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeNotIn(List<String> values) {
            addCriterion("ST_CODE not in", values, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeBetween(String value1, String value2) {
            addCriterion("ST_CODE between", value1, value2, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeNotBetween(String value1, String value2) {
            addCriterion("ST_CODE not between", value1, value2, "stCode");
            return (Criteria) this;
        }

        public Criteria andStLogoIsNull() {
            addCriterion("ST_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andStLogoIsNotNull() {
            addCriterion("ST_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andStLogoEqualTo(String value) {
            addCriterion("ST_LOGO =", value, "stLogo");
            return (Criteria) this;
        }

        public Criteria andStLogoNotEqualTo(String value) {
            addCriterion("ST_LOGO <>", value, "stLogo");
            return (Criteria) this;
        }

        public Criteria andStLogoGreaterThan(String value) {
            addCriterion("ST_LOGO >", value, "stLogo");
            return (Criteria) this;
        }

        public Criteria andStLogoGreaterThanOrEqualTo(String value) {
            addCriterion("ST_LOGO >=", value, "stLogo");
            return (Criteria) this;
        }

        public Criteria andStLogoLessThan(String value) {
            addCriterion("ST_LOGO <", value, "stLogo");
            return (Criteria) this;
        }

        public Criteria andStLogoLessThanOrEqualTo(String value) {
            addCriterion("ST_LOGO <=", value, "stLogo");
            return (Criteria) this;
        }

        public Criteria andStLogoLike(String value) {
            addCriterion("ST_LOGO like", value, "stLogo");
            return (Criteria) this;
        }

        public Criteria andStLogoNotLike(String value) {
            addCriterion("ST_LOGO not like", value, "stLogo");
            return (Criteria) this;
        }

        public Criteria andStLogoIn(List<String> values) {
            addCriterion("ST_LOGO in", values, "stLogo");
            return (Criteria) this;
        }

        public Criteria andStLogoNotIn(List<String> values) {
            addCriterion("ST_LOGO not in", values, "stLogo");
            return (Criteria) this;
        }

        public Criteria andStLogoBetween(String value1, String value2) {
            addCriterion("ST_LOGO between", value1, value2, "stLogo");
            return (Criteria) this;
        }

        public Criteria andStLogoNotBetween(String value1, String value2) {
            addCriterion("ST_LOGO not between", value1, value2, "stLogo");
            return (Criteria) this;
        }

        public Criteria andStNameIsNull() {
            addCriterion("ST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStNameIsNotNull() {
            addCriterion("ST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStNameEqualTo(String value) {
            addCriterion("ST_NAME =", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotEqualTo(String value) {
            addCriterion("ST_NAME <>", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThan(String value) {
            addCriterion("ST_NAME >", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThanOrEqualTo(String value) {
            addCriterion("ST_NAME >=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThan(String value) {
            addCriterion("ST_NAME <", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThanOrEqualTo(String value) {
            addCriterion("ST_NAME <=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLike(String value) {
            addCriterion("ST_NAME like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotLike(String value) {
            addCriterion("ST_NAME not like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameIn(List<String> values) {
            addCriterion("ST_NAME in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotIn(List<String> values) {
            addCriterion("ST_NAME not in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameBetween(String value1, String value2) {
            addCriterion("ST_NAME between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotBetween(String value1, String value2) {
            addCriterion("ST_NAME not between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStAmountIsNull() {
            addCriterion("ST_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andStAmountIsNotNull() {
            addCriterion("ST_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andStAmountEqualTo(BigDecimal value) {
            addCriterion("ST_AMOUNT =", value, "stAmount");
            return (Criteria) this;
        }

        public Criteria andStAmountNotEqualTo(BigDecimal value) {
            addCriterion("ST_AMOUNT <>", value, "stAmount");
            return (Criteria) this;
        }

        public Criteria andStAmountGreaterThan(BigDecimal value) {
            addCriterion("ST_AMOUNT >", value, "stAmount");
            return (Criteria) this;
        }

        public Criteria andStAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ST_AMOUNT >=", value, "stAmount");
            return (Criteria) this;
        }

        public Criteria andStAmountLessThan(BigDecimal value) {
            addCriterion("ST_AMOUNT <", value, "stAmount");
            return (Criteria) this;
        }

        public Criteria andStAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ST_AMOUNT <=", value, "stAmount");
            return (Criteria) this;
        }

        public Criteria andStAmountIn(List<BigDecimal> values) {
            addCriterion("ST_AMOUNT in", values, "stAmount");
            return (Criteria) this;
        }

        public Criteria andStAmountNotIn(List<BigDecimal> values) {
            addCriterion("ST_AMOUNT not in", values, "stAmount");
            return (Criteria) this;
        }

        public Criteria andStAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ST_AMOUNT between", value1, value2, "stAmount");
            return (Criteria) this;
        }

        public Criteria andStAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ST_AMOUNT not between", value1, value2, "stAmount");
            return (Criteria) this;
        }

        public Criteria andProviceCodeIsNull() {
            addCriterion("PROVICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProviceCodeIsNotNull() {
            addCriterion("PROVICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProviceCodeEqualTo(String value) {
            addCriterion("PROVICE_CODE =", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeNotEqualTo(String value) {
            addCriterion("PROVICE_CODE <>", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeGreaterThan(String value) {
            addCriterion("PROVICE_CODE >", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVICE_CODE >=", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeLessThan(String value) {
            addCriterion("PROVICE_CODE <", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVICE_CODE <=", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeLike(String value) {
            addCriterion("PROVICE_CODE like", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeNotLike(String value) {
            addCriterion("PROVICE_CODE not like", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeIn(List<String> values) {
            addCriterion("PROVICE_CODE in", values, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeNotIn(List<String> values) {
            addCriterion("PROVICE_CODE not in", values, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeBetween(String value1, String value2) {
            addCriterion("PROVICE_CODE between", value1, value2, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeNotBetween(String value1, String value2) {
            addCriterion("PROVICE_CODE not between", value1, value2, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongIsNull() {
            addCriterion("WORK_ADDR_LONG is null");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongIsNotNull() {
            addCriterion("WORK_ADDR_LONG is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongEqualTo(String value) {
            addCriterion("WORK_ADDR_LONG =", value, "workAddrLong");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongNotEqualTo(String value) {
            addCriterion("WORK_ADDR_LONG <>", value, "workAddrLong");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongGreaterThan(String value) {
            addCriterion("WORK_ADDR_LONG >", value, "workAddrLong");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_ADDR_LONG >=", value, "workAddrLong");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongLessThan(String value) {
            addCriterion("WORK_ADDR_LONG <", value, "workAddrLong");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongLessThanOrEqualTo(String value) {
            addCriterion("WORK_ADDR_LONG <=", value, "workAddrLong");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongLike(String value) {
            addCriterion("WORK_ADDR_LONG like", value, "workAddrLong");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongNotLike(String value) {
            addCriterion("WORK_ADDR_LONG not like", value, "workAddrLong");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongIn(List<String> values) {
            addCriterion("WORK_ADDR_LONG in", values, "workAddrLong");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongNotIn(List<String> values) {
            addCriterion("WORK_ADDR_LONG not in", values, "workAddrLong");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongBetween(String value1, String value2) {
            addCriterion("WORK_ADDR_LONG between", value1, value2, "workAddrLong");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLongNotBetween(String value1, String value2) {
            addCriterion("WORK_ADDR_LONG not between", value1, value2, "workAddrLong");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatIsNull() {
            addCriterion("WORK_ADDR_LAT is null");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatIsNotNull() {
            addCriterion("WORK_ADDR_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatEqualTo(String value) {
            addCriterion("WORK_ADDR_LAT =", value, "workAddrLat");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatNotEqualTo(String value) {
            addCriterion("WORK_ADDR_LAT <>", value, "workAddrLat");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatGreaterThan(String value) {
            addCriterion("WORK_ADDR_LAT >", value, "workAddrLat");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_ADDR_LAT >=", value, "workAddrLat");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatLessThan(String value) {
            addCriterion("WORK_ADDR_LAT <", value, "workAddrLat");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatLessThanOrEqualTo(String value) {
            addCriterion("WORK_ADDR_LAT <=", value, "workAddrLat");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatLike(String value) {
            addCriterion("WORK_ADDR_LAT like", value, "workAddrLat");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatNotLike(String value) {
            addCriterion("WORK_ADDR_LAT not like", value, "workAddrLat");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatIn(List<String> values) {
            addCriterion("WORK_ADDR_LAT in", values, "workAddrLat");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatNotIn(List<String> values) {
            addCriterion("WORK_ADDR_LAT not in", values, "workAddrLat");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatBetween(String value1, String value2) {
            addCriterion("WORK_ADDR_LAT between", value1, value2, "workAddrLat");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLatNotBetween(String value1, String value2) {
            addCriterion("WORK_ADDR_LAT not between", value1, value2, "workAddrLat");
            return (Criteria) this;
        }

        public Criteria andStSignupEndtimeIsNull() {
            addCriterion("ST_SIGNUP_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andStSignupEndtimeIsNotNull() {
            addCriterion("ST_SIGNUP_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStSignupEndtimeEqualTo(Date value) {
            addCriterion("ST_SIGNUP_ENDTIME =", value, "stSignupEndtime");
            return (Criteria) this;
        }

        public Criteria andStSignupEndtimeNotEqualTo(Date value) {
            addCriterion("ST_SIGNUP_ENDTIME <>", value, "stSignupEndtime");
            return (Criteria) this;
        }

        public Criteria andStSignupEndtimeGreaterThan(Date value) {
            addCriterion("ST_SIGNUP_ENDTIME >", value, "stSignupEndtime");
            return (Criteria) this;
        }

        public Criteria andStSignupEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ST_SIGNUP_ENDTIME >=", value, "stSignupEndtime");
            return (Criteria) this;
        }

        public Criteria andStSignupEndtimeLessThan(Date value) {
            addCriterion("ST_SIGNUP_ENDTIME <", value, "stSignupEndtime");
            return (Criteria) this;
        }

        public Criteria andStSignupEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("ST_SIGNUP_ENDTIME <=", value, "stSignupEndtime");
            return (Criteria) this;
        }

        public Criteria andStSignupEndtimeIn(List<Date> values) {
            addCriterion("ST_SIGNUP_ENDTIME in", values, "stSignupEndtime");
            return (Criteria) this;
        }

        public Criteria andStSignupEndtimeNotIn(List<Date> values) {
            addCriterion("ST_SIGNUP_ENDTIME not in", values, "stSignupEndtime");
            return (Criteria) this;
        }

        public Criteria andStSignupEndtimeBetween(Date value1, Date value2) {
            addCriterion("ST_SIGNUP_ENDTIME between", value1, value2, "stSignupEndtime");
            return (Criteria) this;
        }

        public Criteria andStSignupEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("ST_SIGNUP_ENDTIME not between", value1, value2, "stSignupEndtime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE_ is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE_ is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("STATE_ =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("STATE_ <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("STATE_ >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("STATE_ >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("STATE_ <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("STATE_ <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("STATE_ in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("STATE_ not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("STATE_ between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("STATE_ not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("ENABLE_ is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("ENABLE_ is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Byte value) {
            addCriterion("ENABLE_ =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Byte value) {
            addCriterion("ENABLE_ <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Byte value) {
            addCriterion("ENABLE_ >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Byte value) {
            addCriterion("ENABLE_ >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Byte value) {
            addCriterion("ENABLE_ <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Byte value) {
            addCriterion("ENABLE_ <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Byte> values) {
            addCriterion("ENABLE_ in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Byte> values) {
            addCriterion("ENABLE_ not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Byte value1, Byte value2) {
            addCriterion("ENABLE_ between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("ENABLE_ not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andEntryCountIsNull() {
            addCriterion("ENTRY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andEntryCountIsNotNull() {
            addCriterion("ENTRY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andEntryCountEqualTo(Integer value) {
            addCriterion("ENTRY_COUNT =", value, "entryCount");
            return (Criteria) this;
        }

        public Criteria andEntryCountNotEqualTo(Integer value) {
            addCriterion("ENTRY_COUNT <>", value, "entryCount");
            return (Criteria) this;
        }

        public Criteria andEntryCountGreaterThan(Integer value) {
            addCriterion("ENTRY_COUNT >", value, "entryCount");
            return (Criteria) this;
        }

        public Criteria andEntryCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTRY_COUNT >=", value, "entryCount");
            return (Criteria) this;
        }

        public Criteria andEntryCountLessThan(Integer value) {
            addCriterion("ENTRY_COUNT <", value, "entryCount");
            return (Criteria) this;
        }

        public Criteria andEntryCountLessThanOrEqualTo(Integer value) {
            addCriterion("ENTRY_COUNT <=", value, "entryCount");
            return (Criteria) this;
        }

        public Criteria andEntryCountIn(List<Integer> values) {
            addCriterion("ENTRY_COUNT in", values, "entryCount");
            return (Criteria) this;
        }

        public Criteria andEntryCountNotIn(List<Integer> values) {
            addCriterion("ENTRY_COUNT not in", values, "entryCount");
            return (Criteria) this;
        }

        public Criteria andEntryCountBetween(Integer value1, Integer value2) {
            addCriterion("ENTRY_COUNT between", value1, value2, "entryCount");
            return (Criteria) this;
        }

        public Criteria andEntryCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTRY_COUNT not between", value1, value2, "entryCount");
            return (Criteria) this;
        }

        public Criteria andDepositPayStateIsNull() {
            addCriterion("DEPOSIT_PAY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andDepositPayStateIsNotNull() {
            addCriterion("DEPOSIT_PAY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andDepositPayStateEqualTo(Byte value) {
            addCriterion("DEPOSIT_PAY_STATE =", value, "depositPayState");
            return (Criteria) this;
        }

        public Criteria andDepositPayStateNotEqualTo(Byte value) {
            addCriterion("DEPOSIT_PAY_STATE <>", value, "depositPayState");
            return (Criteria) this;
        }

        public Criteria andDepositPayStateGreaterThan(Byte value) {
            addCriterion("DEPOSIT_PAY_STATE >", value, "depositPayState");
            return (Criteria) this;
        }

        public Criteria andDepositPayStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("DEPOSIT_PAY_STATE >=", value, "depositPayState");
            return (Criteria) this;
        }

        public Criteria andDepositPayStateLessThan(Byte value) {
            addCriterion("DEPOSIT_PAY_STATE <", value, "depositPayState");
            return (Criteria) this;
        }

        public Criteria andDepositPayStateLessThanOrEqualTo(Byte value) {
            addCriterion("DEPOSIT_PAY_STATE <=", value, "depositPayState");
            return (Criteria) this;
        }

        public Criteria andDepositPayStateIn(List<Byte> values) {
            addCriterion("DEPOSIT_PAY_STATE in", values, "depositPayState");
            return (Criteria) this;
        }

        public Criteria andDepositPayStateNotIn(List<Byte> values) {
            addCriterion("DEPOSIT_PAY_STATE not in", values, "depositPayState");
            return (Criteria) this;
        }

        public Criteria andDepositPayStateBetween(Byte value1, Byte value2) {
            addCriterion("DEPOSIT_PAY_STATE between", value1, value2, "depositPayState");
            return (Criteria) this;
        }

        public Criteria andDepositPayStateNotBetween(Byte value1, Byte value2) {
            addCriterion("DEPOSIT_PAY_STATE not between", value1, value2, "depositPayState");
            return (Criteria) this;
        }

        public Criteria andPreStateIsNull() {
            addCriterion("PRE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPreStateIsNotNull() {
            addCriterion("PRE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPreStateEqualTo(Integer value) {
            addCriterion("PRE_STATE =", value, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateNotEqualTo(Integer value) {
            addCriterion("PRE_STATE <>", value, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateGreaterThan(Integer value) {
            addCriterion("PRE_STATE >", value, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRE_STATE >=", value, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateLessThan(Integer value) {
            addCriterion("PRE_STATE <", value, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateLessThanOrEqualTo(Integer value) {
            addCriterion("PRE_STATE <=", value, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateIn(List<Integer> values) {
            addCriterion("PRE_STATE in", values, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateNotIn(List<Integer> values) {
            addCriterion("PRE_STATE not in", values, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateBetween(Integer value1, Integer value2) {
            addCriterion("PRE_STATE between", value1, value2, "preState");
            return (Criteria) this;
        }

        public Criteria andPreStateNotBetween(Integer value1, Integer value2) {
            addCriterion("PRE_STATE not between", value1, value2, "preState");
            return (Criteria) this;
        }

        public Criteria andIsApplyTransferIsNull() {
            addCriterion("IS_APPLY_TRANSFER is null");
            return (Criteria) this;
        }

        public Criteria andIsApplyTransferIsNotNull() {
            addCriterion("IS_APPLY_TRANSFER is not null");
            return (Criteria) this;
        }

        public Criteria andIsApplyTransferEqualTo(Byte value) {
            addCriterion("IS_APPLY_TRANSFER =", value, "isApplyTransfer");
            return (Criteria) this;
        }

        public Criteria andIsApplyTransferNotEqualTo(Byte value) {
            addCriterion("IS_APPLY_TRANSFER <>", value, "isApplyTransfer");
            return (Criteria) this;
        }

        public Criteria andIsApplyTransferGreaterThan(Byte value) {
            addCriterion("IS_APPLY_TRANSFER >", value, "isApplyTransfer");
            return (Criteria) this;
        }

        public Criteria andIsApplyTransferGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_APPLY_TRANSFER >=", value, "isApplyTransfer");
            return (Criteria) this;
        }

        public Criteria andIsApplyTransferLessThan(Byte value) {
            addCriterion("IS_APPLY_TRANSFER <", value, "isApplyTransfer");
            return (Criteria) this;
        }

        public Criteria andIsApplyTransferLessThanOrEqualTo(Byte value) {
            addCriterion("IS_APPLY_TRANSFER <=", value, "isApplyTransfer");
            return (Criteria) this;
        }

        public Criteria andIsApplyTransferIn(List<Byte> values) {
            addCriterion("IS_APPLY_TRANSFER in", values, "isApplyTransfer");
            return (Criteria) this;
        }

        public Criteria andIsApplyTransferNotIn(List<Byte> values) {
            addCriterion("IS_APPLY_TRANSFER not in", values, "isApplyTransfer");
            return (Criteria) this;
        }

        public Criteria andIsApplyTransferBetween(Byte value1, Byte value2) {
            addCriterion("IS_APPLY_TRANSFER between", value1, value2, "isApplyTransfer");
            return (Criteria) this;
        }

        public Criteria andIsApplyTransferNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_APPLY_TRANSFER not between", value1, value2, "isApplyTransfer");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIsNull() {
            addCriterion("CURRENT_NODE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIsNotNull() {
            addCriterion("CURRENT_NODE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeEqualTo(Long value) {
            addCriterion("CURRENT_NODE =", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNotEqualTo(Long value) {
            addCriterion("CURRENT_NODE <>", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeGreaterThan(Long value) {
            addCriterion("CURRENT_NODE >", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENT_NODE >=", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeLessThan(Long value) {
            addCriterion("CURRENT_NODE <", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeLessThanOrEqualTo(Long value) {
            addCriterion("CURRENT_NODE <=", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIn(List<Long> values) {
            addCriterion("CURRENT_NODE in", values, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNotIn(List<Long> values) {
            addCriterion("CURRENT_NODE not in", values, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeBetween(Long value1, Long value2) {
            addCriterion("CURRENT_NODE between", value1, value2, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNotBetween(Long value1, Long value2) {
            addCriterion("CURRENT_NODE not between", value1, value2, "currentNode");
            return (Criteria) this;
        }

        public Criteria andStSendSourceIsNull() {
            addCriterion("ST_SEND_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andStSendSourceIsNotNull() {
            addCriterion("ST_SEND_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andStSendSourceEqualTo(Byte value) {
            addCriterion("ST_SEND_SOURCE =", value, "stSendSource");
            return (Criteria) this;
        }

        public Criteria andStSendSourceNotEqualTo(Byte value) {
            addCriterion("ST_SEND_SOURCE <>", value, "stSendSource");
            return (Criteria) this;
        }

        public Criteria andStSendSourceGreaterThan(Byte value) {
            addCriterion("ST_SEND_SOURCE >", value, "stSendSource");
            return (Criteria) this;
        }

        public Criteria andStSendSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("ST_SEND_SOURCE >=", value, "stSendSource");
            return (Criteria) this;
        }

        public Criteria andStSendSourceLessThan(Byte value) {
            addCriterion("ST_SEND_SOURCE <", value, "stSendSource");
            return (Criteria) this;
        }

        public Criteria andStSendSourceLessThanOrEqualTo(Byte value) {
            addCriterion("ST_SEND_SOURCE <=", value, "stSendSource");
            return (Criteria) this;
        }

        public Criteria andStSendSourceIn(List<Byte> values) {
            addCriterion("ST_SEND_SOURCE in", values, "stSendSource");
            return (Criteria) this;
        }

        public Criteria andStSendSourceNotIn(List<Byte> values) {
            addCriterion("ST_SEND_SOURCE not in", values, "stSendSource");
            return (Criteria) this;
        }

        public Criteria andStSendSourceBetween(Byte value1, Byte value2) {
            addCriterion("ST_SEND_SOURCE between", value1, value2, "stSendSource");
            return (Criteria) this;
        }

        public Criteria andStSendSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("ST_SEND_SOURCE not between", value1, value2, "stSendSource");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdIsNull() {
            addCriterion("FOLLOW_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdIsNotNull() {
            addCriterion("FOLLOW_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdEqualTo(Long value) {
            addCriterion("FOLLOW_USER_ID =", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdNotEqualTo(Long value) {
            addCriterion("FOLLOW_USER_ID <>", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdGreaterThan(Long value) {
            addCriterion("FOLLOW_USER_ID >", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FOLLOW_USER_ID >=", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdLessThan(Long value) {
            addCriterion("FOLLOW_USER_ID <", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdLessThanOrEqualTo(Long value) {
            addCriterion("FOLLOW_USER_ID <=", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdIn(List<Long> values) {
            addCriterion("FOLLOW_USER_ID in", values, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdNotIn(List<Long> values) {
            addCriterion("FOLLOW_USER_ID not in", values, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdBetween(Long value1, Long value2) {
            addCriterion("FOLLOW_USER_ID between", value1, value2, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdNotBetween(Long value1, Long value2) {
            addCriterion("FOLLOW_USER_ID not between", value1, value2, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameIsNull() {
            addCriterion("FOLLOW_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameIsNotNull() {
            addCriterion("FOLLOW_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameEqualTo(String value) {
            addCriterion("FOLLOW_USER_NAME =", value, "followUserName");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameNotEqualTo(String value) {
            addCriterion("FOLLOW_USER_NAME <>", value, "followUserName");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameGreaterThan(String value) {
            addCriterion("FOLLOW_USER_NAME >", value, "followUserName");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOW_USER_NAME >=", value, "followUserName");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameLessThan(String value) {
            addCriterion("FOLLOW_USER_NAME <", value, "followUserName");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameLessThanOrEqualTo(String value) {
            addCriterion("FOLLOW_USER_NAME <=", value, "followUserName");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameLike(String value) {
            addCriterion("FOLLOW_USER_NAME like", value, "followUserName");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameNotLike(String value) {
            addCriterion("FOLLOW_USER_NAME not like", value, "followUserName");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameIn(List<String> values) {
            addCriterion("FOLLOW_USER_NAME in", values, "followUserName");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameNotIn(List<String> values) {
            addCriterion("FOLLOW_USER_NAME not in", values, "followUserName");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameBetween(String value1, String value2) {
            addCriterion("FOLLOW_USER_NAME between", value1, value2, "followUserName");
            return (Criteria) this;
        }

        public Criteria andFollowUserNameNotBetween(String value1, String value2) {
            addCriterion("FOLLOW_USER_NAME not between", value1, value2, "followUserName");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameIsNull() {
            addCriterion("CURRENT_NODE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameIsNotNull() {
            addCriterion("CURRENT_NODE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameEqualTo(String value) {
            addCriterion("CURRENT_NODE_NAME =", value, "currentNodeName");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameNotEqualTo(String value) {
            addCriterion("CURRENT_NODE_NAME <>", value, "currentNodeName");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameGreaterThan(String value) {
            addCriterion("CURRENT_NODE_NAME >", value, "currentNodeName");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_NODE_NAME >=", value, "currentNodeName");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameLessThan(String value) {
            addCriterion("CURRENT_NODE_NAME <", value, "currentNodeName");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_NODE_NAME <=", value, "currentNodeName");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameLike(String value) {
            addCriterion("CURRENT_NODE_NAME like", value, "currentNodeName");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameNotLike(String value) {
            addCriterion("CURRENT_NODE_NAME not like", value, "currentNodeName");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameIn(List<String> values) {
            addCriterion("CURRENT_NODE_NAME in", values, "currentNodeName");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameNotIn(List<String> values) {
            addCriterion("CURRENT_NODE_NAME not in", values, "currentNodeName");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameBetween(String value1, String value2) {
            addCriterion("CURRENT_NODE_NAME between", value1, value2, "currentNodeName");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNameNotBetween(String value1, String value2) {
            addCriterion("CURRENT_NODE_NAME not between", value1, value2, "currentNodeName");
            return (Criteria) this;
        }

        public Criteria andNeedFeeIsNull() {
            addCriterion("NEED_FEE is null");
            return (Criteria) this;
        }

        public Criteria andNeedFeeIsNotNull() {
            addCriterion("NEED_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andNeedFeeEqualTo(Byte value) {
            addCriterion("NEED_FEE =", value, "needFee");
            return (Criteria) this;
        }

        public Criteria andNeedFeeNotEqualTo(Byte value) {
            addCriterion("NEED_FEE <>", value, "needFee");
            return (Criteria) this;
        }

        public Criteria andNeedFeeGreaterThan(Byte value) {
            addCriterion("NEED_FEE >", value, "needFee");
            return (Criteria) this;
        }

        public Criteria andNeedFeeGreaterThanOrEqualTo(Byte value) {
            addCriterion("NEED_FEE >=", value, "needFee");
            return (Criteria) this;
        }

        public Criteria andNeedFeeLessThan(Byte value) {
            addCriterion("NEED_FEE <", value, "needFee");
            return (Criteria) this;
        }

        public Criteria andNeedFeeLessThanOrEqualTo(Byte value) {
            addCriterion("NEED_FEE <=", value, "needFee");
            return (Criteria) this;
        }

        public Criteria andNeedFeeIn(List<Byte> values) {
            addCriterion("NEED_FEE in", values, "needFee");
            return (Criteria) this;
        }

        public Criteria andNeedFeeNotIn(List<Byte> values) {
            addCriterion("NEED_FEE not in", values, "needFee");
            return (Criteria) this;
        }

        public Criteria andNeedFeeBetween(Byte value1, Byte value2) {
            addCriterion("NEED_FEE between", value1, value2, "needFee");
            return (Criteria) this;
        }

        public Criteria andNeedFeeNotBetween(Byte value1, Byte value2) {
            addCriterion("NEED_FEE not between", value1, value2, "needFee");
            return (Criteria) this;
        }

        public Criteria andExamineStateIsNull() {
            addCriterion("EXAMINE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andExamineStateIsNotNull() {
            addCriterion("EXAMINE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andExamineStateEqualTo(Byte value) {
            addCriterion("EXAMINE_STATE =", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateNotEqualTo(Byte value) {
            addCriterion("EXAMINE_STATE <>", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateGreaterThan(Byte value) {
            addCriterion("EXAMINE_STATE >", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("EXAMINE_STATE >=", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateLessThan(Byte value) {
            addCriterion("EXAMINE_STATE <", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateLessThanOrEqualTo(Byte value) {
            addCriterion("EXAMINE_STATE <=", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateIn(List<Byte> values) {
            addCriterion("EXAMINE_STATE in", values, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateNotIn(List<Byte> values) {
            addCriterion("EXAMINE_STATE not in", values, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateBetween(Byte value1, Byte value2) {
            addCriterion("EXAMINE_STATE between", value1, value2, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateNotBetween(Byte value1, Byte value2) {
            addCriterion("EXAMINE_STATE not between", value1, value2, "examineState");
            return (Criteria) this;
        }

        public Criteria andFeePayStateIsNull() {
            addCriterion("FEE_PAY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andFeePayStateIsNotNull() {
            addCriterion("FEE_PAY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andFeePayStateEqualTo(Byte value) {
            addCriterion("FEE_PAY_STATE =", value, "feePayState");
            return (Criteria) this;
        }

        public Criteria andFeePayStateNotEqualTo(Byte value) {
            addCriterion("FEE_PAY_STATE <>", value, "feePayState");
            return (Criteria) this;
        }

        public Criteria andFeePayStateGreaterThan(Byte value) {
            addCriterion("FEE_PAY_STATE >", value, "feePayState");
            return (Criteria) this;
        }

        public Criteria andFeePayStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("FEE_PAY_STATE >=", value, "feePayState");
            return (Criteria) this;
        }

        public Criteria andFeePayStateLessThan(Byte value) {
            addCriterion("FEE_PAY_STATE <", value, "feePayState");
            return (Criteria) this;
        }

        public Criteria andFeePayStateLessThanOrEqualTo(Byte value) {
            addCriterion("FEE_PAY_STATE <=", value, "feePayState");
            return (Criteria) this;
        }

        public Criteria andFeePayStateIn(List<Byte> values) {
            addCriterion("FEE_PAY_STATE in", values, "feePayState");
            return (Criteria) this;
        }

        public Criteria andFeePayStateNotIn(List<Byte> values) {
            addCriterion("FEE_PAY_STATE not in", values, "feePayState");
            return (Criteria) this;
        }

        public Criteria andFeePayStateBetween(Byte value1, Byte value2) {
            addCriterion("FEE_PAY_STATE between", value1, value2, "feePayState");
            return (Criteria) this;
        }

        public Criteria andFeePayStateNotBetween(Byte value1, Byte value2) {
            addCriterion("FEE_PAY_STATE not between", value1, value2, "feePayState");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIsNull() {
            addCriterion("APPROVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIsNotNull() {
            addCriterion("APPROVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApproveTimeEqualTo(Date value) {
            addCriterion("APPROVE_TIME =", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotEqualTo(Date value) {
            addCriterion("APPROVE_TIME <>", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeGreaterThan(Date value) {
            addCriterion("APPROVE_TIME >", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPROVE_TIME >=", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeLessThan(Date value) {
            addCriterion("APPROVE_TIME <", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeLessThanOrEqualTo(Date value) {
            addCriterion("APPROVE_TIME <=", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIn(List<Date> values) {
            addCriterion("APPROVE_TIME in", values, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotIn(List<Date> values) {
            addCriterion("APPROVE_TIME not in", values, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeBetween(Date value1, Date value2) {
            addCriterion("APPROVE_TIME between", value1, value2, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotBetween(Date value1, Date value2) {
            addCriterion("APPROVE_TIME not between", value1, value2, "approveTime");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("ORIGIN is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("ORIGIN is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(Byte value) {
            addCriterion("ORIGIN =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(Byte value) {
            addCriterion("ORIGIN <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(Byte value) {
            addCriterion("ORIGIN >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(Byte value) {
            addCriterion("ORIGIN >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(Byte value) {
            addCriterion("ORIGIN <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(Byte value) {
            addCriterion("ORIGIN <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<Byte> values) {
            addCriterion("ORIGIN in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<Byte> values) {
            addCriterion("ORIGIN not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(Byte value1, Byte value2) {
            addCriterion("ORIGIN between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(Byte value1, Byte value2) {
            addCriterion("ORIGIN not between", value1, value2, "origin");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}