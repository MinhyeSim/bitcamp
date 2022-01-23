package com.example.demo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println(LoginApp.website);
        System.out.println("ID : ");
        System.out.println("PW : ");
        System.out.println("Name : ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        String result = loginApp.loginapp(id, pw, name);
        System.out.println(result);

    }
}
