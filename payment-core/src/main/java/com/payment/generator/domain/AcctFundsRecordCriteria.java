package com.payment.generator.domain;

import com.payment.comm.base.domain.AbstractCriteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctFundsRecordCriteria extends AbstractCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctFundsRecordCriteria() {
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

        public Criteria andFundsIdIsNull() {
            addCriterion("FUNDS_ID is null");
            return (Criteria) this;
        }

        public Criteria andFundsIdIsNotNull() {
            addCriterion("FUNDS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFundsIdEqualTo(String value) {
            addCriterion("FUNDS_ID =", value, "fundsId");
            return (Criteria) this;
        }

        public Criteria andFundsIdNotEqualTo(String value) {
            addCriterion("FUNDS_ID <>", value, "fundsId");
            return (Criteria) this;
        }

        public Criteria andFundsIdGreaterThan(String value) {
            addCriterion("FUNDS_ID >", value, "fundsId");
            return (Criteria) this;
        }

        public Criteria andFundsIdGreaterThanOrEqualTo(String value) {
            addCriterion("FUNDS_ID >=", value, "fundsId");
            return (Criteria) this;
        }

        public Criteria andFundsIdLessThan(String value) {
            addCriterion("FUNDS_ID <", value, "fundsId");
            return (Criteria) this;
        }

        public Criteria andFundsIdLessThanOrEqualTo(String value) {
            addCriterion("FUNDS_ID <=", value, "fundsId");
            return (Criteria) this;
        }

        public Criteria andFundsIdLike(String value) {
            addCriterion("FUNDS_ID like", value, "fundsId");
            return (Criteria) this;
        }

        public Criteria andFundsIdNotLike(String value) {
            addCriterion("FUNDS_ID not like", value, "fundsId");
            return (Criteria) this;
        }

        public Criteria andFundsIdIn(List<String> values) {
            addCriterion("FUNDS_ID in", values, "fundsId");
            return (Criteria) this;
        }

        public Criteria andFundsIdNotIn(List<String> values) {
            addCriterion("FUNDS_ID not in", values, "fundsId");
            return (Criteria) this;
        }

        public Criteria andFundsIdBetween(String value1, String value2) {
            addCriterion("FUNDS_ID between", value1, value2, "fundsId");
            return (Criteria) this;
        }

        public Criteria andFundsIdNotBetween(String value1, String value2) {
            addCriterion("FUNDS_ID not between", value1, value2, "fundsId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdIsNull() {
            addCriterion("TRADE_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdIsNotNull() {
            addCriterion("TRADE_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdEqualTo(Integer value) {
            addCriterion("TRADE_TYPE_ID =", value, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdNotEqualTo(Integer value) {
            addCriterion("TRADE_TYPE_ID <>", value, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdGreaterThan(Integer value) {
            addCriterion("TRADE_TYPE_ID >", value, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRADE_TYPE_ID >=", value, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdLessThan(Integer value) {
            addCriterion("TRADE_TYPE_ID <", value, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRADE_TYPE_ID <=", value, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdIn(List<Integer> values) {
            addCriterion("TRADE_TYPE_ID in", values, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdNotIn(List<Integer> values) {
            addCriterion("TRADE_TYPE_ID not in", values, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("TRADE_TYPE_ID between", value1, value2, "tradeTypeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRADE_TYPE_ID not between", value1, value2, "tradeTypeId");
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

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountIsNull() {
            addCriterion("PAYOUT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountIsNotNull() {
            addCriterion("PAYOUT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountEqualTo(Long value) {
            addCriterion("PAYOUT_AMOUNT =", value, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountNotEqualTo(Long value) {
            addCriterion("PAYOUT_AMOUNT <>", value, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountGreaterThan(Long value) {
            addCriterion("PAYOUT_AMOUNT >", value, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYOUT_AMOUNT >=", value, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountLessThan(Long value) {
            addCriterion("PAYOUT_AMOUNT <", value, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountLessThanOrEqualTo(Long value) {
            addCriterion("PAYOUT_AMOUNT <=", value, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountIn(List<Long> values) {
            addCriterion("PAYOUT_AMOUNT in", values, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountNotIn(List<Long> values) {
            addCriterion("PAYOUT_AMOUNT not in", values, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountBetween(Long value1, Long value2) {
            addCriterion("PAYOUT_AMOUNT between", value1, value2, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountNotBetween(Long value1, Long value2) {
            addCriterion("PAYOUT_AMOUNT not between", value1, value2, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountIsNull() {
            addCriterion("INCOME_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountIsNotNull() {
            addCriterion("INCOME_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountEqualTo(Long value) {
            addCriterion("INCOME_AMOUNT =", value, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountNotEqualTo(Long value) {
            addCriterion("INCOME_AMOUNT <>", value, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountGreaterThan(Long value) {
            addCriterion("INCOME_AMOUNT >", value, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("INCOME_AMOUNT >=", value, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountLessThan(Long value) {
            addCriterion("INCOME_AMOUNT <", value, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountLessThanOrEqualTo(Long value) {
            addCriterion("INCOME_AMOUNT <=", value, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountIn(List<Long> values) {
            addCriterion("INCOME_AMOUNT in", values, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountNotIn(List<Long> values) {
            addCriterion("INCOME_AMOUNT not in", values, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountBetween(Long value1, Long value2) {
            addCriterion("INCOME_AMOUNT between", value1, value2, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountNotBetween(Long value1, Long value2) {
            addCriterion("INCOME_AMOUNT not between", value1, value2, "incomeAmount");
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

        public Criteria andOutOrderNoIsNull() {
            addCriterion("OUT_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoIsNotNull() {
            addCriterion("OUT_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoEqualTo(String value) {
            addCriterion("OUT_ORDER_NO =", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotEqualTo(String value) {
            addCriterion("OUT_ORDER_NO <>", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoGreaterThan(String value) {
            addCriterion("OUT_ORDER_NO >", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_ORDER_NO >=", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLessThan(String value) {
            addCriterion("OUT_ORDER_NO <", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_ORDER_NO <=", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLike(String value) {
            addCriterion("OUT_ORDER_NO like", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotLike(String value) {
            addCriterion("OUT_ORDER_NO not like", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoIn(List<String> values) {
            addCriterion("OUT_ORDER_NO in", values, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotIn(List<String> values) {
            addCriterion("OUT_ORDER_NO not in", values, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoBetween(String value1, String value2) {
            addCriterion("OUT_ORDER_NO between", value1, value2, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotBetween(String value1, String value2) {
            addCriterion("OUT_ORDER_NO not between", value1, value2, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("ORDER_NO like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("ORDER_NO not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andFundsNameIsNull() {
            addCriterion("FUNDS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFundsNameIsNotNull() {
            addCriterion("FUNDS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFundsNameEqualTo(String value) {
            addCriterion("FUNDS_NAME =", value, "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsNameNotEqualTo(String value) {
            addCriterion("FUNDS_NAME <>", value, "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsNameGreaterThan(String value) {
            addCriterion("FUNDS_NAME >", value, "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsNameGreaterThanOrEqualTo(String value) {
            addCriterion("FUNDS_NAME >=", value, "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsNameLessThan(String value) {
            addCriterion("FUNDS_NAME <", value, "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsNameLessThanOrEqualTo(String value) {
            addCriterion("FUNDS_NAME <=", value, "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsNameLike(String value) {
            addCriterion("FUNDS_NAME like", value, "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsNameNotLike(String value) {
            addCriterion("FUNDS_NAME not like", value, "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsNameIn(List<String> values) {
            addCriterion("FUNDS_NAME in", values, "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsNameNotIn(List<String> values) {
            addCriterion("FUNDS_NAME not in", values, "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsNameBetween(String value1, String value2) {
            addCriterion("FUNDS_NAME between", value1, value2, "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsNameNotBetween(String value1, String value2) {
            addCriterion("FUNDS_NAME not between", value1, value2, "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsDescIsNull() {
            addCriterion("FUNDS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andFundsDescIsNotNull() {
            addCriterion("FUNDS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andFundsDescEqualTo(String value) {
            addCriterion("FUNDS_DESC =", value, "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andFundsDescNotEqualTo(String value) {
            addCriterion("FUNDS_DESC <>", value, "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andFundsDescGreaterThan(String value) {
            addCriterion("FUNDS_DESC >", value, "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andFundsDescGreaterThanOrEqualTo(String value) {
            addCriterion("FUNDS_DESC >=", value, "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andFundsDescLessThan(String value) {
            addCriterion("FUNDS_DESC <", value, "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andFundsDescLessThanOrEqualTo(String value) {
            addCriterion("FUNDS_DESC <=", value, "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andFundsDescLike(String value) {
            addCriterion("FUNDS_DESC like", value, "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andFundsDescNotLike(String value) {
            addCriterion("FUNDS_DESC not like", value, "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andFundsDescIn(List<String> values) {
            addCriterion("FUNDS_DESC in", values, "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andFundsDescNotIn(List<String> values) {
            addCriterion("FUNDS_DESC not in", values, "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andFundsDescBetween(String value1, String value2) {
            addCriterion("FUNDS_DESC between", value1, value2, "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andFundsDescNotBetween(String value1, String value2) {
            addCriterion("FUNDS_DESC not between", value1, value2, "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andInOutTypeIsNull() {
            addCriterion("IN_OUT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInOutTypeIsNotNull() {
            addCriterion("IN_OUT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInOutTypeEqualTo(Short value) {
            addCriterion("IN_OUT_TYPE =", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeNotEqualTo(Short value) {
            addCriterion("IN_OUT_TYPE <>", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeGreaterThan(Short value) {
            addCriterion("IN_OUT_TYPE >", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("IN_OUT_TYPE >=", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeLessThan(Short value) {
            addCriterion("IN_OUT_TYPE <", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeLessThanOrEqualTo(Short value) {
            addCriterion("IN_OUT_TYPE <=", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeIn(List<Short> values) {
            addCriterion("IN_OUT_TYPE in", values, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeNotIn(List<Short> values) {
            addCriterion("IN_OUT_TYPE not in", values, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeBetween(Short value1, Short value2) {
            addCriterion("IN_OUT_TYPE between", value1, value2, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeNotBetween(Short value1, Short value2) {
            addCriterion("IN_OUT_TYPE not between", value1, value2, "inOutType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIdIsNull() {
            addCriterion("BUSI_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIdIsNotNull() {
            addCriterion("BUSI_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIdEqualTo(Integer value) {
            addCriterion("BUSI_TYPE_ID =", value, "busiTypeId");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIdNotEqualTo(Integer value) {
            addCriterion("BUSI_TYPE_ID <>", value, "busiTypeId");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIdGreaterThan(Integer value) {
            addCriterion("BUSI_TYPE_ID >", value, "busiTypeId");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUSI_TYPE_ID >=", value, "busiTypeId");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIdLessThan(Integer value) {
            addCriterion("BUSI_TYPE_ID <", value, "busiTypeId");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUSI_TYPE_ID <=", value, "busiTypeId");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIdIn(List<Integer> values) {
            addCriterion("BUSI_TYPE_ID in", values, "busiTypeId");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIdNotIn(List<Integer> values) {
            addCriterion("BUSI_TYPE_ID not in", values, "busiTypeId");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("BUSI_TYPE_ID between", value1, value2, "busiTypeId");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BUSI_TYPE_ID not between", value1, value2, "busiTypeId");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameIsNull() {
            addCriterion("BUSI_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameIsNotNull() {
            addCriterion("BUSI_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameEqualTo(String value) {
            addCriterion("BUSI_TYPE_NAME =", value, "busiTypeName");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameNotEqualTo(String value) {
            addCriterion("BUSI_TYPE_NAME <>", value, "busiTypeName");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameGreaterThan(String value) {
            addCriterion("BUSI_TYPE_NAME >", value, "busiTypeName");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_TYPE_NAME >=", value, "busiTypeName");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameLessThan(String value) {
            addCriterion("BUSI_TYPE_NAME <", value, "busiTypeName");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameLessThanOrEqualTo(String value) {
            addCriterion("BUSI_TYPE_NAME <=", value, "busiTypeName");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameLike(String value) {
            addCriterion("BUSI_TYPE_NAME like", value, "busiTypeName");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameNotLike(String value) {
            addCriterion("BUSI_TYPE_NAME not like", value, "busiTypeName");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameIn(List<String> values) {
            addCriterion("BUSI_TYPE_NAME in", values, "busiTypeName");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameNotIn(List<String> values) {
            addCriterion("BUSI_TYPE_NAME not in", values, "busiTypeName");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameBetween(String value1, String value2) {
            addCriterion("BUSI_TYPE_NAME between", value1, value2, "busiTypeName");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameNotBetween(String value1, String value2) {
            addCriterion("BUSI_TYPE_NAME not between", value1, value2, "busiTypeName");
            return (Criteria) this;
        }

        public Criteria andFundsIdLikeInsensitive(String value) {
            addCriterion("upper(FUNDS_ID) like", value.toUpperCase(), "fundsId");
            return (Criteria) this;
        }

        public Criteria andUserIdLikeInsensitive(String value) {
            addCriterion("upper(USER_ID) like", value.toUpperCase(), "userId");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLikeInsensitive(String value) {
            addCriterion("upper(OUT_ORDER_NO) like", value.toUpperCase(), "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLikeInsensitive(String value) {
            addCriterion("upper(ORDER_NO) like", value.toUpperCase(), "orderNo");
            return (Criteria) this;
        }

        public Criteria andFundsNameLikeInsensitive(String value) {
            addCriterion("upper(FUNDS_NAME) like", value.toUpperCase(), "fundsName");
            return (Criteria) this;
        }

        public Criteria andFundsDescLikeInsensitive(String value) {
            addCriterion("upper(FUNDS_DESC) like", value.toUpperCase(), "fundsDesc");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNameLikeInsensitive(String value) {
            addCriterion("upper(BUSI_TYPE_NAME) like", value.toUpperCase(), "busiTypeName");
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