package com.example.demo.abc;

/**
 * packageName: com.example.demo.abc
 * fileName   : AbcApp
 * author     : MinHye_Sim
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-03   MinHye_Sim   최초 생성
 */
public class AbcApp {
    static String ABC= "abc";
    String name ;
    int age ;

    public String abc(String name,int age){
        this.name = name;
        this.age = age;

        return String.format("환영합니다. %s 님 %d세로 입장 가능 합니다.",this.name,this.age);
    }


}
