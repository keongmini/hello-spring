package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller  // 컴포넌트 스캔 - Autowired와 함께 해야함
public class MemberController {

    private final MemberService memberService;

    @Autowired      // controller -> service 연결: dependency injection
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
