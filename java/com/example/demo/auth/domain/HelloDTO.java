package com.example.demo.auth.domain;
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
public class HelloDTO {
    public static String HELLO_TITLE = "헬로우 어플";

    private final static HelloDTO helloDTO = new HelloDTO();

    private HelloDTO(){}

    public static HelloDTO getInstance(){
        return helloDTO;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
