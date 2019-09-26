package com.tech.pojo;

import java.io.Serializable;

public class Shop implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.shop_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer shopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.shop_name
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String shopName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.branchshop_name
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String branchshopName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.keyword
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String keyword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.main_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String mainImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.shop_add_province
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String shopAddProvince;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.shop_add_city
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String shopAddCity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.shop_add_street
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String shopAddStreet;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.shop_add_area
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String shopAddArea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.stop_add_detail
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String stopAddDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.telno1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer telno1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.telno2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer telno2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.business_time
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String businessTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.star_class
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer starClass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.person_consume
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer personConsume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.flavor_score
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Float flavorScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.surrounding_score
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Float surroundingScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.service_score
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Float serviceScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.longi_lati
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String longiLati;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.status
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.other1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer other1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.other2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String other2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shop
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.shop_id
     *
     * @return the value of shop.shop_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.shop_id
     *
     * @param shopId the value for shop.shop_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.shop_name
     *
     * @return the value of shop.shop_name
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.shop_name
     *
     * @param shopName the value for shop.shop_name
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.branchshop_name
     *
     * @return the value of shop.branchshop_name
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getBranchshopName() {
        return branchshopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.branchshop_name
     *
     * @param branchshopName the value for shop.branchshop_name
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setBranchshopName(String branchshopName) {
        this.branchshopName = branchshopName == null ? null : branchshopName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.keyword
     *
     * @return the value of shop.keyword
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.keyword
     *
     * @param keyword the value for shop.keyword
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.main_image
     *
     * @return the value of shop.main_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getMainImage() {
        return mainImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.main_image
     *
     * @param mainImage the value for shop.main_image
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setMainImage(String mainImage) {
        this.mainImage = mainImage == null ? null : mainImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.shop_add_province
     *
     * @return the value of shop.shop_add_province
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getShopAddProvince() {
        return shopAddProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.shop_add_province
     *
     * @param shopAddProvince the value for shop.shop_add_province
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setShopAddProvince(String shopAddProvince) {
        this.shopAddProvince = shopAddProvince == null ? null : shopAddProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.shop_add_city
     *
     * @return the value of shop.shop_add_city
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getShopAddCity() {
        return shopAddCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.shop_add_city
     *
     * @param shopAddCity the value for shop.shop_add_city
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setShopAddCity(String shopAddCity) {
        this.shopAddCity = shopAddCity == null ? null : shopAddCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.shop_add_street
     *
     * @return the value of shop.shop_add_street
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getShopAddStreet() {
        return shopAddStreet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.shop_add_street
     *
     * @param shopAddStreet the value for shop.shop_add_street
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setShopAddStreet(String shopAddStreet) {
        this.shopAddStreet = shopAddStreet == null ? null : shopAddStreet.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.shop_add_area
     *
     * @return the value of shop.shop_add_area
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getShopAddArea() {
        return shopAddArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.shop_add_area
     *
     * @param shopAddArea the value for shop.shop_add_area
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setShopAddArea(String shopAddArea) {
        this.shopAddArea = shopAddArea == null ? null : shopAddArea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.stop_add_detail
     *
     * @return the value of shop.stop_add_detail
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getStopAddDetail() {
        return stopAddDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.stop_add_detail
     *
     * @param stopAddDetail the value for shop.stop_add_detail
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setStopAddDetail(String stopAddDetail) {
        this.stopAddDetail = stopAddDetail == null ? null : stopAddDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.telno1
     *
     * @return the value of shop.telno1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getTelno1() {
        return telno1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.telno1
     *
     * @param telno1 the value for shop.telno1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setTelno1(Integer telno1) {
        this.telno1 = telno1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.telno2
     *
     * @return the value of shop.telno2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getTelno2() {
        return telno2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.telno2
     *
     * @param telno2 the value for shop.telno2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setTelno2(Integer telno2) {
        this.telno2 = telno2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.business_time
     *
     * @return the value of shop.business_time
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getBusinessTime() {
        return businessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.business_time
     *
     * @param businessTime the value for shop.business_time
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime == null ? null : businessTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.star_class
     *
     * @return the value of shop.star_class
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getStarClass() {
        return starClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.star_class
     *
     * @param starClass the value for shop.star_class
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setStarClass(Integer starClass) {
        this.starClass = starClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.person_consume
     *
     * @return the value of shop.person_consume
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getPersonConsume() {
        return personConsume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.person_consume
     *
     * @param personConsume the value for shop.person_consume
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setPersonConsume(Integer personConsume) {
        this.personConsume = personConsume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.flavor_score
     *
     * @return the value of shop.flavor_score
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Float getFlavorScore() {
        return flavorScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.flavor_score
     *
     * @param flavorScore the value for shop.flavor_score
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setFlavorScore(Float flavorScore) {
        this.flavorScore = flavorScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.surrounding_score
     *
     * @return the value of shop.surrounding_score
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Float getSurroundingScore() {
        return surroundingScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.surrounding_score
     *
     * @param surroundingScore the value for shop.surrounding_score
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setSurroundingScore(Float surroundingScore) {
        this.surroundingScore = surroundingScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.service_score
     *
     * @return the value of shop.service_score
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Float getServiceScore() {
        return serviceScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.service_score
     *
     * @param serviceScore the value for shop.service_score
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setServiceScore(Float serviceScore) {
        this.serviceScore = serviceScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.longi_lati
     *
     * @return the value of shop.longi_lati
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getLongiLati() {
        return longiLati;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.longi_lati
     *
     * @param longiLati the value for shop.longi_lati
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setLongiLati(String longiLati) {
        this.longiLati = longiLati == null ? null : longiLati.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.status
     *
     * @return the value of shop.status
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.status
     *
     * @param status the value for shop.status
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.other1
     *
     * @return the value of shop.other1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getOther1() {
        return other1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.other1
     *
     * @param other1 the value for shop.other1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setOther1(Integer other1) {
        this.other1 = other1 == null ? null : other1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.other2
     *
     * @return the value of shop.other2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.other2
     *
     * @param other2 the value for shop.other2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopId=").append(shopId);
        sb.append(", shopName=").append(shopName);
        sb.append(", branchshopName=").append(branchshopName);
        sb.append(", keyword=").append(keyword);
        sb.append(", mainImage=").append(mainImage);
        sb.append(", shopAddProvince=").append(shopAddProvince);
        sb.append(", shopAddCity=").append(shopAddCity);
        sb.append(", shopAddStreet=").append(shopAddStreet);
        sb.append(", shopAddArea=").append(shopAddArea);
        sb.append(", stopAddDetail=").append(stopAddDetail);
        sb.append(", telno1=").append(telno1);
        sb.append(", telno2=").append(telno2);
        sb.append(", businessTime=").append(businessTime);
        sb.append(", starClass=").append(starClass);
        sb.append(", personConsume=").append(personConsume);
        sb.append(", flavorScore=").append(flavorScore);
        sb.append(", surroundingScore=").append(surroundingScore);
        sb.append(", serviceScore=").append(serviceScore);
        sb.append(", longiLati=").append(longiLati);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}