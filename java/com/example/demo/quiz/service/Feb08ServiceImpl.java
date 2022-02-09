package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb08ServiceImpl
 * author     : MinHye_Sim
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08   MinHye_Sim   최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    Scanner scanner1 = new Scanner(System.in);


    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {

    }


    @Override
    public void bank(Scanner scanner) {
        int money;
        int totalmoney = 0;

        while (true){

            System.out.println("0)exit 1)입금 2)출금 3)잔고");
            System.out.println("선택 : ");

            int choice =  scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("예금액 :");
                    money = scanner.nextInt();
                    totalmoney = totalmoney+money;

                    break;

                case 2:
                    System.out.print("출금액 :");
                    money = scanner.nextInt();
                   totalmoney = totalmoney-money;
                    break;

                case 3:
                    System.out.print("잔고액 :");
                    System.out.println(totalmoney);
                    break;

                case 4:
                    System.out.println("프로그램 종료");
                    break;

                default:
                    System.out.println("다시 입력해주세요");
                    break;

            }
        }




    }




    @Override
    public void gugudan(Scanner scanner) {

    }
}
