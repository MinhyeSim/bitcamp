package com.example.demo.naverlogin;

import java.util.Scanner;

/**
 * packageName: com.example.demo.naverlogin
 * fileName   : NaverLoginDemo
 * author     : MinHye_Sim
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */
public class NaverLoginDemo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        NaverLoginApp naverLoginApp = new NaverLoginApp();
        System.out.println("id");
        String id = scanner.next();
        System.out.println("pw");
        String pw = scanner.next();
        String res = naverLoginApp.naverlogin(id,pw);
        System.out.println(res);


    }

}


