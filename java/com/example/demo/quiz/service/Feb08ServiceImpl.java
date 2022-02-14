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
    /**
     * author : 심민혜
     * desc : 은행 입출금
     *
     * 목표 : 입금액과 출금액을 각각 기재 후 잔고가 출력되도록 한다.
     *
     * 계좌 입출금을 하기 위해 '돈을 입출금하는 사람'과
     * '그 돈이 입출금되는 은행 계좌' 두가지 클래스를 생성해야하는데
     * 2가지 클래스를 생성해 연결시키는 부분이 어려워 입출금 금액을 입력 후 잔고가 출력되는 방법으로 코딩했습니다.
     * (출처 : https://bmy1320.tistory.com/35
     *        https://a-legendary-xcom.tistory.com/3)
     * */


    @Override
    public void bank(Scanner scanner) {

        int money;
        int totalmoney=0;

        while (true){

            System.out.println("1)입금 2)출금 3)잔고 4)exit");
            System.out.println("선택 : ");

            int choice =  scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("예금액 :");
                    money = scanner.nextInt();
                    totalmoney = totalmoney+money;
                    //기존 잔액 + 예금액의 값을 저장

                    break;

                case 2:
                    System.out.print("출금액 :");
                    money = scanner.nextInt();
                   totalmoney = totalmoney-money;
                   //저장된 잔액 - 출금액의 값을 저장
                    break;

                case 3:
                    System.out.print("잔고액 :");
                    System.out.println(totalmoney);
                    //예금액 - 출금액의 값을 잔고액으로 출력
                    break;

                case 4:
                    System.out.println("프로그램 종료");
                    return;

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
