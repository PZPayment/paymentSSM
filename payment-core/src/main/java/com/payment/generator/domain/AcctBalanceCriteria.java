package com.payment.generator.domain;

import com.payment.comm.base.domain.AbstractCriteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AcctBalanceCriteria extends AbstractCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctBalanceCriteria() {
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

        public Criteria andBalanceIdIsNull() {
            addCriterion("BALANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIdIsNotNull() {
            addCriterion("BALANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceIdEqualTo(Long value) {
            addCriterion("BALANCE_ID =", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdNotEqualTo(Long value) {
            addCriterion("BALANCE_ID <>", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdGreaterThan(Long value) {
            addCriterion("BALANCE_ID >", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BALANCE_ID >=", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdLessThan(Long value) {
            addCriterion("BALANCE_ID <", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdLessThanOrEqualTo(Long value) {
            addCriterion("BALANCE_ID <=", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdIn(List<Long> values) {
            addCriterion("BALANCE_ID in", values, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdNotIn(List<Long> values) {
            addCriterion("BALANCE_ID not in", values, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdBetween(Long value1, Long value2) {
            addCriterion("BALANCE_ID between", value1, value2, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdNotBetween(Long value1, Long value2) {
            addCriterion("BALANCE_ID not between", value1, value2, "balanceId");
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

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Long value) {
            addCriterion("BALANCE =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Long value) {
            addCriterion("BALANCE <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Long value) {
            addCriterion("BALANCE >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("BALANCE >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Long value) {
            addCriterion("BALANCE <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Long value) {
            addCriterion("BALANCE <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Long> values) {
            addCriterion("BALANCE in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Long> values) {
            addCriterion("BALANCE not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Long value1, Long value2) {
            addCriterion("BALANCE between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Long value1, Long value2) {
            addCriterion("BALANCE not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceStateIsNull() {
            addCriterion("BALANCE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceStateIsNotNull() {
            addCriterion("BALANCE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceStateEqualTo(Short value) {
            addCriterion("BALANCE_STATE =", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateNotEqualTo(Short value) {
            addCriterion("BALANCE_STATE <>", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateGreaterThan(Short value) {
            addCriterion("BALANCE_STATE >", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateGreaterThanOrEqualTo(Short value) {
            addCriterion("BALANCE_STATE >=", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateLessThan(Short value) {
            addCriterion("BALANCE_STATE <", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateLessThanOrEqualTo(Short value) {
            addCriterion("BALANCE_STATE <=", value, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateIn(List<Short> values) {
            addCriterion("BALANCE_STATE in", values, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateNotIn(List<Short> values) {
            addCriterion("BALANCE_STATE not in", values, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateBetween(Short value1, Short value2) {
            addCriterion("BALANCE_STATE between", value1, value2, "balanceState");
            return (Criteria) this;
        }

        public Criteria andBalanceStateNotBetween(Short value1, Short value2) {
            addCriterion("BALANCE_STATE not between", value1, value2, "balanceState");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNull() {
            addCriterion("LAST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNotNull() {
            addCriterion("LAST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastDateEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_DATE =", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_DATE <>", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LAST_DATE >", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_DATE >=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThan(Date value) {
            addCriterionForJDBCDate("LAST_DATE <", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_DATE <=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_DATE in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_DATE not in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_DATE between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_DATE not between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andUserIdLikeInsensitive(String value) {
            addCriterion("upper(USER_ID) like", value.toUpperCase(), "userId");
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