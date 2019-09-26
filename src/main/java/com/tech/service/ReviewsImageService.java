package com.tech.service;

import com.tech.pojo.ReviewsImage;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReviewsImageService {


    // 根据评论 reviewid查询所有店铺记录
    public List<ReviewsImage> getByReviewId(Integer reviewId);

    public ReviewsImage getById(Integer id);
}
