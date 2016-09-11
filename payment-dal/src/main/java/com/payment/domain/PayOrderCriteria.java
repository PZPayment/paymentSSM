package com.payment.domain;

import com.payment.comm.base.domain.AbstractCriteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PayOrderCriteria extends AbstractCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayOrderCriteria() {
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

        public Criteria andPayNoIsNull() {
            addCriterion("PAY_NO is null");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNotNull() {
            addCriterion("PAY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoEqualTo(String value) {
            addCriterion("PAY_NO =", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotEqualTo(String value) {
            addCriterion("PAY_NO <>", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThan(String value) {
            addCriterion("PAY_NO >", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_NO >=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThan(String value) {
            addCriterion("PAY_NO <", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThanOrEqualTo(String value) {
            addCriterion("PAY_NO <=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLike(String value) {
            addCriterion("PAY_NO like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotLike(String value) {
            addCriterion("PAY_NO not like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIn(List<String> values) {
            addCriterion("PAY_NO in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotIn(List<String> values) {
            addCriterion("PAY_NO not in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoBetween(String value1, String value2) {
            addCriterion("PAY_NO between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotBetween(String value1, String value2) {
            addCriterion("PAY_NO not between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoIsNull() {
            addCriterion("OUT_PAY_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutPayNoIsNotNull() {
            addCriterion("OUT_PAY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutPayNoEqualTo(String value) {
            addCriterion("OUT_PAY_NO =", value, "outPayNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoNotEqualTo(String value) {
            addCriterion("OUT_PAY_NO <>", value, "outPayNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoGreaterThan(String value) {
            addCriterion("OUT_PAY_NO >", value, "outPayNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_PAY_NO >=", value, "outPayNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoLessThan(String value) {
            addCriterion("OUT_PAY_NO <", value, "outPayNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_PAY_NO <=", value, "outPayNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoLike(String value) {
            addCriterion("OUT_PAY_NO like", value, "outPayNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoNotLike(String value) {
            addCriterion("OUT_PAY_NO not like", value, "outPayNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoIn(List<String> values) {
            addCriterion("OUT_PAY_NO in", values, "outPayNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoNotIn(List<String> values) {
            addCriterion("OUT_PAY_NO not in", values, "outPayNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoBetween(String value1, String value2) {
            addCriterion("OUT_PAY_NO between", value1, value2, "outPayNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoNotBetween(String value1, String value2) {
            addCriterion("OUT_PAY_NO not between", value1, value2, "outPayNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoIsNull() {
            addCriterion("GATE_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoIsNotNull() {
            addCriterion("GATE_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoEqualTo(String value) {
            addCriterion("GATE_ORDER_NO =", value, "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoNotEqualTo(String value) {
            addCriterion("GATE_ORDER_NO <>", value, "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoGreaterThan(String value) {
            addCriterion("GATE_ORDER_NO >", value, "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("GATE_ORDER_NO >=", value, "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoLessThan(String value) {
            addCriterion("GATE_ORDER_NO <", value, "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoLessThanOrEqualTo(String value) {
            addCriterion("GATE_ORDER_NO <=", value, "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoLike(String value) {
            addCriterion("GATE_ORDER_NO like", value, "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoNotLike(String value) {
            addCriterion("GATE_ORDER_NO not like", value, "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoIn(List<String> values) {
            addCriterion("GATE_ORDER_NO in", values, "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoNotIn(List<String> values) {
            addCriterion("GATE_ORDER_NO not in", values, "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoBetween(String value1, String value2) {
            addCriterion("GATE_ORDER_NO between", value1, value2, "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoNotBetween(String value1, String value2) {
            addCriterion("GATE_ORDER_NO not between", value1, value2, "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoIsNull() {
            addCriterion("BANK_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoIsNotNull() {
            addCriterion("BANK_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoEqualTo(String value) {
            addCriterion("BANK_ORDER_NO =", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoNotEqualTo(String value) {
            addCriterion("BANK_ORDER_NO <>", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoGreaterThan(String value) {
            addCriterion("BANK_ORDER_NO >", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ORDER_NO >=", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoLessThan(String value) {
            addCriterion("BANK_ORDER_NO <", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_ORDER_NO <=", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoLike(String value) {
            addCriterion("BANK_ORDER_NO like", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoNotLike(String value) {
            addCriterion("BANK_ORDER_NO not like", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoIn(List<String> values) {
            addCriterion("BANK_ORDER_NO in", values, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoNotIn(List<String> values) {
            addCriterion("BANK_ORDER_NO not in", values, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoBetween(String value1, String value2) {
            addCriterion("BANK_ORDER_NO between", value1, value2, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoNotBetween(String value1, String value2) {
            addCriterion("BANK_ORDER_NO not between", value1, value2, "bankOrderNo");
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

        public Criteria andExpDateIsNull() {
            addCriterion("EXP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNotNull() {
            addCriterion("EXP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpDateEqualTo(Date value) {
            addCriterionForJDBCDate("EXP_DATE =", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXP_DATE <>", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThan(Date value) {
            addCriterionForJDBCDate("EXP_DATE >", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXP_DATE >=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThan(Date value) {
            addCriterionForJDBCDate("EXP_DATE <", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXP_DATE <=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateIn(List<Date> values) {
            addCriterionForJDBCDate("EXP_DATE in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXP_DATE not in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXP_DATE between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXP_DATE not between", value1, value2, "expDate");
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

        public Criteria andCallbackTimeIsNull() {
            addCriterion("CALLBACK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCallbackTimeIsNotNull() {
            addCriterion("CALLBACK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CALLBACK_TIME =", value, "callbackTime");
            return (Criteria) this;
        }

        public Criteria andCallbackTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CALLBACK_TIME <>", value, "callbackTime");
            return (Criteria) this;
        }

        public Criteria andCallbackTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CALLBACK_TIME >", value, "callbackTime");
            return (Criteria) this;
        }

        public Criteria andCallbackTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CALLBACK_TIME >=", value, "callbackTime");
            return (Criteria) this;
        }

        public Criteria andCallbackTimeLessThan(Date value) {
            addCriterionForJDBCDate("CALLBACK_TIME <", value, "callbackTime");
            return (Criteria) this;
        }

        public Criteria andCallbackTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CALLBACK_TIME <=", value, "callbackTime");
            return (Criteria) this;
        }

        public Criteria andCallbackTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CALLBACK_TIME in", values, "callbackTime");
            return (Criteria) this;
        }

        public Criteria andCallbackTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CALLBACK_TIME not in", values, "callbackTime");
            return (Criteria) this;
        }

        public Criteria andCallbackTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CALLBACK_TIME between", value1, value2, "callbackTime");
            return (Criteria) this;
        }

        public Criteria andCallbackTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CALLBACK_TIME not between", value1, value2, "callbackTime");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("PAY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("PAY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(Long value) {
            addCriterion("PAY_AMOUNT =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(Long value) {
            addCriterion("PAY_AMOUNT <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(Long value) {
            addCriterion("PAY_AMOUNT >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_AMOUNT >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(Long value) {
            addCriterion("PAY_AMOUNT <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(Long value) {
            addCriterion("PAY_AMOUNT <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<Long> values) {
            addCriterion("PAY_AMOUNT in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<Long> values) {
            addCriterion("PAY_AMOUNT not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(Long value1, Long value2) {
            addCriterion("PAY_AMOUNT between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(Long value1, Long value2) {
            addCriterion("PAY_AMOUNT not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountIsNull() {
            addCriterion("COMMISSION_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountIsNotNull() {
            addCriterion("COMMISSION_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountEqualTo(Long value) {
            addCriterion("COMMISSION_AMOUNT =", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountNotEqualTo(Long value) {
            addCriterion("COMMISSION_AMOUNT <>", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountGreaterThan(Long value) {
            addCriterion("COMMISSION_AMOUNT >", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMISSION_AMOUNT >=", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountLessThan(Long value) {
            addCriterion("COMMISSION_AMOUNT <", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountLessThanOrEqualTo(Long value) {
            addCriterion("COMMISSION_AMOUNT <=", value, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountIn(List<Long> values) {
            addCriterion("COMMISSION_AMOUNT in", values, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountNotIn(List<Long> values) {
            addCriterion("COMMISSION_AMOUNT not in", values, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountBetween(Long value1, Long value2) {
            addCriterion("COMMISSION_AMOUNT between", value1, value2, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionAmountNotBetween(Long value1, Long value2) {
            addCriterion("COMMISSION_AMOUNT not between", value1, value2, "commissionAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("REAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("REAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(Long value) {
            addCriterion("REAL_AMOUNT =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(Long value) {
            addCriterion("REAL_AMOUNT <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(Long value) {
            addCriterion("REAL_AMOUNT >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("REAL_AMOUNT >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(Long value) {
            addCriterion("REAL_AMOUNT <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(Long value) {
            addCriterion("REAL_AMOUNT <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<Long> values) {
            addCriterion("REAL_AMOUNT in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<Long> values) {
            addCriterion("REAL_AMOUNT not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(Long value1, Long value2) {
            addCriterion("REAL_AMOUNT between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(Long value1, Long value2) {
            addCriterion("REAL_AMOUNT not between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andTradeStateIsNull() {
            addCriterion("TRADE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTradeStateIsNotNull() {
            addCriterion("TRADE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeStateEqualTo(Short value) {
            addCriterion("TRADE_STATE =", value, "tradeState");
            return (Criteria) this;
        }

        public Criteria andTradeStateNotEqualTo(Short value) {
            addCriterion("TRADE_STATE <>", value, "tradeState");
            return (Criteria) this;
        }

        public Criteria andTradeStateGreaterThan(Short value) {
            addCriterion("TRADE_STATE >", value, "tradeState");
            return (Criteria) this;
        }

        public Criteria andTradeStateGreaterThanOrEqualTo(Short value) {
            addCriterion("TRADE_STATE >=", value, "tradeState");
            return (Criteria) this;
        }

        public Criteria andTradeStateLessThan(Short value) {
            addCriterion("TRADE_STATE <", value, "tradeState");
            return (Criteria) this;
        }

        public Criteria andTradeStateLessThanOrEqualTo(Short value) {
            addCriterion("TRADE_STATE <=", value, "tradeState");
            return (Criteria) this;
        }

        public Criteria andTradeStateIn(List<Short> values) {
            addCriterion("TRADE_STATE in", values, "tradeState");
            return (Criteria) this;
        }

        public Criteria andTradeStateNotIn(List<Short> values) {
            addCriterion("TRADE_STATE not in", values, "tradeState");
            return (Criteria) this;
        }

        public Criteria andTradeStateBetween(Short value1, Short value2) {
            addCriterion("TRADE_STATE between", value1, value2, "tradeState");
            return (Criteria) this;
        }

        public Criteria andTradeStateNotBetween(Short value1, Short value2) {
            addCriterion("TRADE_STATE not between", value1, value2, "tradeState");
            return (Criteria) this;
        }

        public Criteria andCallbackStateIsNull() {
            addCriterion("CALLBACK_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCallbackStateIsNotNull() {
            addCriterion("CALLBACK_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackStateEqualTo(Short value) {
            addCriterion("CALLBACK_STATE =", value, "callbackState");
            return (Criteria) this;
        }

        public Criteria andCallbackStateNotEqualTo(Short value) {
            addCriterion("CALLBACK_STATE <>", value, "callbackState");
            return (Criteria) this;
        }

        public Criteria andCallbackStateGreaterThan(Short value) {
            addCriterion("CALLBACK_STATE >", value, "callbackState");
            return (Criteria) this;
        }

        public Criteria andCallbackStateGreaterThanOrEqualTo(Short value) {
            addCriterion("CALLBACK_STATE >=", value, "callbackState");
            return (Criteria) this;
        }

        public Criteria andCallbackStateLessThan(Short value) {
            addCriterion("CALLBACK_STATE <", value, "callbackState");
            return (Criteria) this;
        }

        public Criteria andCallbackStateLessThanOrEqualTo(Short value) {
            addCriterion("CALLBACK_STATE <=", value, "callbackState");
            return (Criteria) this;
        }

        public Criteria andCallbackStateIn(List<Short> values) {
            addCriterion("CALLBACK_STATE in", values, "callbackState");
            return (Criteria) this;
        }

        public Criteria andCallbackStateNotIn(List<Short> values) {
            addCriterion("CALLBACK_STATE not in", values, "callbackState");
            return (Criteria) this;
        }

        public Criteria andCallbackStateBetween(Short value1, Short value2) {
            addCriterion("CALLBACK_STATE between", value1, value2, "callbackState");
            return (Criteria) this;
        }

        public Criteria andCallbackStateNotBetween(Short value1, Short value2) {
            addCriterion("CALLBACK_STATE not between", value1, value2, "callbackState");
            return (Criteria) this;
        }

        public Criteria andRefundStateIsNull() {
            addCriterion("REFUND_STATE is null");
            return (Criteria) this;
        }

        public Criteria andRefundStateIsNotNull() {
            addCriterion("REFUND_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStateEqualTo(Short value) {
            addCriterion("REFUND_STATE =", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotEqualTo(Short value) {
            addCriterion("REFUND_STATE <>", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThan(Short value) {
            addCriterion("REFUND_STATE >", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThanOrEqualTo(Short value) {
            addCriterion("REFUND_STATE >=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThan(Short value) {
            addCriterion("REFUND_STATE <", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThanOrEqualTo(Short value) {
            addCriterion("REFUND_STATE <=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateIn(List<Short> values) {
            addCriterion("REFUND_STATE in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotIn(List<Short> values) {
            addCriterion("REFUND_STATE not in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateBetween(Short value1, Short value2) {
            addCriterion("REFUND_STATE between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotBetween(Short value1, Short value2) {
            addCriterion("REFUND_STATE not between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("REFUND_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("REFUND_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(Long value) {
            addCriterion("REFUND_AMOUNT =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(Long value) {
            addCriterion("REFUND_AMOUNT <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(Long value) {
            addCriterion("REFUND_AMOUNT >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("REFUND_AMOUNT >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(Long value) {
            addCriterion("REFUND_AMOUNT <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(Long value) {
            addCriterion("REFUND_AMOUNT <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<Long> values) {
            addCriterion("REFUND_AMOUNT in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<Long> values) {
            addCriterion("REFUND_AMOUNT not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(Long value1, Long value2) {
            addCriterion("REFUND_AMOUNT between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(Long value1, Long value2) {
            addCriterion("REFUND_AMOUNT not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("BANK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("BANK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("BANK_CODE =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("BANK_CODE <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("BANK_CODE >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CODE >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("BANK_CODE <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("BANK_CODE <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("BANK_CODE like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("BANK_CODE not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("BANK_CODE in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("BANK_CODE not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("BANK_CODE between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("BANK_CODE not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andPayIpIsNull() {
            addCriterion("PAY_IP is null");
            return (Criteria) this;
        }

        public Criteria andPayIpIsNotNull() {
            addCriterion("PAY_IP is not null");
            return (Criteria) this;
        }

        public Criteria andPayIpEqualTo(String value) {
            addCriterion("PAY_IP =", value, "payIp");
            return (Criteria) this;
        }

        public Criteria andPayIpNotEqualTo(String value) {
            addCriterion("PAY_IP <>", value, "payIp");
            return (Criteria) this;
        }

        public Criteria andPayIpGreaterThan(String value) {
            addCriterion("PAY_IP >", value, "payIp");
            return (Criteria) this;
        }

        public Criteria andPayIpGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_IP >=", value, "payIp");
            return (Criteria) this;
        }

        public Criteria andPayIpLessThan(String value) {
            addCriterion("PAY_IP <", value, "payIp");
            return (Criteria) this;
        }

        public Criteria andPayIpLessThanOrEqualTo(String value) {
            addCriterion("PAY_IP <=", value, "payIp");
            return (Criteria) this;
        }

        public Criteria andPayIpLike(String value) {
            addCriterion("PAY_IP like", value, "payIp");
            return (Criteria) this;
        }

        public Criteria andPayIpNotLike(String value) {
            addCriterion("PAY_IP not like", value, "payIp");
            return (Criteria) this;
        }

        public Criteria andPayIpIn(List<String> values) {
            addCriterion("PAY_IP in", values, "payIp");
            return (Criteria) this;
        }

        public Criteria andPayIpNotIn(List<String> values) {
            addCriterion("PAY_IP not in", values, "payIp");
            return (Criteria) this;
        }

        public Criteria andPayIpBetween(String value1, String value2) {
            addCriterion("PAY_IP between", value1, value2, "payIp");
            return (Criteria) this;
        }

        public Criteria andPayIpNotBetween(String value1, String value2) {
            addCriterion("PAY_IP not between", value1, value2, "payIp");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIsNull() {
            addCriterion("CALLBACK_URL is null");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIsNotNull() {
            addCriterion("CALLBACK_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlEqualTo(String value) {
            addCriterion("CALLBACK_URL =", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotEqualTo(String value) {
            addCriterion("CALLBACK_URL <>", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlGreaterThan(String value) {
            addCriterion("CALLBACK_URL >", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CALLBACK_URL >=", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLessThan(String value) {
            addCriterion("CALLBACK_URL <", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLessThanOrEqualTo(String value) {
            addCriterion("CALLBACK_URL <=", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLike(String value) {
            addCriterion("CALLBACK_URL like", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotLike(String value) {
            addCriterion("CALLBACK_URL not like", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIn(List<String> values) {
            addCriterion("CALLBACK_URL in", values, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotIn(List<String> values) {
            addCriterion("CALLBACK_URL not in", values, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlBetween(String value1, String value2) {
            addCriterion("CALLBACK_URL between", value1, value2, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotBetween(String value1, String value2) {
            addCriterion("CALLBACK_URL not between", value1, value2, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlIsNull() {
            addCriterion("NONTIFY_URL is null");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlIsNotNull() {
            addCriterion("NONTIFY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlEqualTo(String value) {
            addCriterion("NONTIFY_URL =", value, "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlNotEqualTo(String value) {
            addCriterion("NONTIFY_URL <>", value, "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlGreaterThan(String value) {
            addCriterion("NONTIFY_URL >", value, "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("NONTIFY_URL >=", value, "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlLessThan(String value) {
            addCriterion("NONTIFY_URL <", value, "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlLessThanOrEqualTo(String value) {
            addCriterion("NONTIFY_URL <=", value, "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlLike(String value) {
            addCriterion("NONTIFY_URL like", value, "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlNotLike(String value) {
            addCriterion("NONTIFY_URL not like", value, "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlIn(List<String> values) {
            addCriterion("NONTIFY_URL in", values, "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlNotIn(List<String> values) {
            addCriterion("NONTIFY_URL not in", values, "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlBetween(String value1, String value2) {
            addCriterion("NONTIFY_URL between", value1, value2, "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlNotBetween(String value1, String value2) {
            addCriterion("NONTIFY_URL not between", value1, value2, "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andCheckNoIsNull() {
            addCriterion("CHECK_NO is null");
            return (Criteria) this;
        }

        public Criteria andCheckNoIsNotNull() {
            addCriterion("CHECK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNoEqualTo(String value) {
            addCriterion("CHECK_NO =", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoNotEqualTo(String value) {
            addCriterion("CHECK_NO <>", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoGreaterThan(String value) {
            addCriterion("CHECK_NO >", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_NO >=", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoLessThan(String value) {
            addCriterion("CHECK_NO <", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoLessThanOrEqualTo(String value) {
            addCriterion("CHECK_NO <=", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoLike(String value) {
            addCriterion("CHECK_NO like", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoNotLike(String value) {
            addCriterion("CHECK_NO not like", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoIn(List<String> values) {
            addCriterion("CHECK_NO in", values, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoNotIn(List<String> values) {
            addCriterion("CHECK_NO not in", values, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoBetween(String value1, String value2) {
            addCriterion("CHECK_NO between", value1, value2, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoNotBetween(String value1, String value2) {
            addCriterion("CHECK_NO not between", value1, value2, "checkNo");
            return (Criteria) this;
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

        public Criteria andRefundTimeIsNull() {
            addCriterion("REFUND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("REFUND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterionForJDBCDate("REFUND_TIME =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("REFUND_TIME <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("REFUND_TIME >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REFUND_TIME >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterionForJDBCDate("REFUND_TIME <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REFUND_TIME <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterionForJDBCDate("REFUND_TIME in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("REFUND_TIME not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REFUND_TIME between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REFUND_TIME not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andPayUserIdIsNull() {
            addCriterion("PAY_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayUserIdIsNotNull() {
            addCriterion("PAY_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayUserIdEqualTo(String value) {
            addCriterion("PAY_USER_ID =", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotEqualTo(String value) {
            addCriterion("PAY_USER_ID <>", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdGreaterThan(String value) {
            addCriterion("PAY_USER_ID >", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_USER_ID >=", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdLessThan(String value) {
            addCriterion("PAY_USER_ID <", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_USER_ID <=", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdLike(String value) {
            addCriterion("PAY_USER_ID like", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotLike(String value) {
            addCriterion("PAY_USER_ID not like", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdIn(List<String> values) {
            addCriterion("PAY_USER_ID in", values, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotIn(List<String> values) {
            addCriterion("PAY_USER_ID not in", values, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdBetween(String value1, String value2) {
            addCriterion("PAY_USER_ID between", value1, value2, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotBetween(String value1, String value2) {
            addCriterion("PAY_USER_ID not between", value1, value2, "payUserId");
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

        public Criteria andPayNoLikeInsensitive(String value) {
            addCriterion("upper(PAY_NO) like", value.toUpperCase(), "payNo");
            return (Criteria) this;
        }

        public Criteria andOutPayNoLikeInsensitive(String value) {
            addCriterion("upper(OUT_PAY_NO) like", value.toUpperCase(), "outPayNo");
            return (Criteria) this;
        }

        public Criteria andGateOrderNoLikeInsensitive(String value) {
            addCriterion("upper(GATE_ORDER_NO) like", value.toUpperCase(), "gateOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoLikeInsensitive(String value) {
            addCriterion("upper(BANK_ORDER_NO) like", value.toUpperCase(), "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankCodeLikeInsensitive(String value) {
            addCriterion("upper(BANK_CODE) like", value.toUpperCase(), "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankNameLikeInsensitive(String value) {
            addCriterion("upper(BANK_NAME) like", value.toUpperCase(), "bankName");
            return (Criteria) this;
        }

        public Criteria andPayIpLikeInsensitive(String value) {
            addCriterion("upper(PAY_IP) like", value.toUpperCase(), "payIp");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLikeInsensitive(String value) {
            addCriterion("upper(CALLBACK_URL) like", value.toUpperCase(), "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andNontifyUrlLikeInsensitive(String value) {
            addCriterion("upper(NONTIFY_URL) like", value.toUpperCase(), "nontifyUrl");
            return (Criteria) this;
        }

        public Criteria andCheckNoLikeInsensitive(String value) {
            addCriterion("upper(CHECK_NO) like", value.toUpperCase(), "checkNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoLikeInsensitive(String value) {
            addCriterion("upper(DEPOSIT_NO) like", value.toUpperCase(), "depositNo");
            return (Criteria) this;
        }

        public Criteria andPayUserIdLikeInsensitive(String value) {
            addCriterion("upper(PAY_USER_ID) like", value.toUpperCase(), "payUserId");
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