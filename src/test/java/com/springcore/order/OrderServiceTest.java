package com.springcore.order;

import com.springcore.member.Grade;
import com.springcore.member.Member;
import com.springcore.member.MemberService;
import com.springcore.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();

    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Member member = new Member(1L, "Jamie", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(member.getId(), "ItemA", 10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}
