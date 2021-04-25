package com.springcore.discount;

import com.springcore.member.Grade;
import com.springcore.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @DisplayName("VIP 는 10% 할인이 적용되어야 한다.")
    @Test
    void vip_o() {
        Member member = new Member(1L, "MemberVIP", Grade.VIP);

        int discountPrice = rateDiscountPolicy.discount(member, 10000);

        assertThat(discountPrice).isEqualTo(1000);
    }

    @DisplayName("VIP 가 아니면 할인이 적용되지 않아야 한다.")
    @Test
    void vip_x() {
        Member member = new Member(1L, "MemberBASIC", Grade.BASIC);

        int discountPrice = rateDiscountPolicy.discount(member, 10000);

        assertThat(discountPrice).isEqualTo(0);
    }

}
