package com.tech.service;

import com.tech.pojo.Review;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReviewService {

    // 添加某一个店铺的点评
    public boolean save(Review review);
    // 根据店铺id查询所有店铺记录【分页】
    public List<Review> getByShopId(Integer shopId);

    public Review getById(Integer id);
}
