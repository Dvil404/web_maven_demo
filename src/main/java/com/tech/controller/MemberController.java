package com.tech.controller;

import com.tech.pojo.Member;
import com.tech.service.MemberService;
import com.tech.service.impl.MemberServiceImpl;
import com.tech.util.JsonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MemberController {

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    private MemberService memberService;

    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    public Member getById(int id){
        MemberService service = new MemberServiceImpl();
        return  service.getById(id);

    }
    //获得手机验证码
    @PostMapping("member/getcode")
    @ResponseBody
    public JsonResult getSsmCode(long telno) { //1. 验证手机号码是否存在
        System.out.println("telno:" + telno);

        JsonResult jsonResult = memberService.getByTelno(telno);
        System.out.println("getcode:" + jsonResult);
        if (jsonResult.getCode() == 1) { //2. 手机号不存在
            return jsonResult;

        } else {
            System.out.println("用户存在，可以登录");
            //2. 发送验证码
            String code = "666666";// GetMessageCode.getCode(telnoStr);
            return new JsonResult(0,"用户存在，可以登录",code);
        }
    }
}
