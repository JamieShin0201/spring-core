package com.springcore;

import com.springcore.member.Grade;
import com.springcore.member.Member;
import com.springcore.member.MemberService;
import com.springcore.member.MemberServiceImpl;
import com.springcore.order.Order;
import com.springcore.order.OrderService;
import com.springcore.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Member member = new Member(1L, "Jamie", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(member.getId(), "itemA", 10000);
        System.out.println("order = " + order);
    }

}
