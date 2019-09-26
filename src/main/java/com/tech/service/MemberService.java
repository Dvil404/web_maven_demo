package com.tech.service;

import com.tech.pojo.Member;
import com.tech.util.JsonResult;

public interface MemberService {

    //添加用户

    boolean save(Member member);
    //修改用户

    boolean update(Member member);
    //根据主键查询

    Member getById(int memberId);

    //根据手机号查询

    JsonResult getByTelno(Long memberTelno);

    //登录根据用户名或名密码

    Member login(String username, String password);

    //登录根据手机号或名密码

    Member loginByTelno(Long memberTelno, String password);
}
