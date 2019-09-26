package com.tech.service;

import com.tech.pojo.Dish;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishService {
    Dish getById(Integer id);
    List<Dish> getByShopId(Integer shopId);


}
