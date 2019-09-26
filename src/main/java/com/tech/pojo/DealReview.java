package com.tech.pojo;

import java.io.Serializable;
import java.util.Date;

public class DealReview implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deal_review.deal_review_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer dealReviewId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deal_review.deal_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer dealId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deal_review.review_substance
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String reviewSubstance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deal_review.totality_review_score
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer totalityReviewScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deal_review.review_date
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Date reviewDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deal_review.review_member_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer reviewMemberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deal_review.status
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deal_review.other1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String other1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deal_review.other2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String other2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deal_review.deal_review_id
     *
     * @return the value of deal_review.deal_review_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getDealReviewId() {
        return dealReviewId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deal_review.deal_review_id
     *
     * @param dealReviewId the value for deal_review.deal_review_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setDealReviewId(Integer dealReviewId) {
        this.dealReviewId = dealReviewId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deal_review.deal_id
     *
     * @return the value of deal_review.deal_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getDealId() {
        return dealId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deal_review.deal_id
     *
     * @param dealId the value for deal_review.deal_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deal_review.review_substance
     *
     * @return the value of deal_review.review_substance
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getReviewSubstance() {
        return reviewSubstance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deal_review.review_substance
     *
     * @param reviewSubstance the value for deal_review.review_substance
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setReviewSubstance(String reviewSubstance) {
        this.reviewSubstance = reviewSubstance == null ? null : reviewSubstance.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deal_review.totality_review_score
     *
     * @return the value of deal_review.totality_review_score
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getTotalityReviewScore() {
        return totalityReviewScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deal_review.totality_review_score
     *
     * @param totalityReviewScore the value for deal_review.totality_review_score
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setTotalityReviewScore(Integer totalityReviewScore) {
        this.totalityReviewScore = totalityReviewScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deal_review.review_date
     *
     * @return the value of deal_review.review_date
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Date getReviewDate() {
        return reviewDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deal_review.review_date
     *
     * @param reviewDate the value for deal_review.review_date
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deal_review.review_member_id
     *
     * @return the value of deal_review.review_member_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getReviewMemberId() {
        return reviewMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deal_review.review_member_id
     *
     * @param reviewMemberId the value for deal_review.review_member_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setReviewMemberId(Integer reviewMemberId) {
        this.reviewMemberId = reviewMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deal_review.status
     *
     * @return the value of deal_review.status
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deal_review.status
     *
     * @param status the value for deal_review.status
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deal_review.other1
     *
     * @return the value of deal_review.other1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deal_review.other1
     *
     * @param other1 the value for deal_review.other1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deal_review.other2
     *
     * @return the value of deal_review.other2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deal_review.other2
     *
     * @param other2 the value for deal_review.other2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deal_review
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dealReviewId=").append(dealReviewId);
        sb.append(", dealId=").append(dealId);
        sb.append(", reviewSubstance=").append(reviewSubstance);
        sb.append(", totalityReviewScore=").append(totalityReviewScore);
        sb.append(", reviewDate=").append(reviewDate);
        sb.append(", reviewMemberId=").append(reviewMemberId);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}