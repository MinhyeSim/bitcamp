package com.example.demo.kakao;
/**
 * 전화번호와 메세지를 받아서 전송하는 어플을 만드시오
 * string telno, String message
 * */

public class KaKaoApp {
    int telno;
    String message;

    public String kakao(int telno, String message){
        this.telno=telno;
        this.message=message;

        return String.format("Telno : %s, Message : %s",this.telno, this.message);

    }
}
