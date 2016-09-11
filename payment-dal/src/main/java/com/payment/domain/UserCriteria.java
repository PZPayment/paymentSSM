package com.payment.domain;

import com.payment.comm.base.domain.AbstractCriteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserCriteria extends AbstractCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCriteria() {
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

        public Criteria andPayPswIsNull() {
            addCriterion("PAY_PSW is null");
            return (Criteria) this;
        }

        public Criteria andPayPswIsNotNull() {
            addCriterion("PAY_PSW is not null");
            return (Criteria) this;
        }

        public Criteria andPayPswEqualTo(String value) {
            addCriterion("PAY_PSW =", value, "payPsw");
            return (Criteria) this;
        }

        public Criteria andPayPswNotEqualTo(String value) {
            addCriterion("PAY_PSW <>", value, "payPsw");
            return (Criteria) this;
        }

        public Criteria andPayPswGreaterThan(String value) {
            addCriterion("PAY_PSW >", value, "payPsw");
            return (Criteria) this;
        }

        public Criteria andPayPswGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_PSW >=", value, "payPsw");
            return (Criteria) this;
        }

        public Criteria andPayPswLessThan(String value) {
            addCriterion("PAY_PSW <", value, "payPsw");
            return (Criteria) this;
        }

        public Criteria andPayPswLessThanOrEqualTo(String value) {
            addCriterion("PAY_PSW <=", value, "payPsw");
            return (Criteria) this;
        }

        public Criteria andPayPswLike(String value) {
            addCriterion("PAY_PSW like", value, "payPsw");
            return (Criteria) this;
        }

        public Criteria andPayPswNotLike(String value) {
            addCriterion("PAY_PSW not like", value, "payPsw");
            return (Criteria) this;
        }

        public Criteria andPayPswIn(List<String> values) {
            addCriterion("PAY_PSW in", values, "payPsw");
            return (Criteria) this;
        }

        public Criteria andPayPswNotIn(List<String> values) {
            addCriterion("PAY_PSW not in", values, "payPsw");
            return (Criteria) this;
        }

        public Criteria andPayPswBetween(String value1, String value2) {
            addCriterion("PAY_PSW between", value1, value2, "payPsw");
            return (Criteria) this;
        }

        public Criteria andPayPswNotBetween(String value1, String value2) {
            addCriterion("PAY_PSW not between", value1, value2, "payPsw");
            return (Criteria) this;
        }

        public Criteria andIsUsePayPswIsNull() {
            addCriterion("IS_USE_PAY_PSW is null");
            return (Criteria) this;
        }

        public Criteria andIsUsePayPswIsNotNull() {
            addCriterion("IS_USE_PAY_PSW is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsePayPswEqualTo(Short value) {
            addCriterion("IS_USE_PAY_PSW =", value, "isUsePayPsw");
            return (Criteria) this;
        }

        public Criteria andIsUsePayPswNotEqualTo(Short value) {
            addCriterion("IS_USE_PAY_PSW <>", value, "isUsePayPsw");
            return (Criteria) this;
        }

        public Criteria andIsUsePayPswGreaterThan(Short value) {
            addCriterion("IS_USE_PAY_PSW >", value, "isUsePayPsw");
            return (Criteria) this;
        }

        public Criteria andIsUsePayPswGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_USE_PAY_PSW >=", value, "isUsePayPsw");
            return (Criteria) this;
        }

        public Criteria andIsUsePayPswLessThan(Short value) {
            addCriterion("IS_USE_PAY_PSW <", value, "isUsePayPsw");
            return (Criteria) this;
        }

        public Criteria andIsUsePayPswLessThanOrEqualTo(Short value) {
            addCriterion("IS_USE_PAY_PSW <=", value, "isUsePayPsw");
            return (Criteria) this;
        }

        public Criteria andIsUsePayPswIn(List<Short> values) {
            addCriterion("IS_USE_PAY_PSW in", values, "isUsePayPsw");
            return (Criteria) this;
        }

        public Criteria andIsUsePayPswNotIn(List<Short> values) {
            addCriterion("IS_USE_PAY_PSW not in", values, "isUsePayPsw");
            return (Criteria) this;
        }

        public Criteria andIsUsePayPswBetween(Short value1, Short value2) {
            addCriterion("IS_USE_PAY_PSW between", value1, value2, "isUsePayPsw");
            return (Criteria) this;
        }

        public Criteria andIsUsePayPswNotBetween(Short value1, Short value2) {
            addCriterion("IS_USE_PAY_PSW not between", value1, value2, "isUsePayPsw");
            return (Criteria) this;
        }

        public Criteria andCountInvalidPwdIsNull() {
            addCriterion("COUNT_INVALID_PWD is null");
            return (Criteria) this;
        }

        public Criteria andCountInvalidPwdIsNotNull() {
            addCriterion("COUNT_INVALID_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andCountInvalidPwdEqualTo(Short value) {
            addCriterion("COUNT_INVALID_PWD =", value, "countInvalidPwd");
            return (Criteria) this;
        }

        public Criteria andCountInvalidPwdNotEqualTo(Short value) {
            addCriterion("COUNT_INVALID_PWD <>", value, "countInvalidPwd");
            return (Criteria) this;
        }

        public Criteria andCountInvalidPwdGreaterThan(Short value) {
            addCriterion("COUNT_INVALID_PWD >", value, "countInvalidPwd");
            return (Criteria) this;
        }

        public Criteria andCountInvalidPwdGreaterThanOrEqualTo(Short value) {
            addCriterion("COUNT_INVALID_PWD >=", value, "countInvalidPwd");
            return (Criteria) this;
        }

        public Criteria andCountInvalidPwdLessThan(Short value) {
            addCriterion("COUNT_INVALID_PWD <", value, "countInvalidPwd");
            return (Criteria) this;
        }

        public Criteria andCountInvalidPwdLessThanOrEqualTo(Short value) {
            addCriterion("COUNT_INVALID_PWD <=", value, "countInvalidPwd");
            return (Criteria) this;
        }

        public Criteria andCountInvalidPwdIn(List<Short> values) {
            addCriterion("COUNT_INVALID_PWD in", values, "countInvalidPwd");
            return (Criteria) this;
        }

        public Criteria andCountInvalidPwdNotIn(List<Short> values) {
            addCriterion("COUNT_INVALID_PWD not in", values, "countInvalidPwd");
            return (Criteria) this;
        }

        public Criteria andCountInvalidPwdBetween(Short value1, Short value2) {
            addCriterion("COUNT_INVALID_PWD between", value1, value2, "countInvalidPwd");
            return (Criteria) this;
        }

        public Criteria andCountInvalidPwdNotBetween(Short value1, Short value2) {
            addCriterion("COUNT_INVALID_PWD not between", value1, value2, "countInvalidPwd");
            return (Criteria) this;
        }

        public Criteria andPwdStrengthIsNull() {
            addCriterion("PWD_STRENGTH is null");
            return (Criteria) this;
        }

        public Criteria andPwdStrengthIsNotNull() {
            addCriterion("PWD_STRENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andPwdStrengthEqualTo(Short value) {
            addCriterion("PWD_STRENGTH =", value, "pwdStrength");
            return (Criteria) this;
        }

        public Criteria andPwdStrengthNotEqualTo(Short value) {
            addCriterion("PWD_STRENGTH <>", value, "pwdStrength");
            return (Criteria) this;
        }

        public Criteria andPwdStrengthGreaterThan(Short value) {
            addCriterion("PWD_STRENGTH >", value, "pwdStrength");
            return (Criteria) this;
        }

        public Criteria andPwdStrengthGreaterThanOrEqualTo(Short value) {
            addCriterion("PWD_STRENGTH >=", value, "pwdStrength");
            return (Criteria) this;
        }

        public Criteria andPwdStrengthLessThan(Short value) {
            addCriterion("PWD_STRENGTH <", value, "pwdStrength");
            return (Criteria) this;
        }

        public Criteria andPwdStrengthLessThanOrEqualTo(Short value) {
            addCriterion("PWD_STRENGTH <=", value, "pwdStrength");
            return (Criteria) this;
        }

        public Criteria andPwdStrengthIn(List<Short> values) {
            addCriterion("PWD_STRENGTH in", values, "pwdStrength");
            return (Criteria) this;
        }

        public Criteria andPwdStrengthNotIn(List<Short> values) {
            addCriterion("PWD_STRENGTH not in", values, "pwdStrength");
            return (Criteria) this;
        }

        public Criteria andPwdStrengthBetween(Short value1, Short value2) {
            addCriterion("PWD_STRENGTH between", value1, value2, "pwdStrength");
            return (Criteria) this;
        }

        public Criteria andPwdStrengthNotBetween(Short value1, Short value2) {
            addCriterion("PWD_STRENGTH not between", value1, value2, "pwdStrength");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyIsNull() {
            addCriterion("PAY_BASE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyIsNotNull() {
            addCriterion("PAY_BASE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyEqualTo(String value) {
            addCriterion("PAY_BASE_KEY =", value, "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyNotEqualTo(String value) {
            addCriterion("PAY_BASE_KEY <>", value, "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyGreaterThan(String value) {
            addCriterion("PAY_BASE_KEY >", value, "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_BASE_KEY >=", value, "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyLessThan(String value) {
            addCriterion("PAY_BASE_KEY <", value, "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyLessThanOrEqualTo(String value) {
            addCriterion("PAY_BASE_KEY <=", value, "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyLike(String value) {
            addCriterion("PAY_BASE_KEY like", value, "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyNotLike(String value) {
            addCriterion("PAY_BASE_KEY not like", value, "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyIn(List<String> values) {
            addCriterion("PAY_BASE_KEY in", values, "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyNotIn(List<String> values) {
            addCriterion("PAY_BASE_KEY not in", values, "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyBetween(String value1, String value2) {
            addCriterion("PAY_BASE_KEY between", value1, value2, "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyNotBetween(String value1, String value2) {
            addCriterion("PAY_BASE_KEY not between", value1, value2, "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andPayPswTypeIsNull() {
            addCriterion("PAY_PSW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayPswTypeIsNotNull() {
            addCriterion("PAY_PSW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayPswTypeEqualTo(Short value) {
            addCriterion("PAY_PSW_TYPE =", value, "payPswType");
            return (Criteria) this;
        }

        public Criteria andPayPswTypeNotEqualTo(Short value) {
            addCriterion("PAY_PSW_TYPE <>", value, "payPswType");
            return (Criteria) this;
        }

        public Criteria andPayPswTypeGreaterThan(Short value) {
            addCriterion("PAY_PSW_TYPE >", value, "payPswType");
            return (Criteria) this;
        }

        public Criteria andPayPswTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PAY_PSW_TYPE >=", value, "payPswType");
            return (Criteria) this;
        }

        public Criteria andPayPswTypeLessThan(Short value) {
            addCriterion("PAY_PSW_TYPE <", value, "payPswType");
            return (Criteria) this;
        }

        public Criteria andPayPswTypeLessThanOrEqualTo(Short value) {
            addCriterion("PAY_PSW_TYPE <=", value, "payPswType");
            return (Criteria) this;
        }

        public Criteria andPayPswTypeIn(List<Short> values) {
            addCriterion("PAY_PSW_TYPE in", values, "payPswType");
            return (Criteria) this;
        }

        public Criteria andPayPswTypeNotIn(List<Short> values) {
            addCriterion("PAY_PSW_TYPE not in", values, "payPswType");
            return (Criteria) this;
        }

        public Criteria andPayPswTypeBetween(Short value1, Short value2) {
            addCriterion("PAY_PSW_TYPE between", value1, value2, "payPswType");
            return (Criteria) this;
        }

        public Criteria andPayPswTypeNotBetween(Short value1, Short value2) {
            addCriterion("PAY_PSW_TYPE not between", value1, value2, "payPswType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(Short value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(Short value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(Short value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(Short value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(Short value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<Short> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<Short> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(Short value1, Short value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(Short value1, Short value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("USER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("USER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Short value) {
            addCriterion("USER_STATE =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Short value) {
            addCriterion("USER_STATE <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Short value) {
            addCriterion("USER_STATE >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Short value) {
            addCriterion("USER_STATE >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Short value) {
            addCriterion("USER_STATE <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Short value) {
            addCriterion("USER_STATE <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Short> values) {
            addCriterion("USER_STATE in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Short> values) {
            addCriterion("USER_STATE not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Short value1, Short value2) {
            addCriterion("USER_STATE between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Short value1, Short value2) {
            addCriterion("USER_STATE not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("REAL_NAME =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("REAL_NAME <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("REAL_NAME >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_NAME >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("REAL_NAME <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("REAL_NAME <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("REAL_NAME like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("REAL_NAME not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("REAL_NAME in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("REAL_NAME not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("REAL_NAME between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("REAL_NAME not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andEmaillIsNull() {
            addCriterion("EMAILL is null");
            return (Criteria) this;
        }

        public Criteria andEmaillIsNotNull() {
            addCriterion("EMAILL is not null");
            return (Criteria) this;
        }

        public Criteria andEmaillEqualTo(String value) {
            addCriterion("EMAILL =", value, "emaill");
            return (Criteria) this;
        }

        public Criteria andEmaillNotEqualTo(String value) {
            addCriterion("EMAILL <>", value, "emaill");
            return (Criteria) this;
        }

        public Criteria andEmaillGreaterThan(String value) {
            addCriterion("EMAILL >", value, "emaill");
            return (Criteria) this;
        }

        public Criteria andEmaillGreaterThanOrEqualTo(String value) {
            addCriterion("EMAILL >=", value, "emaill");
            return (Criteria) this;
        }

        public Criteria andEmaillLessThan(String value) {
            addCriterion("EMAILL <", value, "emaill");
            return (Criteria) this;
        }

        public Criteria andEmaillLessThanOrEqualTo(String value) {
            addCriterion("EMAILL <=", value, "emaill");
            return (Criteria) this;
        }

        public Criteria andEmaillLike(String value) {
            addCriterion("EMAILL like", value, "emaill");
            return (Criteria) this;
        }

        public Criteria andEmaillNotLike(String value) {
            addCriterion("EMAILL not like", value, "emaill");
            return (Criteria) this;
        }

        public Criteria andEmaillIn(List<String> values) {
            addCriterion("EMAILL in", values, "emaill");
            return (Criteria) this;
        }

        public Criteria andEmaillNotIn(List<String> values) {
            addCriterion("EMAILL not in", values, "emaill");
            return (Criteria) this;
        }

        public Criteria andEmaillBetween(String value1, String value2) {
            addCriterion("EMAILL between", value1, value2, "emaill");
            return (Criteria) this;
        }

        public Criteria andEmaillNotBetween(String value1, String value2) {
            addCriterion("EMAILL not between", value1, value2, "emaill");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andRealCheckIsNull() {
            addCriterion("REAL_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andRealCheckIsNotNull() {
            addCriterion("REAL_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andRealCheckEqualTo(Short value) {
            addCriterion("REAL_CHECK =", value, "realCheck");
            return (Criteria) this;
        }

        public Criteria andRealCheckNotEqualTo(Short value) {
            addCriterion("REAL_CHECK <>", value, "realCheck");
            return (Criteria) this;
        }

        public Criteria andRealCheckGreaterThan(Short value) {
            addCriterion("REAL_CHECK >", value, "realCheck");
            return (Criteria) this;
        }

        public Criteria andRealCheckGreaterThanOrEqualTo(Short value) {
            addCriterion("REAL_CHECK >=", value, "realCheck");
            return (Criteria) this;
        }

        public Criteria andRealCheckLessThan(Short value) {
            addCriterion("REAL_CHECK <", value, "realCheck");
            return (Criteria) this;
        }

        public Criteria andRealCheckLessThanOrEqualTo(Short value) {
            addCriterion("REAL_CHECK <=", value, "realCheck");
            return (Criteria) this;
        }

        public Criteria andRealCheckIn(List<Short> values) {
            addCriterion("REAL_CHECK in", values, "realCheck");
            return (Criteria) this;
        }

        public Criteria andRealCheckNotIn(List<Short> values) {
            addCriterion("REAL_CHECK not in", values, "realCheck");
            return (Criteria) this;
        }

        public Criteria andRealCheckBetween(Short value1, Short value2) {
            addCriterion("REAL_CHECK between", value1, value2, "realCheck");
            return (Criteria) this;
        }

        public Criteria andRealCheckNotBetween(Short value1, Short value2) {
            addCriterion("REAL_CHECK not between", value1, value2, "realCheck");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNull() {
            addCriterion("REG_IP is null");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNotNull() {
            addCriterion("REG_IP is not null");
            return (Criteria) this;
        }

        public Criteria andRegIpEqualTo(String value) {
            addCriterion("REG_IP =", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotEqualTo(String value) {
            addCriterion("REG_IP <>", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThan(String value) {
            addCriterion("REG_IP >", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThanOrEqualTo(String value) {
            addCriterion("REG_IP >=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThan(String value) {
            addCriterion("REG_IP <", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThanOrEqualTo(String value) {
            addCriterion("REG_IP <=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLike(String value) {
            addCriterion("REG_IP like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotLike(String value) {
            addCriterion("REG_IP not like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpIn(List<String> values) {
            addCriterion("REG_IP in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotIn(List<String> values) {
            addCriterion("REG_IP not in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpBetween(String value1, String value2) {
            addCriterion("REG_IP between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotBetween(String value1, String value2) {
            addCriterion("REG_IP not between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("REG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("REG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Date value) {
            addCriterionForJDBCDate("REG_TIME =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("REG_TIME <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("REG_TIME >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REG_TIME >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Date value) {
            addCriterionForJDBCDate("REG_TIME <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REG_TIME <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Date> values) {
            addCriterionForJDBCDate("REG_TIME in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("REG_TIME not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REG_TIME between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REG_TIME not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andUserIdLikeInsensitive(String value) {
            addCriterion("upper(USER_ID) like", value.toUpperCase(), "userId");
            return (Criteria) this;
        }

        public Criteria andPayPswLikeInsensitive(String value) {
            addCriterion("upper(PAY_PSW) like", value.toUpperCase(), "payPsw");
            return (Criteria) this;
        }

        public Criteria andPayBaseKeyLikeInsensitive(String value) {
            addCriterion("upper(PAY_BASE_KEY) like", value.toUpperCase(), "payBaseKey");
            return (Criteria) this;
        }

        public Criteria andIdNoLikeInsensitive(String value) {
            addCriterion("upper(ID_NO) like", value.toUpperCase(), "idNo");
            return (Criteria) this;
        }

        public Criteria andRealNameLikeInsensitive(String value) {
            addCriterion("upper(REAL_NAME) like", value.toUpperCase(), "realName");
            return (Criteria) this;
        }

        public Criteria andEmaillLikeInsensitive(String value) {
            addCriterion("upper(EMAILL) like", value.toUpperCase(), "emaill");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(MOBILE) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andRegIpLikeInsensitive(String value) {
            addCriterion("upper(REG_IP) like", value.toUpperCase(), "regIp");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLikeInsensitive(String value) {
            addCriterion("upper(COMPANY_NAME) like", value.toUpperCase(), "companyName");
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