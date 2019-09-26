package com.tech.service;

import com.tech.pojo.MemberLike;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MemberLikeService {
    /**
     * 点赞 状态为0
     * @param likeMemberId
     * @param likeShopId
     */
    public void saveLike2Redis(Integer likeMemberId, Integer likeShopId);

    /**
     * 取消点赞 状态改为1
     * @param likeMemberId
     * @param likeShopId
     */
    public void unLikeFromRedis(Integer likeMemberId, Integer likeShopId);

    /**
     * 从redis中删除一条点赞数据
     * @param likeMemberId
     * @param likeShopId
     */
    public void deleteLikeFromRedis(Integer likeMemberId, Integer likeShopId);

    /**
     * 该店铺的点赞加1
     * @param likeShopId
     */
    public void increamLikeCount(Integer likeShopId);

    /**
     * 该店铺的点赞减1
     * @param likeShopId
     */
    public void getLikeDataFromRedis(Integer likeShopId);

    /**
     * 获得Redis中存储的所有点赞记录
     */
    public List<MemberLike> decreamLikeCountFromRedis();

    /**
     * 获得Redis中存储的所有点赞量
     */
  // public List<MemberLike> getLikeCountFromRedis();


}
