package com.example.hellospringbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName : com.example.hellospringbootjsp.configuration.controller
 * fileName : TestController
 * author : ds
 * date : 2022-05-10
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         ds          최초 생성
 */
// 웹 브라우저의 URL과 매핑 될 jsp 페이지 파일을 설정 할 어노테이션
@Controller
public class TestController {
//    웹 브라우저 URL : /
//    전체 주소로 보면 : http://localhost:8080/
//    결과 = hello.jsp 페이지가 로딩이 됨
//    HTTP 프로토콜 전송 방식 : GET, POST, DELETE, PATCH
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
