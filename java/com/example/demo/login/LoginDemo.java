package com.example.demo.login;

import com.example.demo.login.LoginApp;

import java.util.Scanner;
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
public class LoginDemo {

    public static void main(String[] args) {
           LoginApp loginApp = new LoginApp();
           Scanner scanner = new Scanner(System.in);
        System.out.println(loginApp.LOGIN_APP);
        System.out.println("ID");
        String id = scanner.next();
        System.out.println("PW");
        String pw = scanner.next();
        System.out.println("Name");
        String name = scanner.next();
        String res = loginApp.login(id,pw,name);
        System.out.println(res);

       }

    }

