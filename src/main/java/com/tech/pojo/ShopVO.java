package com.tech.pojo;

import java.util.List;
import java.util.Map;

//包含的信息（店铺信息，店铺中的所有菜品与菜品图片，点评信息，点评用户的信息）
public class ShopVO {
    private Shop shop;  //店铺信息
    private List<Dish> dishList; //菜品
    private Map<Review, Member> reviewMemberMap;  //点评信息，点评用户的信息


    public ShopVO(){}

    public ShopVO(Shop shop, List<Dish> dishList, Map<Review, Member> reviewMemberMap) {
        this.shop = shop;
        this.dishList = dishList;

        this.reviewMemberMap = reviewMemberMap;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }



    public Map<Review, Member> getReviewMemberMap() {
        return reviewMemberMap;
    }

    public void setReviewMemberMap(Map<Review, Member> reviewMemberMap) {
        this.reviewMemberMap = reviewMemberMap;
    }

    @Override
    public String toString() {
        return "ShopVO{" +
                "shop=" + shop +
                ", dishList=" + dishList +
                ", reviewMemberMap=" + reviewMemberMap +
                '}';
    }
}
