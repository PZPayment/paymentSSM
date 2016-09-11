package com.payment.domain;

import com.payment.comm.base.domain.AbstractCriteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DepositOrderCriteria extends AbstractCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepositOrderCriteria() {
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

        public Criteria andDepositNoIsNull() {
            addCriterion("DEPOSIT_NO is null");
            return (Criteria) this;
        }

        public Criteria andDepositNoIsNotNull() {
            addCriterion("DEPOSIT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDepositNoEqualTo(String value) {
            addCriterion("DEPOSIT_NO =", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoNotEqualTo(String value) {
            addCriterion("DEPOSIT_NO <>", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoGreaterThan(String value) {
            addCriterion("DEPOSIT_NO >", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEPOSIT_NO >=", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoLessThan(String value) {
            addCriterion("DEPOSIT_NO <", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoLessThanOrEqualTo(String value) {
            addCriterion("DEPOSIT_NO <=", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoLike(String value) {
            addCriterion("DEPOSIT_NO like", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoNotLike(String value) {
            addCriterion("DEPOSIT_NO not like", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoIn(List<String> values) {
            addCriterion("DEPOSIT_NO in", values, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoNotIn(List<String> values) {
            addCriterion("DEPOSIT_NO not in", values, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoBetween(String value1, String value2) {
            addCriterion("DEPOSIT_NO between", value1, value2, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoNotBetween(String value1, String value2) {
            addCriterion("DEPOSIT_NO not between", value1, value2, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNull() {
            addCriterion("DEPOSIT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNotNull() {
            addCriterion("DEPOSIT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountEqualTo(Long value) {
            addCriterion("DEPOSIT_AMOUNT =", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotEqualTo(Long value) {
            addCriterion("DEPOSIT_AMOUNT <>", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThan(Long value) {
            addCriterion("DEPOSIT_AMOUNT >", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPOSIT_AMOUNT >=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThan(Long value) {
            addCriterion("DEPOSIT_AMOUNT <", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThanOrEqualTo(Long value) {
            addCriterion("DEPOSIT_AMOUNT <=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIn(List<Long> values) {
            addCriterion("DEPOSIT_AMOUNT in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotIn(List<Long> values) {
            addCriterion("DEPOSIT_AMOUNT not in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountBetween(Long value1, Long value2) {
            addCriterion("DEPOSIT_AMOUNT between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotBetween(Long value1, Long value2) {
            addCriterion("DEPOSIT_AMOUNT not between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositStateIsNull() {
            addCriterion("DEPOSIT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andDepositStateIsNotNull() {
            addCriterion("DEPOSIT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andDepositStateEqualTo(Short value) {
            addCriterion("DEPOSIT_STATE =", value, "depositState");
            return (Criteria) this;
        }

        public Criteria andDepositStateNotEqualTo(Short value) {
            addCriterion("DEPOSIT_STATE <>", value, "depositState");
            return (Criteria) this;
        }

        public Criteria andDepositStateGreaterThan(Short value) {
            addCriterion("DEPOSIT_STATE >", value, "depositState");
            return (Criteria) this;
        }

        public Criteria andDepositStateGreaterThanOrEqualTo(Short value) {
            addCriterion("DEPOSIT_STATE >=", value, "depositState");
            return (Criteria) this;
        }

        public Criteria andDepositStateLessThan(Short value) {
            addCriterion("DEPOSIT_STATE <", value, "depositState");
            return (Criteria) this;
        }

        public Criteria andDepositStateLessThanOrEqualTo(Short value) {
            addCriterion("DEPOSIT_STATE <=", value, "depositState");
            return (Criteria) this;
        }

        public Criteria andDepositStateIn(List<Short> values) {
            addCriterion("DEPOSIT_STATE in", values, "depositState");
            return (Criteria) this;
        }

        public Criteria andDepositStateNotIn(List<Short> values) {
            addCriterion("DEPOSIT_STATE not in", values, "depositState");
            return (Criteria) this;
        }

        public Criteria andDepositStateBetween(Short value1, Short value2) {
            addCriterion("DEPOSIT_STATE between", value1, value2, "depositState");
            return (Criteria) this;
        }

        public Criteria andDepositStateNotBetween(Short value1, Short value2) {
            addCriterion("DEPOSIT_STATE not between", value1, value2, "depositState");
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
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
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

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("PAY_TYPE like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("PAY_TYPE not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
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

        public Criteria andOutDepositNoIsNull() {
            addCriterion("OUT_DEPOSIT_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoIsNotNull() {
            addCriterion("OUT_DEPOSIT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoEqualTo(String value) {
            addCriterion("OUT_DEPOSIT_NO =", value, "outDepositNo");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoNotEqualTo(String value) {
            addCriterion("OUT_DEPOSIT_NO <>", value, "outDepositNo");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoGreaterThan(String value) {
            addCriterion("OUT_DEPOSIT_NO >", value, "outDepositNo");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_DEPOSIT_NO >=", value, "outDepositNo");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoLessThan(String value) {
            addCriterion("OUT_DEPOSIT_NO <", value, "outDepositNo");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_DEPOSIT_NO <=", value, "outDepositNo");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoLike(String value) {
            addCriterion("OUT_DEPOSIT_NO like", value, "outDepositNo");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoNotLike(String value) {
            addCriterion("OUT_DEPOSIT_NO not like", value, "outDepositNo");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoIn(List<String> values) {
            addCriterion("OUT_DEPOSIT_NO in", values, "outDepositNo");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoNotIn(List<String> values) {
            addCriterion("OUT_DEPOSIT_NO not in", values, "outDepositNo");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoBetween(String value1, String value2) {
            addCriterion("OUT_DEPOSIT_NO between", value1, value2, "outDepositNo");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoNotBetween(String value1, String value2) {
            addCriterion("OUT_DEPOSIT_NO not between", value1, value2, "outDepositNo");
            return (Criteria) this;
        }

        public Criteria andDepositFlagIsNull() {
            addCriterion("DEPOSIT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDepositFlagIsNotNull() {
            addCriterion("DEPOSIT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDepositFlagEqualTo(Short value) {
            addCriterion("DEPOSIT_FLAG =", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagNotEqualTo(Short value) {
            addCriterion("DEPOSIT_FLAG <>", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagGreaterThan(Short value) {
            addCriterion("DEPOSIT_FLAG >", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("DEPOSIT_FLAG >=", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagLessThan(Short value) {
            addCriterion("DEPOSIT_FLAG <", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagLessThanOrEqualTo(Short value) {
            addCriterion("DEPOSIT_FLAG <=", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagIn(List<Short> values) {
            addCriterion("DEPOSIT_FLAG in", values, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagNotIn(List<Short> values) {
            addCriterion("DEPOSIT_FLAG not in", values, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagBetween(Short value1, Short value2) {
            addCriterion("DEPOSIT_FLAG between", value1, value2, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagNotBetween(Short value1, Short value2) {
            addCriterion("DEPOSIT_FLAG not between", value1, value2, "depositFlag");
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

        public Criteria andDepositNoLikeInsensitive(String value) {
            addCriterion("upper(DEPOSIT_NO) like", value.toUpperCase(), "depositNo");
            return (Criteria) this;
        }

        public Criteria andPayTypeLikeInsensitive(String value) {
            addCriterion("upper(PAY_TYPE) like", value.toUpperCase(), "payType");
            return (Criteria) this;
        }

        public Criteria andUserIdLikeInsensitive(String value) {
            addCriterion("upper(USER_ID) like", value.toUpperCase(), "userId");
            return (Criteria) this;
        }

        public Criteria andOutDepositNoLikeInsensitive(String value) {
            addCriterion("upper(OUT_DEPOSIT_NO) like", value.toUpperCase(), "outDepositNo");
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