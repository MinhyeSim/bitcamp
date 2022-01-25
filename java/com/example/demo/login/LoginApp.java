package com.example.demo.login;

import java.util.Scanner;
/**
 * packageName: com.example.demo.calc
 * fileName   : LoginApp.java
 * author     : MinHye_Sim
 * date       : 2022-01-24
 * des        : 아이디와 비밀번호를 입력 받아서 로그인하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */
public class LoginApp {
    static String LOGIN_APP;
    String id;
    String pw;
    String name;

    public String login(String id, String pw,String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;

        return String.format(" ID : %s, PW : %s, Name : %s ",this.id, this.pw, this.name);


    }
}
