package com.tech.pojo;

import java.io.Serializable;

public class Dish implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.dish_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer dishId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.shop_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer shopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.dish_name
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String dishName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.dish_price
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Float dishPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.main_image_path
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String mainImagePath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.status
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.other1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String other1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.other2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String other2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.keyword
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private String keyword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dish
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.dish_id
     *
     * @return the value of dish.dish_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getDishId() {
        return dishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.dish_id
     *
     * @param dishId the value for dish.dish_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.shop_id
     *
     * @return the value of dish.shop_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.shop_id
     *
     * @param shopId the value for dish.shop_id
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.dish_name
     *
     * @return the value of dish.dish_name
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getDishName() {
        return dishName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.dish_name
     *
     * @param dishName the value for dish.dish_name
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setDishName(String dishName) {
        this.dishName = dishName == null ? null : dishName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.dish_price
     *
     * @return the value of dish.dish_price
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Float getDishPrice() {
        return dishPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.dish_price
     *
     * @param dishPrice the value for dish.dish_price
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setDishPrice(Float dishPrice) {
        this.dishPrice = dishPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.main_image_path
     *
     * @return the value of dish.main_image_path
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getMainImagePath() {
        return mainImagePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.main_image_path
     *
     * @param mainImagePath the value for dish.main_image_path
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setMainImagePath(String mainImagePath) {
        this.mainImagePath = mainImagePath == null ? null : mainImagePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.status
     *
     * @return the value of dish.status
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.status
     *
     * @param status the value for dish.status
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.other1
     *
     * @return the value of dish.other1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.other1
     *
     * @param other1 the value for dish.other1
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.other2
     *
     * @return the value of dish.other2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.other2
     *
     * @param other2 the value for dish.other2
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.keyword
     *
     * @return the value of dish.keyword
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.keyword
     *
     * @param keyword the value for dish.keyword
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish
     *
     * @mbggenerated Thu Sep 05 20:11:35 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dishId=").append(dishId);
        sb.append(", shopId=").append(shopId);
        sb.append(", dishName=").append(dishName);
        sb.append(", dishPrice=").append(dishPrice);
        sb.append(", mainImagePath=").append(mainImagePath);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", keyword=").append(keyword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}