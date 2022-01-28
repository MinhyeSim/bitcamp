package com.example.demo.domain;
/**
 * packageName: com.example.demo.calc
 * fileName   : KakaoApp.java
 * author     : MinHye_Sim
 * date       : 2022-01-24
 * desc       : 전화번호와 메세지를 입력 받아서 전송하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */

public class KaKaoDTO {
    public static String kakaoapp = "카카오";
    int telno;
    String message;

    public String kakao(int telno, String message){
        this.telno=telno;
        this.message=message;

        return String.format("Telno : %s, Message : %s",this.telno, this.message);

    }
}
