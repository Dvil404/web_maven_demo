package com.tech.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReviewsImageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reviews_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reviews_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reviews_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reviews_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public ReviewsImageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reviews_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reviews_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reviews_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reviews_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reviews_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reviews_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reviews_image
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
     * This method corresponds to the database table reviews_image
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
     * This method corresponds to the database table reviews_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reviews_image
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
     * This class corresponds to the database table reviews_image
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

        public Criteria andReviewsImageIdIsNull() {
            addCriterion("reviews_image_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewsImageIdIsNotNull() {
            addCriterion("reviews_image_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewsImageIdEqualTo(Integer value) {
            addCriterion("reviews_image_id =", value, "reviewsImageId");
            return (Criteria) this;
        }

        public Criteria andReviewsImageIdNotEqualTo(Integer value) {
            addCriterion("reviews_image_id <>", value, "reviewsImageId");
            return (Criteria) this;
        }

        public Criteria andReviewsImageIdGreaterThan(Integer value) {
            addCriterion("reviews_image_id >", value, "reviewsImageId");
            return (Criteria) this;
        }

        public Criteria andReviewsImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviews_image_id >=", value, "reviewsImageId");
            return (Criteria) this;
        }

        public Criteria andReviewsImageIdLessThan(Integer value) {
            addCriterion("reviews_image_id <", value, "reviewsImageId");
            return (Criteria) this;
        }

        public Criteria andReviewsImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("reviews_image_id <=", value, "reviewsImageId");
            return (Criteria) this;
        }

        public Criteria andReviewsImageIdIn(List<Integer> values) {
            addCriterion("reviews_image_id in", values, "reviewsImageId");
            return (Criteria) this;
        }

        public Criteria andReviewsImageIdNotIn(List<Integer> values) {
            addCriterion("reviews_image_id not in", values, "reviewsImageId");
            return (Criteria) this;
        }

        public Criteria andReviewsImageIdBetween(Integer value1, Integer value2) {
            addCriterion("reviews_image_id between", value1, value2, "reviewsImageId");
            return (Criteria) this;
        }

        public Criteria andReviewsImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reviews_image_id not between", value1, value2, "reviewsImageId");
            return (Criteria) this;
        }

        public Criteria andDishReviewIdIsNull() {
            addCriterion("dish_review_id is null");
            return (Criteria) this;
        }

        public Criteria andDishReviewIdIsNotNull() {
            addCriterion("dish_review_id is not null");
            return (Criteria) this;
        }

        public Criteria andDishReviewIdEqualTo(Integer value) {
            addCriterion("dish_review_id =", value, "dishReviewId");
            return (Criteria) this;
        }

        public Criteria andDishReviewIdNotEqualTo(Integer value) {
            addCriterion("dish_review_id <>", value, "dishReviewId");
            return (Criteria) this;
        }

        public Criteria andDishReviewIdGreaterThan(Integer value) {
            addCriterion("dish_review_id >", value, "dishReviewId");
            return (Criteria) this;
        }

        public Criteria andDishReviewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_review_id >=", value, "dishReviewId");
            return (Criteria) this;
        }

        public Criteria andDishReviewIdLessThan(Integer value) {
            addCriterion("dish_review_id <", value, "dishReviewId");
            return (Criteria) this;
        }

        public Criteria andDishReviewIdLessThanOrEqualTo(Integer value) {
            addCriterion("dish_review_id <=", value, "dishReviewId");
            return (Criteria) this;
        }

        public Criteria andDishReviewIdIn(List<Integer> values) {
            addCriterion("dish_review_id in", values, "dishReviewId");
            return (Criteria) this;
        }

        public Criteria andDishReviewIdNotIn(List<Integer> values) {
            addCriterion("dish_review_id not in", values, "dishReviewId");
            return (Criteria) this;
        }

        public Criteria andDishReviewIdBetween(Integer value1, Integer value2) {
            addCriterion("dish_review_id between", value1, value2, "dishReviewId");
            return (Criteria) this;
        }

        public Criteria andDishReviewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_review_id not between", value1, value2, "dishReviewId");
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

        public Criteria andOther2IsNull() {
            addCriterion("other2 is null");
            return (Criteria) this;
        }

        public Criteria andOther2IsNotNull() {
            addCriterion("other2 is not null");
            return (Criteria) this;
        }

        public Criteria andOther2EqualTo(String value) {
            addCriterion("other2 =", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotEqualTo(String value) {
            addCriterion("other2 <>", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThan(String value) {
            addCriterion("other2 >", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThanOrEqualTo(String value) {
            addCriterion("other2 >=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThan(String value) {
            addCriterion("other2 <", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThanOrEqualTo(String value) {
            addCriterion("other2 <=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Like(String value) {
            addCriterion("other2 like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotLike(String value) {
            addCriterion("other2 not like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2In(List<String> values) {
            addCriterion("other2 in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotIn(List<String> values) {
            addCriterion("other2 not in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Between(String value1, String value2) {
            addCriterion("other2 between", value1, value2, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotBetween(String value1, String value2) {
            addCriterion("other2 not between", value1, value2, "other2");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table reviews_image
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
     * This class corresponds to the database table reviews_image
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