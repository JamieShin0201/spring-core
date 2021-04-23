package com.springcore.discount;

import com.springcore.member.Grade;
import com.springcore.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private final int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }

        return 0;
    }

}
