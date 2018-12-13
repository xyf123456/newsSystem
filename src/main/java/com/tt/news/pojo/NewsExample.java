package com.tt.news.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Integer value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Integer value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Integer value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Integer value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Integer value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Integer> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Integer> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Integer value1, Integer value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Integer value1, Integer value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNtidIsNull() {
            addCriterion("ntid is null");
            return (Criteria) this;
        }

        public Criteria andNtidIsNotNull() {
            addCriterion("ntid is not null");
            return (Criteria) this;
        }

        public Criteria andNtidEqualTo(Integer value) {
            addCriterion("ntid =", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidNotEqualTo(Integer value) {
            addCriterion("ntid <>", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidGreaterThan(Integer value) {
            addCriterion("ntid >", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ntid >=", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidLessThan(Integer value) {
            addCriterion("ntid <", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidLessThanOrEqualTo(Integer value) {
            addCriterion("ntid <=", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidIn(List<Integer> values) {
            addCriterion("ntid in", values, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidNotIn(List<Integer> values) {
            addCriterion("ntid not in", values, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidBetween(Integer value1, Integer value2) {
            addCriterion("ntid between", value1, value2, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidNotBetween(Integer value1, Integer value2) {
            addCriterion("ntid not between", value1, value2, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtitleIsNull() {
            addCriterion("ntitle is null");
            return (Criteria) this;
        }

        public Criteria andNtitleIsNotNull() {
            addCriterion("ntitle is not null");
            return (Criteria) this;
        }

        public Criteria andNtitleEqualTo(String value) {
            addCriterion("ntitle =", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotEqualTo(String value) {
            addCriterion("ntitle <>", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleGreaterThan(String value) {
            addCriterion("ntitle >", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleGreaterThanOrEqualTo(String value) {
            addCriterion("ntitle >=", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleLessThan(String value) {
            addCriterion("ntitle <", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleLessThanOrEqualTo(String value) {
            addCriterion("ntitle <=", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleLike(String value) {
            addCriterion("ntitle like", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotLike(String value) {
            addCriterion("ntitle not like", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleIn(List<String> values) {
            addCriterion("ntitle in", values, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotIn(List<String> values) {
            addCriterion("ntitle not in", values, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleBetween(String value1, String value2) {
            addCriterion("ntitle between", value1, value2, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotBetween(String value1, String value2) {
            addCriterion("ntitle not between", value1, value2, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNauthorIsNull() {
            addCriterion("nauthor is null");
            return (Criteria) this;
        }

        public Criteria andNauthorIsNotNull() {
            addCriterion("nauthor is not null");
            return (Criteria) this;
        }

        public Criteria andNauthorEqualTo(String value) {
            addCriterion("nauthor =", value, "nauthor");
            return (Criteria) this;
        }

        public Criteria andNauthorNotEqualTo(String value) {
            addCriterion("nauthor <>", value, "nauthor");
            return (Criteria) this;
        }

        public Criteria andNauthorGreaterThan(String value) {
            addCriterion("nauthor >", value, "nauthor");
            return (Criteria) this;
        }

        public Criteria andNauthorGreaterThanOrEqualTo(String value) {
            addCriterion("nauthor >=", value, "nauthor");
            return (Criteria) this;
        }

        public Criteria andNauthorLessThan(String value) {
            addCriterion("nauthor <", value, "nauthor");
            return (Criteria) this;
        }

        public Criteria andNauthorLessThanOrEqualTo(String value) {
            addCriterion("nauthor <=", value, "nauthor");
            return (Criteria) this;
        }

        public Criteria andNauthorLike(String value) {
            addCriterion("nauthor like", value, "nauthor");
            return (Criteria) this;
        }

        public Criteria andNauthorNotLike(String value) {
            addCriterion("nauthor not like", value, "nauthor");
            return (Criteria) this;
        }

        public Criteria andNauthorIn(List<String> values) {
            addCriterion("nauthor in", values, "nauthor");
            return (Criteria) this;
        }

        public Criteria andNauthorNotIn(List<String> values) {
            addCriterion("nauthor not in", values, "nauthor");
            return (Criteria) this;
        }

        public Criteria andNauthorBetween(String value1, String value2) {
            addCriterion("nauthor between", value1, value2, "nauthor");
            return (Criteria) this;
        }

        public Criteria andNauthorNotBetween(String value1, String value2) {
            addCriterion("nauthor not between", value1, value2, "nauthor");
            return (Criteria) this;
        }

        public Criteria andNcreatedateIsNull() {
            addCriterion("ncreateDate is null");
            return (Criteria) this;
        }

        public Criteria andNcreatedateIsNotNull() {
            addCriterion("ncreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andNcreatedateEqualTo(Date value) {
            addCriterion("ncreateDate =", value, "ncreatedate");
            return (Criteria) this;
        }

        public Criteria andNcreatedateNotEqualTo(Date value) {
            addCriterion("ncreateDate <>", value, "ncreatedate");
            return (Criteria) this;
        }

        public Criteria andNcreatedateGreaterThan(Date value) {
            addCriterion("ncreateDate >", value, "ncreatedate");
            return (Criteria) this;
        }

        public Criteria andNcreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ncreateDate >=", value, "ncreatedate");
            return (Criteria) this;
        }

        public Criteria andNcreatedateLessThan(Date value) {
            addCriterion("ncreateDate <", value, "ncreatedate");
            return (Criteria) this;
        }

        public Criteria andNcreatedateLessThanOrEqualTo(Date value) {
            addCriterion("ncreateDate <=", value, "ncreatedate");
            return (Criteria) this;
        }

        public Criteria andNcreatedateIn(List<Date> values) {
            addCriterion("ncreateDate in", values, "ncreatedate");
            return (Criteria) this;
        }

        public Criteria andNcreatedateNotIn(List<Date> values) {
            addCriterion("ncreateDate not in", values, "ncreatedate");
            return (Criteria) this;
        }

        public Criteria andNcreatedateBetween(Date value1, Date value2) {
            addCriterion("ncreateDate between", value1, value2, "ncreatedate");
            return (Criteria) this;
        }

        public Criteria andNcreatedateNotBetween(Date value1, Date value2) {
            addCriterion("ncreateDate not between", value1, value2, "ncreatedate");
            return (Criteria) this;
        }

        public Criteria andNpicpathIsNull() {
            addCriterion("npicPath is null");
            return (Criteria) this;
        }

        public Criteria andNpicpathIsNotNull() {
            addCriterion("npicPath is not null");
            return (Criteria) this;
        }

        public Criteria andNpicpathEqualTo(String value) {
            addCriterion("npicPath =", value, "npicpath");
            return (Criteria) this;
        }

        public Criteria andNpicpathNotEqualTo(String value) {
            addCriterion("npicPath <>", value, "npicpath");
            return (Criteria) this;
        }

        public Criteria andNpicpathGreaterThan(String value) {
            addCriterion("npicPath >", value, "npicpath");
            return (Criteria) this;
        }

        public Criteria andNpicpathGreaterThanOrEqualTo(String value) {
            addCriterion("npicPath >=", value, "npicpath");
            return (Criteria) this;
        }

        public Criteria andNpicpathLessThan(String value) {
            addCriterion("npicPath <", value, "npicpath");
            return (Criteria) this;
        }

        public Criteria andNpicpathLessThanOrEqualTo(String value) {
            addCriterion("npicPath <=", value, "npicpath");
            return (Criteria) this;
        }

        public Criteria andNpicpathLike(String value) {
            addCriterion("npicPath like", value, "npicpath");
            return (Criteria) this;
        }

        public Criteria andNpicpathNotLike(String value) {
            addCriterion("npicPath not like", value, "npicpath");
            return (Criteria) this;
        }

        public Criteria andNpicpathIn(List<String> values) {
            addCriterion("npicPath in", values, "npicpath");
            return (Criteria) this;
        }

        public Criteria andNpicpathNotIn(List<String> values) {
            addCriterion("npicPath not in", values, "npicpath");
            return (Criteria) this;
        }

        public Criteria andNpicpathBetween(String value1, String value2) {
            addCriterion("npicPath between", value1, value2, "npicpath");
            return (Criteria) this;
        }

        public Criteria andNpicpathNotBetween(String value1, String value2) {
            addCriterion("npicPath not between", value1, value2, "npicpath");
            return (Criteria) this;
        }

        public Criteria andNmodifydateIsNull() {
            addCriterion("nmodifyDate is null");
            return (Criteria) this;
        }

        public Criteria andNmodifydateIsNotNull() {
            addCriterion("nmodifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andNmodifydateEqualTo(Date value) {
            addCriterion("nmodifyDate =", value, "nmodifydate");
            return (Criteria) this;
        }

        public Criteria andNmodifydateNotEqualTo(Date value) {
            addCriterion("nmodifyDate <>", value, "nmodifydate");
            return (Criteria) this;
        }

        public Criteria andNmodifydateGreaterThan(Date value) {
            addCriterion("nmodifyDate >", value, "nmodifydate");
            return (Criteria) this;
        }

        public Criteria andNmodifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("nmodifyDate >=", value, "nmodifydate");
            return (Criteria) this;
        }

        public Criteria andNmodifydateLessThan(Date value) {
            addCriterion("nmodifyDate <", value, "nmodifydate");
            return (Criteria) this;
        }

        public Criteria andNmodifydateLessThanOrEqualTo(Date value) {
            addCriterion("nmodifyDate <=", value, "nmodifydate");
            return (Criteria) this;
        }

        public Criteria andNmodifydateIn(List<Date> values) {
            addCriterion("nmodifyDate in", values, "nmodifydate");
            return (Criteria) this;
        }

        public Criteria andNmodifydateNotIn(List<Date> values) {
            addCriterion("nmodifyDate not in", values, "nmodifydate");
            return (Criteria) this;
        }

        public Criteria andNmodifydateBetween(Date value1, Date value2) {
            addCriterion("nmodifyDate between", value1, value2, "nmodifydate");
            return (Criteria) this;
        }

        public Criteria andNmodifydateNotBetween(Date value1, Date value2) {
            addCriterion("nmodifyDate not between", value1, value2, "nmodifydate");
            return (Criteria) this;
        }

        public Criteria andNsummaryIsNull() {
            addCriterion("nsummary is null");
            return (Criteria) this;
        }

        public Criteria andNsummaryIsNotNull() {
            addCriterion("nsummary is not null");
            return (Criteria) this;
        }

        public Criteria andNsummaryEqualTo(String value) {
            addCriterion("nsummary =", value, "nsummary");
            return (Criteria) this;
        }

        public Criteria andNsummaryNotEqualTo(String value) {
            addCriterion("nsummary <>", value, "nsummary");
            return (Criteria) this;
        }

        public Criteria andNsummaryGreaterThan(String value) {
            addCriterion("nsummary >", value, "nsummary");
            return (Criteria) this;
        }

        public Criteria andNsummaryGreaterThanOrEqualTo(String value) {
            addCriterion("nsummary >=", value, "nsummary");
            return (Criteria) this;
        }

        public Criteria andNsummaryLessThan(String value) {
            addCriterion("nsummary <", value, "nsummary");
            return (Criteria) this;
        }

        public Criteria andNsummaryLessThanOrEqualTo(String value) {
            addCriterion("nsummary <=", value, "nsummary");
            return (Criteria) this;
        }

        public Criteria andNsummaryLike(String value) {
            addCriterion("nsummary like", value, "nsummary");
            return (Criteria) this;
        }

        public Criteria andNsummaryNotLike(String value) {
            addCriterion("nsummary not like", value, "nsummary");
            return (Criteria) this;
        }

        public Criteria andNsummaryIn(List<String> values) {
            addCriterion("nsummary in", values, "nsummary");
            return (Criteria) this;
        }

        public Criteria andNsummaryNotIn(List<String> values) {
            addCriterion("nsummary not in", values, "nsummary");
            return (Criteria) this;
        }

        public Criteria andNsummaryBetween(String value1, String value2) {
            addCriterion("nsummary between", value1, value2, "nsummary");
            return (Criteria) this;
        }

        public Criteria andNsummaryNotBetween(String value1, String value2) {
            addCriterion("nsummary not between", value1, value2, "nsummary");
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