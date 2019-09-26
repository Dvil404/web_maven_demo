package com.tech.pojo;

import java.io.Serializable;
import java.util.Date;

public class Coupon implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.coupon_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer couponId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.coupon_content
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String couponContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.start_date
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Date startDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.end_date
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Date endDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.origin_amount
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer originAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.face_value
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer faceValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.status
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.other1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String other1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.other2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String other2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.coupon_id
     *
     * @return the value of coupon.coupon_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.coupon_id
     *
     * @param couponId the value for coupon.coupon_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.coupon_content
     *
     * @return the value of coupon.coupon_content
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getCouponContent() {
        return couponContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.coupon_content
     *
     * @param couponContent the value for coupon.coupon_content
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setCouponContent(String couponContent) {
        this.couponContent = couponContent == null ? null : couponContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.start_date
     *
     * @return the value of coupon.start_date
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.start_date
     *
     * @param startDate the value for coupon.start_date
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.end_date
     *
     * @return the value of coupon.end_date
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.end_date
     *
     * @param endDate the value for coupon.end_date
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.origin_amount
     *
     * @return the value of coupon.origin_amount
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getOriginAmount() {
        return originAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.origin_amount
     *
     * @param originAmount the value for coupon.origin_amount
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setOriginAmount(Integer originAmount) {
        this.originAmount = originAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.face_value
     *
     * @return the value of coupon.face_value
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getFaceValue() {
        return faceValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.face_value
     *
     * @param faceValue the value for coupon.face_value
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setFaceValue(Integer faceValue) {
        this.faceValue = faceValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.status
     *
     * @return the value of coupon.status
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.status
     *
     * @param status the value for coupon.status
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.other1
     *
     * @return the value of coupon.other1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.other1
     *
     * @param other1 the value for coupon.other1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.other2
     *
     * @return the value of coupon.other2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.other2
     *
     * @param other2 the value for coupon.other2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", couponId=").append(couponId);
        sb.append(", couponContent=").append(couponContent);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", originAmount=").append(originAmount);
        sb.append(", faceValue=").append(faceValue);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}