package hello.spring_start.controller;

import hello.spring_start.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired //멤버 서비스를 스프링 컨테이너에 있는 멤버 서비스를 가져다 연결 시켜줌
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
