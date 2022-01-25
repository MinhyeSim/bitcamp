package com.example.demo.naverlogin;

/**
 * packageName: com.example.demo.naverlogin
 * fileName   : NaverLoginApp
 * author     : MinHye_Sim
 * date       : 2022-01-25
 * desc       :
 * 클래스변수   : NAVERLOGIN
 * 인스턴스변수 : id, pw
 * 파라미터    : id, pw
 * 로컬 변수   : res
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */
public class NaverLoginApp {
    public String NAVERLOGIN_APP = "NAVERLOGIN";
    private String id ;
    private String pw ;

    public String naverlogin(String id, String pw) {
        this.id = id;
        this.pw = pw;
        String res = "아이디 %s, 비밀번호 %s 로그인 성공.";

        return String.format(res,this.id,this.pw);

    }
}
