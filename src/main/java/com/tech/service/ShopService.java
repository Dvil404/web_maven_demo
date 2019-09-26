package com.tech.service;

import com.github.pagehelper.PageInfo;
import com.tech.pojo.Shop;
import com.tech.pojo.ShopVO;

import java.util.List;

public interface ShopService {

    //1. 分页查看所有的店铺
    public PageInfo<Shop> getAll(int pageNum, int pageSize);

    //2. 查看某一个店铺
    public ShopVO getById(Integer id);
    //3. 查看某一个店铺,只有店铺信息
    public Shop getByIdOnlyShop(Integer id);


    //3. 根据关键字模糊查询店铺【分页】
    // (1) 在搜索框 -- 店铺名称、搜索关键字、区域、搜索关键字
    // (2) 分类选择中--  店铺名称、搜索关键字、区域、搜索关键字
    public List<Shop> getBySearchWord(Shop shop); //select * from shop where keyword like '%川菜%' or shop_name like '%川菜%'    and shop_add_provice='江苏省' and shop_add_city ='苏州市'


}
