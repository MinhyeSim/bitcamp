package com.example.demo.service;

import com.example.demo.auth.domain.HelloDTO;

/**
 * packageName: com.example.demo.calc
 * fileName   : HelloDemo.java
 * author     : MinHye_Sim
 * date       : 2022-01-24
 * desc       : HelloApp을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */
public class HelloService {

    public String getHello(HelloDTO hello) {
        return String.format("안녕 나는 %s이고 나이는 %d야.",hello.getName(),hello.getAge());


    }

    }



