package com.example.demo.quiz.controller;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName   : Feb09Controller
 * author     : MinHye_Sim
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08   MinHye_Sim   최초 생성
 */
public class Feb09Controller {
    public void execute(Scanner scanner) {

        while (true){
            System.out.println("메뉴선택");
            String res = "";

            switch (scanner.next()){
                case "0" :
                    System.out.println("exit");
                    return;

                case "1" :
                    System.out.println("dice");
                    break;

                case "2" :
                    System.out.println("rps");
                    break;

                case "3" :
                    System.out.println("두 수를 입력해주세요.");
                    break;

                case "4" :
                    System.out.println("leapYear");
                    break;

                case "5" :
                    System.out.println(res);
                    break;



            }
        }

    }
}
