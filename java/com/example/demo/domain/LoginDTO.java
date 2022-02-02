package com.example.demo.domain;

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
public class LoginDTO {
    public static String LOGIN_APP = "로그인";
    private String id;
    private String pw;
    private String name;
    private static String PASSWORD = "abc";

    public String getId() {return id;
    }
    public void setId(String id){this.id = id;}
    public String getPw(){return pw;}
    public void setPw(String pw){this.pw = pw;}
    public String getName(){return name;

    }
    public void setName(String name){this.name = name;}
}
