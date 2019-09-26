package com.tech.service;

import com.tech.pojo.DishImage;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DishImageService {
    public DishImage getById(Integer dishImgId) ;
    public List<DishImage> getByDishId(Integer dishId) ;
}
