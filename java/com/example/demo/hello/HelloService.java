package com.example.demo.hello;

import java.util.Scanner;
/**
 * packageName: com.example.demo.calc
 * fileName   : HelloDemo.java
 * author     : MinHye_Sim
 * date       : 2022-01-24
 * desc       : HelloApp을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */
public class HelloService {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        HelloDTO helloApp = new HelloDTO();
        System.out.println(HelloDTO.HELLO_TITLE);
        System.out.println("이름");
        String name = scanner.next();
        System.out.println("나이");
        int age = scanner.nextInt();

        String res = helloApp.hello(name,age);
        System.out.println(res);




    }

    }



