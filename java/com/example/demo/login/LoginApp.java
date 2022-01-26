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
    static String PASSWORD = "abc";

    public String login(String id, String pw,String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        /*
        if(pw.equals(PASSWORD) ){
         */
        /*    res = String.format(" %s님의 비번 %s가 맞습니다. 로그인 성공 ",this.name, this.pw);
        }else {
            res = String.format(" %s님의 ID는 맞고, 비번 %s가 틀립니다. 로그인 실패 ",this.id, this.pw);

        }*/

        /* switch (pw){
           case "abc" : res = String.format(" %s님의 비번 %s가 맞습니다. 로그인 성공 ",this.name,this.pw); break;
            default: res = String.format(" %s님의 ID는 맞고, 비번 %s가 틀립니다. 로그인 실패 ",this.id, this.pw); break;
       }*/

        return  (pw.equals(PASSWORD)) ? String.format(" %s님의 비번 %s가 맞습니다. 로그인 성공 ", this.name, this.pw)
                : String.format(" %s님의 ID는 맞고, 비번 %s가 틀립니다. 로그인 실패 ",this.id, this.pw);



    }
}
