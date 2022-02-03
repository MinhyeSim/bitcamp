package com.example.demo.controller;

import com.example.demo.domain.*;
import com.example.demo.service.BmiService;
import com.example.demo.service.CalcService;
import com.example.demo.service.GradeService;
import com.example.demo.service.HelloService;
import com.example.demo.service.LoginService;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController
 * author     : MinHye_Sim
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27   MinHye_Sim   최초 생성
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcService calcService = new CalcService();
        CalcDTO calc = new CalcDTO();
        BmiDTO bmi = new BmiDTO();
        BmiService bmiService = new BmiService();
        GradeService gradeService = new GradeService();
        GradeDTO grade = new GradeDTO();
        HelloService helloService = new HelloService();
        HelloDTO hello = new HelloDTO();
        LoginService loginService = new LoginService();
        LoginDTO login = new LoginDTO();
        while (true) {
            System.out.println("메뉴 선택");
            String menu = "(0)Exit (1)BMI (2)CALC (3)GRADE (4)HELLO (5)LOGIN ";
            System.out.println();
            String select = scanner.next();
            String res = "";

            switch (select) {
                case "0":
                    System.out.println("EXit");
                    return;
                case "1":
                    System.out.println(BmiDTO.Bmi_App+"\n이름, 키, 몸무게 입력");
                    bmi.setName(scanner.next());
                    bmi.setTall(scanner.next());
                    bmi.setWeight(scanner.next());
                    res= bmiService.getBmi(bmi);

                    break;
                case "2":
                    System.out.println(CalcDTO.CALC_APP+"\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = calcService.getCalc(calc);

                    break;

                case "3":
                    System.out.println(GradeDTO.GRADE_TITLE+"\n name, kor, eng, math 입력");
                    int count = scanner.nextInt();
                    GradeDTO[] grades = new GradeDTO[count];
                    for (int i = 0; i<grades.length;i++){
                        System.out.println("이름, 국어, 영어, 수학 점수");
                        grades[i] = new GradeDTO();
                        grades[i].setName(scanner.next());
                        grades[i].setKor(scanner.nextInt());
                        grades[i].setEng(scanner.nextInt());
                        grades[i].setMath(scanner.nextInt());


                    }for (int i = 0; i<grades.length;i++){
                    System.out.println(grades[i].getName());
                    System.out.println(grades[i].getKor());
                    System.out.println(grades[i].getEng());
                    System.out.println(grades[i].getMath());


                }



                    break;
                case "4":
                    System.out.println(HelloDTO.HELLO_TITLE+"\n name, age");
                    hello.setName(scanner.next());
                    hello.setAge(scanner.nextInt());
                    res = helloService.getHello(hello);

                    break;
                case "5":
                    System.out.println(LoginDTO.LOGIN_APP+"\n id, pw, name");
                    login.setName(scanner.next());
                    login.setId(scanner.next());
                    login.setName(scanner.next());
                    res = loginService.getLogin(login);

                    break;
            }
            System.out.println(res);
        }
    }
    }

