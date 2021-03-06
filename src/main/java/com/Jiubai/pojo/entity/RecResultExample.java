package com.Jiubai.pojo.entity;

import java.util.ArrayList;
import java.util.List;

public class RecResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecResultExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andVolIdIsNull() {
            addCriterion("vol_id is null");
            return (Criteria) this;
        }

        public Criteria andVolIdIsNotNull() {
            addCriterion("vol_id is not null");
            return (Criteria) this;
        }

        public Criteria andVolIdEqualTo(Integer value) {
            addCriterion("vol_id =", value, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdNotEqualTo(Integer value) {
            addCriterion("vol_id <>", value, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdGreaterThan(Integer value) {
            addCriterion("vol_id >", value, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_id >=", value, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdLessThan(Integer value) {
            addCriterion("vol_id <", value, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdLessThanOrEqualTo(Integer value) {
            addCriterion("vol_id <=", value, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdIn(List<Integer> values) {
            addCriterion("vol_id in", values, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdNotIn(List<Integer> values) {
            addCriterion("vol_id not in", values, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdBetween(Integer value1, Integer value2) {
            addCriterion("vol_id between", value1, value2, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_id not between", value1, value2, "volId");
            return (Criteria) this;
        }

        public Criteria andRecListIsNull() {
            addCriterion("rec_list is null");
            return (Criteria) this;
        }

        public Criteria andRecListIsNotNull() {
            addCriterion("rec_list is not null");
            return (Criteria) this;
        }

        public Criteria andRecListEqualTo(String value) {
            addCriterion("rec_list =", value, "recList");
            return (Criteria) this;
        }

        public Criteria andRecListNotEqualTo(String value) {
            addCriterion("rec_list <>", value, "recList");
            return (Criteria) this;
        }

        public Criteria andRecListGreaterThan(String value) {
            addCriterion("rec_list >", value, "recList");
            return (Criteria) this;
        }

        public Criteria andRecListGreaterThanOrEqualTo(String value) {
            addCriterion("rec_list >=", value, "recList");
            return (Criteria) this;
        }

        public Criteria andRecListLessThan(String value) {
            addCriterion("rec_list <", value, "recList");
            return (Criteria) this;
        }

        public Criteria andRecListLessThanOrEqualTo(String value) {
            addCriterion("rec_list <=", value, "recList");
            return (Criteria) this;
        }

        public Criteria andRecListLike(String value) {
            addCriterion("rec_list like", value, "recList");
            return (Criteria) this;
        }

        public Criteria andRecListNotLike(String value) {
            addCriterion("rec_list not like", value, "recList");
            return (Criteria) this;
        }

        public Criteria andRecListIn(List<String> values) {
            addCriterion("rec_list in", values, "recList");
            return (Criteria) this;
        }

        public Criteria andRecListNotIn(List<String> values) {
            addCriterion("rec_list not in", values, "recList");
            return (Criteria) this;
        }

        public Criteria andRecListBetween(String value1, String value2) {
            addCriterion("rec_list between", value1, value2, "recList");
            return (Criteria) this;
        }

        public Criteria andRecListNotBetween(String value1, String value2) {
            addCriterion("rec_list not between", value1, value2, "recList");
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