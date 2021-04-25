package com.springcore;

import com.springcore.member.Grade;
import com.springcore.member.Member;
import com.springcore.member.MemberService;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        
        Member member = new Member(1L, "Jamie", Grade.VIP);
        memberService.join(member);

        Member foundMember = memberService.findMember(member.getId());

        System.out.println("member = " + member.getName());
        System.out.println("foundMember = " + foundMember.getName());
        System.out.println("(member == foundMember) = " + (member == foundMember));
    }

}
