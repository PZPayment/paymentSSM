package com.payment.generator.domain;

import com.payment.comm.base.domain.AbstractCriteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PayChargeOrderCriteria extends AbstractCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayChargeOrderCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andChargeNoIsNull() {
            addCriterion("CHARGE_NO is null");
            return (Criteria) this;
        }

        public Criteria andChargeNoIsNotNull() {
            addCriterion("CHARGE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andChargeNoEqualTo(String value) {
            addCriterion("CHARGE_NO =", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoNotEqualTo(String value) {
            addCriterion("CHARGE_NO <>", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoGreaterThan(String value) {
            addCriterion("CHARGE_NO >", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_NO >=", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoLessThan(String value) {
            addCriterion("CHARGE_NO <", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_NO <=", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoLike(String value) {
            addCriterion("CHARGE_NO like", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoNotLike(String value) {
            addCriterion("CHARGE_NO not like", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoIn(List<String> values) {
            addCriterion("CHARGE_NO in", values, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoNotIn(List<String> values) {
            addCriterion("CHARGE_NO not in", values, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoBetween(String value1, String value2) {
            addCriterion("CHARGE_NO between", value1, value2, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoNotBetween(String value1, String value2) {
            addCriterion("CHARGE_NO not between", value1, value2, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeAmountIsNull() {
            addCriterion("CHARGE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andChargeAmountIsNotNull() {
            addCriterion("CHARGE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andChargeAmountEqualTo(Long value) {
            addCriterion("CHARGE_AMOUNT =", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountNotEqualTo(Long value) {
            addCriterion("CHARGE_AMOUNT <>", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountGreaterThan(Long value) {
            addCriterion("CHARGE_AMOUNT >", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("CHARGE_AMOUNT >=", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountLessThan(Long value) {
            addCriterion("CHARGE_AMOUNT <", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountLessThanOrEqualTo(Long value) {
            addCriterion("CHARGE_AMOUNT <=", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountIn(List<Long> values) {
            addCriterion("CHARGE_AMOUNT in", values, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountNotIn(List<Long> values) {
            addCriterion("CHARGE_AMOUNT not in", values, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountBetween(Long value1, Long value2) {
            addCriterion("CHARGE_AMOUNT between", value1, value2, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountNotBetween(Long value1, Long value2) {
            addCriterion("CHARGE_AMOUNT not between", value1, value2, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeStateIsNull() {
            addCriterion("CHARGE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andChargeStateIsNotNull() {
            addCriterion("CHARGE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andChargeStateEqualTo(Short value) {
            addCriterion("CHARGE_STATE =", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateNotEqualTo(Short value) {
            addCriterion("CHARGE_STATE <>", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateGreaterThan(Short value) {
            addCriterion("CHARGE_STATE >", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateGreaterThanOrEqualTo(Short value) {
            addCriterion("CHARGE_STATE >=", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateLessThan(Short value) {
            addCriterion("CHARGE_STATE <", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateLessThanOrEqualTo(Short value) {
            addCriterion("CHARGE_STATE <=", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateIn(List<Short> values) {
            addCriterion("CHARGE_STATE in", values, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateNotIn(List<Short> values) {
            addCriterion("CHARGE_STATE not in", values, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateBetween(Short value1, Short value2) {
            addCriterion("CHARGE_STATE between", value1, value2, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateNotBetween(Short value1, Short value2) {
            addCriterion("CHARGE_STATE not between", value1, value2, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIsNull() {
            addCriterion("CHARGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIsNotNull() {
            addCriterion("CHARGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CHARGE_TIME =", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHARGE_TIME <>", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CHARGE_TIME >", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHARGE_TIME >=", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeLessThan(Date value) {
            addCriterionForJDBCDate("CHARGE_TIME <", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHARGE_TIME <=", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CHARGE_TIME in", values, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHARGE_TIME not in", values, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHARGE_TIME between", value1, value2, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHARGE_TIME not between", value1, value2, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNull() {
            addCriterion("DEAL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNotNull() {
            addCriterion("DEAL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDealTimeEqualTo(Date value) {
            addCriterionForJDBCDate("DEAL_TIME =", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEAL_TIME <>", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DEAL_TIME >", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEAL_TIME >=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThan(Date value) {
            addCriterionForJDBCDate("DEAL_TIME <", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEAL_TIME <=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIn(List<Date> values) {
            addCriterionForJDBCDate("DEAL_TIME in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEAL_TIME not in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEAL_TIME between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEAL_TIME not between", value1, value2, "dealTime");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoIsNull() {
            addCriterion("OUT_CHARGE_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoIsNotNull() {
            addCriterion("OUT_CHARGE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoEqualTo(String value) {
            addCriterion("OUT_CHARGE_NO =", value, "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoNotEqualTo(String value) {
            addCriterion("OUT_CHARGE_NO <>", value, "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoGreaterThan(String value) {
            addCriterion("OUT_CHARGE_NO >", value, "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_CHARGE_NO >=", value, "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoLessThan(String value) {
            addCriterion("OUT_CHARGE_NO <", value, "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_CHARGE_NO <=", value, "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoLike(String value) {
            addCriterion("OUT_CHARGE_NO like", value, "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoNotLike(String value) {
            addCriterion("OUT_CHARGE_NO not like", value, "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoIn(List<String> values) {
            addCriterion("OUT_CHARGE_NO in", values, "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoNotIn(List<String> values) {
            addCriterion("OUT_CHARGE_NO not in", values, "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoBetween(String value1, String value2) {
            addCriterion("OUT_CHARGE_NO between", value1, value2, "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoNotBetween(String value1, String value2) {
            addCriterion("OUT_CHARGE_NO not between", value1, value2, "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andPayFlagIsNull() {
            addCriterion("PAY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPayFlagIsNotNull() {
            addCriterion("PAY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPayFlagEqualTo(Short value) {
            addCriterion("PAY_FLAG =", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotEqualTo(Short value) {
            addCriterion("PAY_FLAG <>", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThan(Short value) {
            addCriterion("PAY_FLAG >", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("PAY_FLAG >=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThan(Short value) {
            addCriterion("PAY_FLAG <", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThanOrEqualTo(Short value) {
            addCriterion("PAY_FLAG <=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagIn(List<Short> values) {
            addCriterion("PAY_FLAG in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotIn(List<Short> values) {
            addCriterion("PAY_FLAG not in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagBetween(Short value1, Short value2) {
            addCriterion("PAY_FLAG between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotBetween(Short value1, Short value2) {
            addCriterion("PAY_FLAG not between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andChargeNoLikeInsensitive(String value) {
            addCriterion("upper(CHARGE_NO) like", value.toUpperCase(), "chargeNo");
            return (Criteria) this;
        }

        public Criteria andUserIdLikeInsensitive(String value) {
            addCriterion("upper(USER_ID) like", value.toUpperCase(), "userId");
            return (Criteria) this;
        }

        public Criteria andOutChargeNoLikeInsensitive(String value) {
            addCriterion("upper(OUT_CHARGE_NO) like", value.toUpperCase(), "outChargeNo");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
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