package com.example.demo.hello;
/**
 * packageName: com.example.demo.calc
 * fileName   : HelloApp.java
 * author     : MinHye_Sim
 * date       : 2022-01-24
 * desc       : 이름, 나이를 입력받아서 인사말을 리턴하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */
public class HelloApp {
    static String HELLO_TITLE = "헬로우 어플";
    String name;
    int age;

    public String hello(String name, int age){
        this.name = name;
        this.age = age;

        return String.format(" 안녕 나는 %s 이고 나이는 %d 이야 ",this.name,this.age);




    }


}