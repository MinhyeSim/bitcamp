package com.example.demo.login.kakao;

import java.util.Scanner;
/**
 * packageName: com.example.demo.calc
 * fileName   : KakaoDemo.java
 * author     : MinHye_Sim
 * date       : 2022-01-24
 * desc       : 카카오 앱을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */
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
