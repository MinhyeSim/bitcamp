package com.example.demo.abc;

import java.util.Scanner;

/**
 * packageName: com.example.demo.abc
 * fileName   : AbcDemo
 * author     : MinHye_Sim
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-03   MinHye_Sim   최초 생성
 */
public class AbcDemo {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        AbcApp abcApp = new AbcApp();
        System.out.println(AbcApp.ABC);
        System.out.println("이름");
        String name = scanner.next();
        System.out.println("나이");
        int age = scanner.nextInt();

        String res = abcApp.abc(name,age);
        System.out.println(res);


    }

}
