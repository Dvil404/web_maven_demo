package com.tech.pojo;

import java.util.ArrayList;
import java.util.List;

public class DishImageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public DishImageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
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

        public Criteria andDishImageIdIsNull() {
            addCriterion("dish_image_id is null");
            return (Criteria) this;
        }

        public Criteria andDishImageIdIsNotNull() {
            addCriterion("dish_image_id is not null");
            return (Criteria) this;
        }

        public Criteria andDishImageIdEqualTo(Integer value) {
            addCriterion("dish_image_id =", value, "dishImageId");
            return (Criteria) this;
        }

        public Criteria andDishImageIdNotEqualTo(Integer value) {
            addCriterion("dish_image_id <>", value, "dishImageId");
            return (Criteria) this;
        }

        public Criteria andDishImageIdGreaterThan(Integer value) {
            addCriterion("dish_image_id >", value, "dishImageId");
            return (Criteria) this;
        }

        public Criteria andDishImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_image_id >=", value, "dishImageId");
            return (Criteria) this;
        }

        public Criteria andDishImageIdLessThan(Integer value) {
            addCriterion("dish_image_id <", value, "dishImageId");
            return (Criteria) this;
        }

        public Criteria andDishImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("dish_image_id <=", value, "dishImageId");
            return (Criteria) this;
        }

        public Criteria andDishImageIdIn(List<Integer> values) {
            addCriterion("dish_image_id in", values, "dishImageId");
            return (Criteria) this;
        }

        public Criteria andDishImageIdNotIn(List<Integer> values) {
            addCriterion("dish_image_id not in", values, "dishImageId");
            return (Criteria) this;
        }

        public Criteria andDishImageIdBetween(Integer value1, Integer value2) {
            addCriterion("dish_image_id between", value1, value2, "dishImageId");
            return (Criteria) this;
        }

        public Criteria andDishImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_image_id not between", value1, value2, "dishImageId");
            return (Criteria) this;
        }

        public Criteria andDishIdIsNull() {
            addCriterion("dish_id is null");
            return (Criteria) this;
        }

        public Criteria andDishIdIsNotNull() {
            addCriterion("dish_id is not null");
            return (Criteria) this;
        }

        public Criteria andDishIdEqualTo(Integer value) {
            addCriterion("dish_id =", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotEqualTo(Integer value) {
            addCriterion("dish_id <>", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdGreaterThan(Integer value) {
            addCriterion("dish_id >", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_id >=", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLessThan(Integer value) {
            addCriterion("dish_id <", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLessThanOrEqualTo(Integer value) {
            addCriterion("dish_id <=", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdIn(List<Integer> values) {
            addCriterion("dish_id in", values, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotIn(List<Integer> values) {
            addCriterion("dish_id not in", values, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdBetween(Integer value1, Integer value2) {
            addCriterion("dish_id between", value1, value2, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_id not between", value1, value2, "dishId");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNull() {
            addCriterion("image_path is null");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNotNull() {
            addCriterion("image_path is not null");
            return (Criteria) this;
        }

        public Criteria andImagePathEqualTo(String value) {
            addCriterion("image_path =", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotEqualTo(String value) {
            addCriterion("image_path <>", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThan(String value) {
            addCriterion("image_path >", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("image_path >=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThan(String value) {
            addCriterion("image_path <", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThanOrEqualTo(String value) {
            addCriterion("image_path <=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLike(String value) {
            addCriterion("image_path like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotLike(String value) {
            addCriterion("image_path not like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathIn(List<String> values) {
            addCriterion("image_path in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotIn(List<String> values) {
            addCriterion("image_path not in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathBetween(String value1, String value2) {
            addCriterion("image_path between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotBetween(String value1, String value2) {
            addCriterion("image_path not between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOther1IsNull() {
            addCriterion("other1 is null");
            return (Criteria) this;
        }

        public Criteria andOther1IsNotNull() {
            addCriterion("other1 is not null");
            return (Criteria) this;
        }

        public Criteria andOther1EqualTo(String value) {
            addCriterion("other1 =", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotEqualTo(String value) {
            addCriterion("other1 <>", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThan(String value) {
            addCriterion("other1 >", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThanOrEqualTo(String value) {
            addCriterion("other1 >=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThan(String value) {
            addCriterion("other1 <", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThanOrEqualTo(String value) {
            addCriterion("other1 <=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Like(String value) {
            addCriterion("other1 like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotLike(String value) {
            addCriterion("other1 not like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1In(List<String> values) {
            addCriterion("other1 in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotIn(List<String> values) {
            addCriterion("other1 not in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Between(String value1, String value2) {
            addCriterion("other1 between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotBetween(String value1, String value2) {
            addCriterion("other1 not between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOthe2IsNull() {
            addCriterion("othe2 is null");
            return (Criteria) this;
        }

        public Criteria andOthe2IsNotNull() {
            addCriterion("othe2 is not null");
            return (Criteria) this;
        }

        public Criteria andOthe2EqualTo(String value) {
            addCriterion("othe2 =", value, "othe2");
            return (Criteria) this;
        }

        public Criteria andOthe2NotEqualTo(String value) {
            addCriterion("othe2 <>", value, "othe2");
            return (Criteria) this;
        }

        public Criteria andOthe2GreaterThan(String value) {
            addCriterion("othe2 >", value, "othe2");
            return (Criteria) this;
        }

        public Criteria andOthe2GreaterThanOrEqualTo(String value) {
            addCriterion("othe2 >=", value, "othe2");
            return (Criteria) this;
        }

        public Criteria andOthe2LessThan(String value) {
            addCriterion("othe2 <", value, "othe2");
            return (Criteria) this;
        }

        public Criteria andOthe2LessThanOrEqualTo(String value) {
            addCriterion("othe2 <=", value, "othe2");
            return (Criteria) this;
        }

        public Criteria andOthe2Like(String value) {
            addCriterion("othe2 like", value, "othe2");
            return (Criteria) this;
        }

        public Criteria andOthe2NotLike(String value) {
            addCriterion("othe2 not like", value, "othe2");
            return (Criteria) this;
        }

        public Criteria andOthe2In(List<String> values) {
            addCriterion("othe2 in", values, "othe2");
            return (Criteria) this;
        }

        public Criteria andOthe2NotIn(List<String> values) {
            addCriterion("othe2 not in", values, "othe2");
            return (Criteria) this;
        }

        public Criteria andOthe2Between(String value1, String value2) {
            addCriterion("othe2 between", value1, value2, "othe2");
            return (Criteria) this;
        }

        public Criteria andOthe2NotBetween(String value1, String value2) {
            addCriterion("othe2 not between", value1, value2, "othe2");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dish_image
     *
     * @mbggenerated do_not_delete_during_merge Thu Sep 05 20:11:35 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dish_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
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