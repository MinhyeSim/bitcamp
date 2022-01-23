package com.example.demo;

import java.util.Scanner;

public class LoginApp {
    public static String website = "=== Naver.com ===";
    private String id = "";
    private String pw = "";
    private String name = "";

    public String loginapp(String idParam, String pwParam, String nameParam){
        id = idParam;
        pw = pwParam;
        name = nameParam;
        return " ID : "+id+", PW : "+pw+" Name : "+name;
    }

}
