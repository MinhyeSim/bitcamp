package com.example.demo.oop.controller;

import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

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
        PhoneService service = new PhoneServiceImpl();
        while (true){
            System.out.println("메뉴선택\n [집전화\n"+"휴대폰\n"+"아이폰\n"+"갤럭시노트]");

            switch (scanner.next()){
                case "0" :
                    System.out.println("exit");
                    return;
                case "1" :
                    System.out.println("집전화");
                    service.usePhone(scanner);

                    break;
                case "2" :
                    System.out.println("휴대폰");
                    service.useCelPhone(scanner);
                    break;
                case "3" :
                    System.out.println("아이폰");
                    service.useIPhone(scanner);
                    break;
                case "4" :
                    System.out.println("갤럭시노트");
                    service.useGalPhone(scanner);

                default:
                    System.out.println("Wrong Number");
                    break;


            }
        }


    }
}
