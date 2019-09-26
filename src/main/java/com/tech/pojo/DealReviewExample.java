package com.tech.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DealReviewExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public DealReviewExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deal_review
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
     * This method corresponds to the database table deal_review
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
     * This method corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deal_review
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
     * This class corresponds to the database table deal_review
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

        public Criteria andDealReviewIdIsNull() {
            addCriterion("deal_review_id is null");
            return (Criteria) this;
        }

        public Criteria andDealReviewIdIsNotNull() {
            addCriterion("deal_review_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealReviewIdEqualTo(Integer value) {
            addCriterion("deal_review_id =", value, "dealReviewId");
            return (Criteria) this;
        }

        public Criteria andDealReviewIdNotEqualTo(Integer value) {
            addCriterion("deal_review_id <>", value, "dealReviewId");
            return (Criteria) this;
        }

        public Criteria andDealReviewIdGreaterThan(Integer value) {
            addCriterion("deal_review_id >", value, "dealReviewId");
            return (Criteria) this;
        }

        public Criteria andDealReviewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_review_id >=", value, "dealReviewId");
            return (Criteria) this;
        }

        public Criteria andDealReviewIdLessThan(Integer value) {
            addCriterion("deal_review_id <", value, "dealReviewId");
            return (Criteria) this;
        }

        public Criteria andDealReviewIdLessThanOrEqualTo(Integer value) {
            addCriterion("deal_review_id <=", value, "dealReviewId");
            return (Criteria) this;
        }

        public Criteria andDealReviewIdIn(List<Integer> values) {
            addCriterion("deal_review_id in", values, "dealReviewId");
            return (Criteria) this;
        }

        public Criteria andDealReviewIdNotIn(List<Integer> values) {
            addCriterion("deal_review_id not in", values, "dealReviewId");
            return (Criteria) this;
        }

        public Criteria andDealReviewIdBetween(Integer value1, Integer value2) {
            addCriterion("deal_review_id between", value1, value2, "dealReviewId");
            return (Criteria) this;
        }

        public Criteria andDealReviewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_review_id not between", value1, value2, "dealReviewId");
            return (Criteria) this;
        }

        public Criteria andDealIdIsNull() {
            addCriterion("deal_id is null");
            return (Criteria) this;
        }

        public Criteria andDealIdIsNotNull() {
            addCriterion("deal_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealIdEqualTo(Integer value) {
            addCriterion("deal_id =", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotEqualTo(Integer value) {
            addCriterion("deal_id <>", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdGreaterThan(Integer value) {
            addCriterion("deal_id >", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_id >=", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdLessThan(Integer value) {
            addCriterion("deal_id <", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdLessThanOrEqualTo(Integer value) {
            addCriterion("deal_id <=", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdIn(List<Integer> values) {
            addCriterion("deal_id in", values, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotIn(List<Integer> values) {
            addCriterion("deal_id not in", values, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdBetween(Integer value1, Integer value2) {
            addCriterion("deal_id between", value1, value2, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_id not between", value1, value2, "dealId");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceIsNull() {
            addCriterion("review_substance is null");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceIsNotNull() {
            addCriterion("review_substance is not null");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceEqualTo(String value) {
            addCriterion("review_substance =", value, "reviewSubstance");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceNotEqualTo(String value) {
            addCriterion("review_substance <>", value, "reviewSubstance");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceGreaterThan(String value) {
            addCriterion("review_substance >", value, "reviewSubstance");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceGreaterThanOrEqualTo(String value) {
            addCriterion("review_substance >=", value, "reviewSubstance");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceLessThan(String value) {
            addCriterion("review_substance <", value, "reviewSubstance");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceLessThanOrEqualTo(String value) {
            addCriterion("review_substance <=", value, "reviewSubstance");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceLike(String value) {
            addCriterion("review_substance like", value, "reviewSubstance");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceNotLike(String value) {
            addCriterion("review_substance not like", value, "reviewSubstance");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceIn(List<String> values) {
            addCriterion("review_substance in", values, "reviewSubstance");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceNotIn(List<String> values) {
            addCriterion("review_substance not in", values, "reviewSubstance");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceBetween(String value1, String value2) {
            addCriterion("review_substance between", value1, value2, "reviewSubstance");
            return (Criteria) this;
        }

        public Criteria andReviewSubstanceNotBetween(String value1, String value2) {
            addCriterion("review_substance not between", value1, value2, "reviewSubstance");
            return (Criteria) this;
        }

        public Criteria andTotalityReviewScoreIsNull() {
            addCriterion("totality_review_score is null");
            return (Criteria) this;
        }

        public Criteria andTotalityReviewScoreIsNotNull() {
            addCriterion("totality_review_score is not null");
            return (Criteria) this;
        }

        public Criteria andTotalityReviewScoreEqualTo(Integer value) {
            addCriterion("totality_review_score =", value, "totalityReviewScore");
            return (Criteria) this;
        }

        public Criteria andTotalityReviewScoreNotEqualTo(Integer value) {
            addCriterion("totality_review_score <>", value, "totalityReviewScore");
            return (Criteria) this;
        }

        public Criteria andTotalityReviewScoreGreaterThan(Integer value) {
            addCriterion("totality_review_score >", value, "totalityReviewScore");
            return (Criteria) this;
        }

        public Criteria andTotalityReviewScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("totality_review_score >=", value, "totalityReviewScore");
            return (Criteria) this;
        }

        public Criteria andTotalityReviewScoreLessThan(Integer value) {
            addCriterion("totality_review_score <", value, "totalityReviewScore");
            return (Criteria) this;
        }

        public Criteria andTotalityReviewScoreLessThanOrEqualTo(Integer value) {
            addCriterion("totality_review_score <=", value, "totalityReviewScore");
            return (Criteria) this;
        }

        public Criteria andTotalityReviewScoreIn(List<Integer> values) {
            addCriterion("totality_review_score in", values, "totalityReviewScore");
            return (Criteria) this;
        }

        public Criteria andTotalityReviewScoreNotIn(List<Integer> values) {
            addCriterion("totality_review_score not in", values, "totalityReviewScore");
            return (Criteria) this;
        }

        public Criteria andTotalityReviewScoreBetween(Integer value1, Integer value2) {
            addCriterion("totality_review_score between", value1, value2, "totalityReviewScore");
            return (Criteria) this;
        }

        public Criteria andTotalityReviewScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("totality_review_score not between", value1, value2, "totalityReviewScore");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNull() {
            addCriterion("review_date is null");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNotNull() {
            addCriterion("review_date is not null");
            return (Criteria) this;
        }

        public Criteria andReviewDateEqualTo(Date value) {
            addCriterion("review_date =", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotEqualTo(Date value) {
            addCriterion("review_date <>", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThan(Date value) {
            addCriterion("review_date >", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThanOrEqualTo(Date value) {
            addCriterion("review_date >=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThan(Date value) {
            addCriterion("review_date <", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThanOrEqualTo(Date value) {
            addCriterion("review_date <=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateIn(List<Date> values) {
            addCriterion("review_date in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotIn(List<Date> values) {
            addCriterion("review_date not in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateBetween(Date value1, Date value2) {
            addCriterion("review_date between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotBetween(Date value1, Date value2) {
            addCriterion("review_date not between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewMemberIdIsNull() {
            addCriterion("review_member_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewMemberIdIsNotNull() {
            addCriterion("review_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewMemberIdEqualTo(Integer value) {
            addCriterion("review_member_id =", value, "reviewMemberId");
            return (Criteria) this;
        }

        public Criteria andReviewMemberIdNotEqualTo(Integer value) {
            addCriterion("review_member_id <>", value, "reviewMemberId");
            return (Criteria) this;
        }

        public Criteria andReviewMemberIdGreaterThan(Integer value) {
            addCriterion("review_member_id >", value, "reviewMemberId");
            return (Criteria) this;
        }

        public Criteria andReviewMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_member_id >=", value, "reviewMemberId");
            return (Criteria) this;
        }

        public Criteria andReviewMemberIdLessThan(Integer value) {
            addCriterion("review_member_id <", value, "reviewMemberId");
            return (Criteria) this;
        }

        public Criteria andReviewMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("review_member_id <=", value, "reviewMemberId");
            return (Criteria) this;
        }

        public Criteria andReviewMemberIdIn(List<Integer> values) {
            addCriterion("review_member_id in", values, "reviewMemberId");
            return (Criteria) this;
        }

        public Criteria andReviewMemberIdNotIn(List<Integer> values) {
            addCriterion("review_member_id not in", values, "reviewMemberId");
            return (Criteria) this;
        }

        public Criteria andReviewMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("review_member_id between", value1, value2, "reviewMemberId");
            return (Criteria) this;
        }

        public Criteria andReviewMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("review_member_id not between", value1, value2, "reviewMemberId");
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
     * This class corresponds to the database table deal_review
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
     * This class corresponds to the database table deal_review
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