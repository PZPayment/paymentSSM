package com.payment.domain;

import com.payment.comm.base.domain.AbstractCriteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PaymentOrderCriteria  extends AbstractCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentOrderCriteria() {
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

        public Criteria andPaymentNoIsNull() {
            addCriterion("PAYMENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNotNull() {
            addCriterion("PAYMENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoEqualTo(String value) {
            addCriterion("PAYMENT_NO =", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotEqualTo(String value) {
            addCriterion("PAYMENT_NO <>", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThan(String value) {
            addCriterion("PAYMENT_NO >", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_NO >=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThan(String value) {
            addCriterion("PAYMENT_NO <", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_NO <=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLike(String value) {
            addCriterion("PAYMENT_NO like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotLike(String value) {
            addCriterion("PAYMENT_NO not like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIn(List<String> values) {
            addCriterion("PAYMENT_NO in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotIn(List<String> values) {
            addCriterion("PAYMENT_NO not in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoBetween(String value1, String value2) {
            addCriterion("PAYMENT_NO between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_NO not between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoIsNull() {
            addCriterion("OUT_PAYMENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoIsNotNull() {
            addCriterion("OUT_PAYMENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoEqualTo(String value) {
            addCriterion("OUT_PAYMENT_NO =", value, "outPaymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoNotEqualTo(String value) {
            addCriterion("OUT_PAYMENT_NO <>", value, "outPaymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoGreaterThan(String value) {
            addCriterion("OUT_PAYMENT_NO >", value, "outPaymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_PAYMENT_NO >=", value, "outPaymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoLessThan(String value) {
            addCriterion("OUT_PAYMENT_NO <", value, "outPaymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_PAYMENT_NO <=", value, "outPaymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoLike(String value) {
            addCriterion("OUT_PAYMENT_NO like", value, "outPaymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoNotLike(String value) {
            addCriterion("OUT_PAYMENT_NO not like", value, "outPaymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoIn(List<String> values) {
            addCriterion("OUT_PAYMENT_NO in", values, "outPaymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoNotIn(List<String> values) {
            addCriterion("OUT_PAYMENT_NO not in", values, "outPaymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoBetween(String value1, String value2) {
            addCriterion("OUT_PAYMENT_NO between", value1, value2, "outPaymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoNotBetween(String value1, String value2) {
            addCriterion("OUT_PAYMENT_NO not between", value1, value2, "outPaymentNo");
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

        public Criteria andPaymentAmountIsNull() {
            addCriterion("PAYMENT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNotNull() {
            addCriterion("PAYMENT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountEqualTo(Long value) {
            addCriterion("PAYMENT_AMOUNT =", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotEqualTo(Long value) {
            addCriterion("PAYMENT_AMOUNT <>", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThan(Long value) {
            addCriterion("PAYMENT_AMOUNT >", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYMENT_AMOUNT >=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThan(Long value) {
            addCriterion("PAYMENT_AMOUNT <", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThanOrEqualTo(Long value) {
            addCriterion("PAYMENT_AMOUNT <=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIn(List<Long> values) {
            addCriterion("PAYMENT_AMOUNT in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotIn(List<Long> values) {
            addCriterion("PAYMENT_AMOUNT not in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountBetween(Long value1, Long value2) {
            addCriterion("PAYMENT_AMOUNT between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotBetween(Long value1, Long value2) {
            addCriterion("PAYMENT_AMOUNT not between", value1, value2, "paymentAmount");
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

        public Criteria andPaymentStateIsNull() {
            addCriterion("PAYMENT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNotNull() {
            addCriterion("PAYMENT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateEqualTo(Short value) {
            addCriterion("PAYMENT_STATE =", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotEqualTo(Short value) {
            addCriterion("PAYMENT_STATE <>", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThan(Short value) {
            addCriterion("PAYMENT_STATE >", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYMENT_STATE >=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThan(Short value) {
            addCriterion("PAYMENT_STATE <", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThanOrEqualTo(Short value) {
            addCriterion("PAYMENT_STATE <=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIn(List<Short> values) {
            addCriterion("PAYMENT_STATE in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotIn(List<Short> values) {
            addCriterion("PAYMENT_STATE not in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateBetween(Short value1, Short value2) {
            addCriterion("PAYMENT_STATE between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotBetween(Short value1, Short value2) {
            addCriterion("PAYMENT_STATE not between", value1, value2, "paymentState");
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

        public Criteria andSettleStateIsNull() {
            addCriterion("SETTLE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andSettleStateIsNotNull() {
            addCriterion("SETTLE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStateEqualTo(Short value) {
            addCriterion("SETTLE_STATE =", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateNotEqualTo(Short value) {
            addCriterion("SETTLE_STATE <>", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateGreaterThan(Short value) {
            addCriterion("SETTLE_STATE >", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateGreaterThanOrEqualTo(Short value) {
            addCriterion("SETTLE_STATE >=", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateLessThan(Short value) {
            addCriterion("SETTLE_STATE <", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateLessThanOrEqualTo(Short value) {
            addCriterion("SETTLE_STATE <=", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateIn(List<Short> values) {
            addCriterion("SETTLE_STATE in", values, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateNotIn(List<Short> values) {
            addCriterion("SETTLE_STATE not in", values, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateBetween(Short value1, Short value2) {
            addCriterion("SETTLE_STATE between", value1, value2, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateNotBetween(Short value1, Short value2) {
            addCriterion("SETTLE_STATE not between", value1, value2, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIsNull() {
            addCriterion("SETTLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIsNotNull() {
            addCriterion("SETTLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTypeEqualTo(String value) {
            addCriterion("SETTLE_TYPE =", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotEqualTo(String value) {
            addCriterion("SETTLE_TYPE <>", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeGreaterThan(String value) {
            addCriterion("SETTLE_TYPE >", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_TYPE >=", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLessThan(String value) {
            addCriterion("SETTLE_TYPE <", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_TYPE <=", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLike(String value) {
            addCriterion("SETTLE_TYPE like", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotLike(String value) {
            addCriterion("SETTLE_TYPE not like", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIn(List<String> values) {
            addCriterion("SETTLE_TYPE in", values, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotIn(List<String> values) {
            addCriterion("SETTLE_TYPE not in", values, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeBetween(String value1, String value2) {
            addCriterion("SETTLE_TYPE between", value1, value2, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotBetween(String value1, String value2) {
            addCriterion("SETTLE_TYPE not between", value1, value2, "settleType");
            return (Criteria) this;
        }

        public Criteria andPaymentIpIsNull() {
            addCriterion("PAYMENT_IP is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIpIsNotNull() {
            addCriterion("PAYMENT_IP is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIpEqualTo(String value) {
            addCriterion("PAYMENT_IP =", value, "paymentIp");
            return (Criteria) this;
        }

        public Criteria andPaymentIpNotEqualTo(String value) {
            addCriterion("PAYMENT_IP <>", value, "paymentIp");
            return (Criteria) this;
        }

        public Criteria andPaymentIpGreaterThan(String value) {
            addCriterion("PAYMENT_IP >", value, "paymentIp");
            return (Criteria) this;
        }

        public Criteria andPaymentIpGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_IP >=", value, "paymentIp");
            return (Criteria) this;
        }

        public Criteria andPaymentIpLessThan(String value) {
            addCriterion("PAYMENT_IP <", value, "paymentIp");
            return (Criteria) this;
        }

        public Criteria andPaymentIpLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_IP <=", value, "paymentIp");
            return (Criteria) this;
        }

        public Criteria andPaymentIpLike(String value) {
            addCriterion("PAYMENT_IP like", value, "paymentIp");
            return (Criteria) this;
        }

        public Criteria andPaymentIpNotLike(String value) {
            addCriterion("PAYMENT_IP not like", value, "paymentIp");
            return (Criteria) this;
        }

        public Criteria andPaymentIpIn(List<String> values) {
            addCriterion("PAYMENT_IP in", values, "paymentIp");
            return (Criteria) this;
        }

        public Criteria andPaymentIpNotIn(List<String> values) {
            addCriterion("PAYMENT_IP not in", values, "paymentIp");
            return (Criteria) this;
        }

        public Criteria andPaymentIpBetween(String value1, String value2) {
            addCriterion("PAYMENT_IP between", value1, value2, "paymentIp");
            return (Criteria) this;
        }

        public Criteria andPaymentIpNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_IP not between", value1, value2, "paymentIp");
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

        public Criteria andPaymentUserIdIsNull() {
            addCriterion("PAYMENT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdIsNotNull() {
            addCriterion("PAYMENT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdEqualTo(String value) {
            addCriterion("PAYMENT_USER_ID =", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdNotEqualTo(String value) {
            addCriterion("PAYMENT_USER_ID <>", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdGreaterThan(String value) {
            addCriterion("PAYMENT_USER_ID >", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_USER_ID >=", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdLessThan(String value) {
            addCriterion("PAYMENT_USER_ID <", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_USER_ID <=", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdLike(String value) {
            addCriterion("PAYMENT_USER_ID like", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdNotLike(String value) {
            addCriterion("PAYMENT_USER_ID not like", value, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdIn(List<String> values) {
            addCriterion("PAYMENT_USER_ID in", values, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdNotIn(List<String> values) {
            addCriterion("PAYMENT_USER_ID not in", values, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdBetween(String value1, String value2) {
            addCriterion("PAYMENT_USER_ID between", value1, value2, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_USER_ID not between", value1, value2, "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdIsNull() {
            addCriterion("SELLER_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdIsNotNull() {
            addCriterion("SELLER_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdEqualTo(String value) {
            addCriterion("SELLER_USER_ID =", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdNotEqualTo(String value) {
            addCriterion("SELLER_USER_ID <>", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdGreaterThan(String value) {
            addCriterion("SELLER_USER_ID >", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_USER_ID >=", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdLessThan(String value) {
            addCriterion("SELLER_USER_ID <", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdLessThanOrEqualTo(String value) {
            addCriterion("SELLER_USER_ID <=", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdLike(String value) {
            addCriterion("SELLER_USER_ID like", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdNotLike(String value) {
            addCriterion("SELLER_USER_ID not like", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdIn(List<String> values) {
            addCriterion("SELLER_USER_ID in", values, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdNotIn(List<String> values) {
            addCriterion("SELLER_USER_ID not in", values, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdBetween(String value1, String value2) {
            addCriterion("SELLER_USER_ID between", value1, value2, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdNotBetween(String value1, String value2) {
            addCriterion("SELLER_USER_ID not between", value1, value2, "sellerUserId");
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

        public Criteria andGateCodeIsNull() {
            addCriterion("GATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGateCodeIsNotNull() {
            addCriterion("GATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGateCodeEqualTo(String value) {
            addCriterion("GATE_CODE =", value, "gateCode");
            return (Criteria) this;
        }

        public Criteria andGateCodeNotEqualTo(String value) {
            addCriterion("GATE_CODE <>", value, "gateCode");
            return (Criteria) this;
        }

        public Criteria andGateCodeGreaterThan(String value) {
            addCriterion("GATE_CODE >", value, "gateCode");
            return (Criteria) this;
        }

        public Criteria andGateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GATE_CODE >=", value, "gateCode");
            return (Criteria) this;
        }

        public Criteria andGateCodeLessThan(String value) {
            addCriterion("GATE_CODE <", value, "gateCode");
            return (Criteria) this;
        }

        public Criteria andGateCodeLessThanOrEqualTo(String value) {
            addCriterion("GATE_CODE <=", value, "gateCode");
            return (Criteria) this;
        }

        public Criteria andGateCodeLike(String value) {
            addCriterion("GATE_CODE like", value, "gateCode");
            return (Criteria) this;
        }

        public Criteria andGateCodeNotLike(String value) {
            addCriterion("GATE_CODE not like", value, "gateCode");
            return (Criteria) this;
        }

        public Criteria andGateCodeIn(List<String> values) {
            addCriterion("GATE_CODE in", values, "gateCode");
            return (Criteria) this;
        }

        public Criteria andGateCodeNotIn(List<String> values) {
            addCriterion("GATE_CODE not in", values, "gateCode");
            return (Criteria) this;
        }

        public Criteria andGateCodeBetween(String value1, String value2) {
            addCriterion("GATE_CODE between", value1, value2, "gateCode");
            return (Criteria) this;
        }

        public Criteria andGateCodeNotBetween(String value1, String value2) {
            addCriterion("GATE_CODE not between", value1, value2, "gateCode");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlIsNull() {
            addCriterion("CALL_BACK_URL is null");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlIsNotNull() {
            addCriterion("CALL_BACK_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlEqualTo(String value) {
            addCriterion("CALL_BACK_URL =", value, "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlNotEqualTo(String value) {
            addCriterion("CALL_BACK_URL <>", value, "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlGreaterThan(String value) {
            addCriterion("CALL_BACK_URL >", value, "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_BACK_URL >=", value, "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlLessThan(String value) {
            addCriterion("CALL_BACK_URL <", value, "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlLessThanOrEqualTo(String value) {
            addCriterion("CALL_BACK_URL <=", value, "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlLike(String value) {
            addCriterion("CALL_BACK_URL like", value, "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlNotLike(String value) {
            addCriterion("CALL_BACK_URL not like", value, "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlIn(List<String> values) {
            addCriterion("CALL_BACK_URL in", values, "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlNotIn(List<String> values) {
            addCriterion("CALL_BACK_URL not in", values, "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlBetween(String value1, String value2) {
            addCriterion("CALL_BACK_URL between", value1, value2, "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlNotBetween(String value1, String value2) {
            addCriterion("CALL_BACK_URL not between", value1, value2, "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("NOTIFY_URL is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("NOTIFY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("NOTIFY_URL =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("NOTIFY_URL <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("NOTIFY_URL >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_URL >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("NOTIFY_URL <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_URL <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("NOTIFY_URL like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("NOTIFY_URL not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("NOTIFY_URL in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("NOTIFY_URL not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("NOTIFY_URL between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_URL not between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLikeInsensitive(String value) {
            addCriterion("upper(PAYMENT_NO) like", value.toUpperCase(), "paymentNo");
            return (Criteria) this;
        }

        public Criteria andOutPaymentNoLikeInsensitive(String value) {
            addCriterion("upper(OUT_PAYMENT_NO) like", value.toUpperCase(), "outPaymentNo");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLikeInsensitive(String value) {
            addCriterion("upper(SETTLE_TYPE) like", value.toUpperCase(), "settleType");
            return (Criteria) this;
        }

        public Criteria andPaymentIpLikeInsensitive(String value) {
            addCriterion("upper(PAYMENT_IP) like", value.toUpperCase(), "paymentIp");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andPaymentUserIdLikeInsensitive(String value) {
            addCriterion("upper(PAYMENT_USER_ID) like", value.toUpperCase(), "paymentUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdLikeInsensitive(String value) {
            addCriterion("upper(SELLER_USER_ID) like", value.toUpperCase(), "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andPayTypeLikeInsensitive(String value) {
            addCriterion("upper(PAY_TYPE) like", value.toUpperCase(), "payType");
            return (Criteria) this;
        }

        public Criteria andGateCodeLikeInsensitive(String value) {
            addCriterion("upper(GATE_CODE) like", value.toUpperCase(), "gateCode");
            return (Criteria) this;
        }

        public Criteria andCallBackUrlLikeInsensitive(String value) {
            addCriterion("upper(CALL_BACK_URL) like", value.toUpperCase(), "callBackUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLikeInsensitive(String value) {
            addCriterion("upper(NOTIFY_URL) like", value.toUpperCase(), "notifyUrl");
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