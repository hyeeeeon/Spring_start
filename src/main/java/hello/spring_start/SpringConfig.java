package hello.spring_start;

import hello.spring_start.repository.MemberRepository;
import hello.spring_start.repository.MemoryMemberRepository;
import hello.spring_start.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }


}
