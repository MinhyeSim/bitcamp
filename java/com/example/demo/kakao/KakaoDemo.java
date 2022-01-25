package com.example.demo.kakao;

import java.security.PublicKey;
import java.util.Scanner;

public class KakaoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KaKaoApp kaKaoApp = new KaKaoApp();
        System.out.println("Tel no : ");
        int telno = scanner.nextInt();
        System.out.println("message : ");
        String message = scanner.next();
        String res = kaKaoApp.kakao(telno,message);
        System.out.println(res);



    }


}
