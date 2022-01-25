package com.example.demo.google;

/**
 * packageName: com.example.demo.google
 * fileName   : GoogleApp
 * author     : MinHye_Sim
 * date       : 2022-01-25
 * desc       :
 * 클래스 변수  : GOOGLE
 * 인스턴스 변수: search
 * 파라미터     : search
 * 로컬변수     : res
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */
public class GoogleApp {
    public  static String BMI = "BMI";
    private String name;
    private String tall;
    private String weghit;
    public String bmi(String name, String tall, String weghit){
        this.name = name;
        this.tall = tall;
        this.weghit = weghit;
        String res = String.format("");
        return res;
    }


    }


