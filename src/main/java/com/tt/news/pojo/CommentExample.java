package com.tt.news.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnidIsNull() {
            addCriterion("cnid is null");
            return (Criteria) this;
        }

        public Criteria andCnidIsNotNull() {
            addCriterion("cnid is not null");
            return (Criteria) this;
        }

        public Criteria andCnidEqualTo(Integer value) {
            addCriterion("cnid =", value, "cnid");
            return (Criteria) this;
        }

        public Criteria andCnidNotEqualTo(Integer value) {
            addCriterion("cnid <>", value, "cnid");
            return (Criteria) this;
        }

        public Criteria andCnidGreaterThan(Integer value) {
            addCriterion("cnid >", value, "cnid");
            return (Criteria) this;
        }

        public Criteria andCnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnid >=", value, "cnid");
            return (Criteria) this;
        }

        public Criteria andCnidLessThan(Integer value) {
            addCriterion("cnid <", value, "cnid");
            return (Criteria) this;
        }

        public Criteria andCnidLessThanOrEqualTo(Integer value) {
            addCriterion("cnid <=", value, "cnid");
            return (Criteria) this;
        }

        public Criteria andCnidIn(List<Integer> values) {
            addCriterion("cnid in", values, "cnid");
            return (Criteria) this;
        }

        public Criteria andCnidNotIn(List<Integer> values) {
            addCriterion("cnid not in", values, "cnid");
            return (Criteria) this;
        }

        public Criteria andCnidBetween(Integer value1, Integer value2) {
            addCriterion("cnid between", value1, value2, "cnid");
            return (Criteria) this;
        }

        public Criteria andCnidNotBetween(Integer value1, Integer value2) {
            addCriterion("cnid not between", value1, value2, "cnid");
            return (Criteria) this;
        }

        public Criteria andCcontentIsNull() {
            addCriterion("ccontent is null");
            return (Criteria) this;
        }

        public Criteria andCcontentIsNotNull() {
            addCriterion("ccontent is not null");
            return (Criteria) this;
        }

        public Criteria andCcontentEqualTo(String value) {
            addCriterion("ccontent =", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotEqualTo(String value) {
            addCriterion("ccontent <>", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentGreaterThan(String value) {
            addCriterion("ccontent >", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentGreaterThanOrEqualTo(String value) {
            addCriterion("ccontent >=", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentLessThan(String value) {
            addCriterion("ccontent <", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentLessThanOrEqualTo(String value) {
            addCriterion("ccontent <=", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentLike(String value) {
            addCriterion("ccontent like", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotLike(String value) {
            addCriterion("ccontent not like", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentIn(List<String> values) {
            addCriterion("ccontent in", values, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotIn(List<String> values) {
            addCriterion("ccontent not in", values, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentBetween(String value1, String value2) {
            addCriterion("ccontent between", value1, value2, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotBetween(String value1, String value2) {
            addCriterion("ccontent not between", value1, value2, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCdateIsNull() {
            addCriterion("cdate is null");
            return (Criteria) this;
        }

        public Criteria andCdateIsNotNull() {
            addCriterion("cdate is not null");
            return (Criteria) this;
        }

        public Criteria andCdateEqualTo(Date value) {
            addCriterion("cdate =", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotEqualTo(Date value) {
            addCriterion("cdate <>", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThan(Date value) {
            addCriterion("cdate >", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cdate >=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThan(Date value) {
            addCriterion("cdate <", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThanOrEqualTo(Date value) {
            addCriterion("cdate <=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateIn(List<Date> values) {
            addCriterion("cdate in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotIn(List<Date> values) {
            addCriterion("cdate not in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateBetween(Date value1, Date value2) {
            addCriterion("cdate between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotBetween(Date value1, Date value2) {
            addCriterion("cdate not between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCipIsNull() {
            addCriterion("cip is null");
            return (Criteria) this;
        }

        public Criteria andCipIsNotNull() {
            addCriterion("cip is not null");
            return (Criteria) this;
        }

        public Criteria andCipEqualTo(String value) {
            addCriterion("cip =", value, "cip");
            return (Criteria) this;
        }

        public Criteria andCipNotEqualTo(String value) {
            addCriterion("cip <>", value, "cip");
            return (Criteria) this;
        }

        public Criteria andCipGreaterThan(String value) {
            addCriterion("cip >", value, "cip");
            return (Criteria) this;
        }

        public Criteria andCipGreaterThanOrEqualTo(String value) {
            addCriterion("cip >=", value, "cip");
            return (Criteria) this;
        }

        public Criteria andCipLessThan(String value) {
            addCriterion("cip <", value, "cip");
            return (Criteria) this;
        }

        public Criteria andCipLessThanOrEqualTo(String value) {
            addCriterion("cip <=", value, "cip");
            return (Criteria) this;
        }

        public Criteria andCipLike(String value) {
            addCriterion("cip like", value, "cip");
            return (Criteria) this;
        }

        public Criteria andCipNotLike(String value) {
            addCriterion("cip not like", value, "cip");
            return (Criteria) this;
        }

        public Criteria andCipIn(List<String> values) {
            addCriterion("cip in", values, "cip");
            return (Criteria) this;
        }

        public Criteria andCipNotIn(List<String> values) {
            addCriterion("cip not in", values, "cip");
            return (Criteria) this;
        }

        public Criteria andCipBetween(String value1, String value2) {
            addCriterion("cip between", value1, value2, "cip");
            return (Criteria) this;
        }

        public Criteria andCipNotBetween(String value1, String value2) {
            addCriterion("cip not between", value1, value2, "cip");
            return (Criteria) this;
        }

        public Criteria andCauthorIsNull() {
            addCriterion("cauthor is null");
            return (Criteria) this;
        }

        public Criteria andCauthorIsNotNull() {
            addCriterion("cauthor is not null");
            return (Criteria) this;
        }

        public Criteria andCauthorEqualTo(String value) {
            addCriterion("cauthor =", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorNotEqualTo(String value) {
            addCriterion("cauthor <>", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorGreaterThan(String value) {
            addCriterion("cauthor >", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorGreaterThanOrEqualTo(String value) {
            addCriterion("cauthor >=", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorLessThan(String value) {
            addCriterion("cauthor <", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorLessThanOrEqualTo(String value) {
            addCriterion("cauthor <=", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorLike(String value) {
            addCriterion("cauthor like", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorNotLike(String value) {
            addCriterion("cauthor not like", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorIn(List<String> values) {
            addCriterion("cauthor in", values, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorNotIn(List<String> values) {
            addCriterion("cauthor not in", values, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorBetween(String value1, String value2) {
            addCriterion("cauthor between", value1, value2, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorNotBetween(String value1, String value2) {
            addCriterion("cauthor not between", value1, value2, "cauthor");
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