package com.example.demo.login;

import com.example.demo.login.LoginApp;

import java.util.Scanner;

public class LoginDemo {

    public static void main(String[] args) {
           LoginApp loginApp = new LoginApp();
           Scanner scanner = new Scanner(System.in);
        System.out.println(loginApp.LOGIN_APP);
        System.out.println("ID");
        String id = scanner.next();
        System.out.println("PW");
        String pw = scanner.next();

       }

    }

