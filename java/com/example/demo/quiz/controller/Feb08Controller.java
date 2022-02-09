package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Feb08Service;
import com.example.demo.quiz.service.Feb08ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName   : Feb08Controller
 * author     : MinHye_Sim
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08   MinHye_Sim   최초 생성
 */
public class Feb08Controller {
    /**
     * 0: exit
     * 1. 로또 lotto
     * 2. 야구 baseball
     * 3. 좌석예약 booking
     * 4. 은행 입출금 bank
     * 5. 구구단 gugudan
     * */
    public void execute(Scanner scanner) {
        Feb08Service service = new Feb08ServiceImpl();

        while (true){
            System.out.println("[소메뉴] 0)Exit 1)Lotto 2)Baseball 3)Booking 4)Bank 5)Gugudan");
            String res = "";

            switch (scanner.next()){
                case "0" :
                    System.out.println("exit");
                    return;

                case "1" :
                    System.out.println("lotto");
                    service.lotto(scanner);
                    break;

                case "2" :
                    System.out.println("baseball");
                    service.baseball(scanner);
                    break;

                case "3" :
                    System.out.println("booking");
                    service.booking(scanner);
                    break;

                case "4" :
                    System.out.println("bank");
                    service.bank(scanner);
                    break;

                case "5" :
                    System.out.println("gugudan");
                    service.gugudan(scanner);
                    break;



            }
        }

    }
}
