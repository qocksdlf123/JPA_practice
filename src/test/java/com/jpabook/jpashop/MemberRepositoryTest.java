package com.jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/*@SpringBootTest
@RunWith(SpringRunner.class) //junit한테 스프링과 관련된거를 테스트한다 알려줌
public class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;

    @Test
    @Transactional //트래잭션 처리 (jpa의 EntityManager는 트래잭션 안에서 처리해야함)
    @Rollback(false) //테스트에서는 트래잭션 rollback이 기본이라 false를 걸어줘야함
    public void testMemeber() throws Exception{
        //given
        Member member = new Member();
        member.setUsername("memberA");

        //when
        Long saveId = memberRepository.save(member);
        Member findMember = memberRepository.find(saveId); //db까지 안가고 영속성 컨텍스트에서 조회함

        //then
        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
        Assertions.assertThat(findMember).isEqualTo(member);

    }




}*/
