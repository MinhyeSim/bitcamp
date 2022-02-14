package com.example.demo.board.controller;

import com.example.demo.board.domain.CelPhone;
import com.example.demo.board.domain.GalPhone;
import com.example.demo.board.domain.IPhone;
import com.example.demo.board.domain.Phone;
import com.example.demo.board.service.PhoneService;
import com.example.demo.board.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : PhoneController
 * author     : MinHye_Sim
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08   MinHye_Sim   최초 생성
 */
public class OopController {
    public static void execute(Scanner scanner){

        while (true){
            System.out.println("[메뉴] 0.exit \n"+
                    "1.은닉화(Encapsulation) \n"+
                    "2.상속(Inheritance) \n"+
                    "3.추상화(Abstraction) \n"+
                    "4.다형성 Polymorphism");
            switch (scanner.next()){
                case "0" :
                    System.out.println("종류"); return;
                case "1" :
                    System.out.println("POJO가 은닉화다");break;
                case "2" :
                    System.out.println("extends가 상속이다.");
                    Phone phone = new Phone("금성전화기","금성전자");
                    CelPhone celPhone = new CelPhone("핸드폰","블랙베리","이동중에");
                    IPhone iPhone = new IPhone("애플");
                    GalPhone galPhone = new GalPhone("삼성");
                    PhoneService phoneService = new PhoneServiceImpl();
                    System.out.println("[소메뉴] 0.exit 1.집전화 2.휴대폰 3.아이폰 4.갤럭시폰");
                    switch (scanner.next()){
                        case "0" :
                            System.out.println("exit");return;
                        case "1" :
                            phone.setCall("여보세요?");
                            phoneService.usePhone(phone);
                            break;

                        case "2" :
                            celPhone.setCall("안녕하세요 000 입니다.");
                            phoneService.useCelPhone(celPhone);
                            break;
                        case "3" :
                            iPhone.setSearch("검색");
                            phoneService.useIPhone(iPhone);
                            break;
                        case "4" :
                            galPhone.setPay("삼성페이");
                            phoneService.useGalPhone(galPhone);
                            break;
                    }
                    break;



            }



        }


    }
}
