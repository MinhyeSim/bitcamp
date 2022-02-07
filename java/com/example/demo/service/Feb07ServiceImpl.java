package com.example.demo.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : Feb07ServiceImpl
 * author     : MinHye_Sim
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07   MinHye_Sim   최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service{

    @Override
    public void dice(Scanner scanner) {

    }

    @Override
    public void rps(Scanner scanner) {

    }

    @Override
    public void getPrime(Scanner scanner) {

    }
    /**
     * 특정 연도(Year)를 입력 받아 해당 연도가 윤년인지 평년인지 판별
     * 윤년 : 2월을 29일로 둬 4년 마다 1번씩 돌아오는 해 (4로 나눠 떨어지는 해는 윤년, 그밖의 해는 평년으로한다)
     *
     * [규칙]
     * 1. 4의 배수인 해는 윤년으로 한다.
     * 2. 100의 배수인 해는 윤년으로 하지 않는다.(=평년)
     * 3. 하지만 400의 배수인 해는 윤년으로 한다.
     *
     * [윤년 및 평년 구하는 조건]
     * 1. 연도가 4로 나누어 떨어지면 윤년 (year % 4 == 0)
     *      ex) 2020년, 2024년, 2028년, ...
     * 2. 1의 조건을 만족 하는 것 중, 연도가 100으로 나누어 떨어지면 평년  (year % 100 == 0)
     *      ex) 2100년, 2200년, 2300년, ...
     * 3. 2의 조건을 만족 하는 것 중, 400으로 나누어 떨어지면 윤년 (year % 400 == 0)
     *      ex) 2000년, 2400년, 2800년, ...
     *
     * [구하는 방법]
     * 1. if-else loop를 사용하여 조건이 참인 경우 윤년, 거짓인 경우에는 평년이라는 문구를 출력하도록한다.
     * (참고) && 는 and의 연산자, ||는 or의 연산자이다.
     *    (&&는 &&를 기준으로 좌항과 우항이 참이 되어야 출력이 가능하다.
     *    ||은 ||은 기준으로 좌항과 우항 중 하나라도 참이면 전체가 참이 되어 값이 출력된다.)
     * 2. 윤년 및 평년 구하는 조건을 토대로 다음에 부합하는 if-else loop를 생성한다.
     * [년도를 4로 나눈 나머지가 0]이면서(and),[년도를 100으로 나눈 것이 0이 아니거나][400으로 나눈 나머지가 0인것]
     * [기본값] = 평년
     *
     * */

    @Override
    public void leapYear(Scanner scanner) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("연도를 입력하시오 : ");
        int year = scanner1.nextInt();
        if(year % 4 ==0 && year % 100 !=0 || year % 400 ==0){
            System.out.println(year + " 년은 윤년입니다.");
        } else {
            System.out.println(year + " 년은 평년입니다.");
        }
        }



    @Override
    public void numberGolf(Scanner scanner) {

    }
}
