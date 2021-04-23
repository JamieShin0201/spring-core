package com.springcore.member;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        Member member = new Member(1L, "Jamie", Grade.VIP);

        memberService.join(member);
        Member foundMember = memberService.findMember(member.getId());

        assertThat(foundMember).isEqualTo(member);
    }

}
