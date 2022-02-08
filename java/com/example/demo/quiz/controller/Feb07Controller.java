package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Feb07Service;
import com.example.demo.quiz.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : Feb07Controller
 * author     : MinHye_Sim
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07   MinHye_Sim   최초 생성
 */
public class Feb07Controller {
    /**
     * int num = (int) (Math.random() * 6) +1;
     * 0: exit
     * 1. 주사위 dice
     * 2. 가위바위보 rps
     * 3. 입력 받은 두 수 사이의 있는 소수 구하기 getPrime
     * 4. 자바로 입력받은 연도가 윤년인지 평년인지 구하기 leapYear
     * 5. 임의로 입력받은 숫자 맞추기 numberGolf
     * */
    public void execute (Scanner scanner) {
        Feb07Service feb07Service = new Feb07ServiceImpl();

        while (true){
            System.out.println("메뉴선택");
            String res = "";

            switch (scanner.next()){
                case "0" :
                    System.out.println("exit");
                    return;

                case "1" :
                    System.out.println("dice");
                    feb07Service.dice(scanner);
                    break;

                case "2" :
                    System.out.println("rps");
                    feb07Service.rps(scanner);
                    break;

                case "3" :
                    System.out.println("두 수를 입력해주세요.");
                    feb07Service.getPrime(scanner.nextInt(),scanner.nextInt());
                    break;

                case "4" :
                    System.out.println("leapYear");
                    feb07Service.leapYear(scanner);
                    break;

                case "5" :
                   res = feb07Service.numberGolf();
                    System.out.println(res);
                    break;



            }
        }




    }
}
