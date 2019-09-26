package com.tech.mapper;

import com.tech.pojo.Member;

public class MemberMapperImpl implements  MemberMapper {
    public MemberMapperImpl() {
        System.out.println("MemberMapperImpl 无参构造函数");
    }

    @Override
    public Member selectByPrimaryKey(int id) {
        return new Member();

    }
}
