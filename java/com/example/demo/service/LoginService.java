package com.example.demo.service;

import com.example.demo.auth.domain.UserDTO;

/**
 * packageName: com.example.demo.calc
 * fileName   : LoginDemo.java
 * author     : MinHye_Sim
 * date       : 2022-01-24
 * desc       : 로그인앱을 실행 시키는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */
public class LoginService {

    public String getLogin(UserDTO login) {
        return String.format("ID : %s , PW : %s, NAME %s님 로그인 성공",login.getId(),login.getPw(),login.getName());

       }

    }

