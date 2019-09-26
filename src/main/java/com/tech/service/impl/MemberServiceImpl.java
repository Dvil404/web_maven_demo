package com.tech.service.impl;

import com.tech.mapper.MemberMapper;
import com.tech.mapper.MemberMapperImpl;
import com.tech.pojo.Member;
import com.tech.service.MemberService;
import com.tech.util.JsonResult;

public class MemberServiceImpl implements MemberService {


    private String memberName;
    private MemberMapper mapper;

    public void setMemberName(String memberName){
        this.memberName = memberName;
        System.out.println("memberName = "+memberName);
    }

    public void setMapper(MemberMapper mapper){
        this.mapper = mapper;
        System.out.println("mapper ="+mapper);

    }

    @Override
    public boolean save(Member member) {
        return false;
    }

    @Override
    public boolean update(Member member) {
        return false;
    }

    @Override
    public Member getById(int id) {
        MemberMapper mapper = new MemberMapperImpl();

        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public JsonResult getByTelno(Long memberTelno) {
        return null;
    }

    @Override
    public Member login(String username, String password) {
        return null;
    }

    @Override
    public Member loginByTelno(Long memberTelno, String password) {
        return null;
    }
}
