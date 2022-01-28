package com.example.demo.controller;

import com.example.demo.bmi.BmiDTO;
import com.example.demo.bmi.BmiService;
import com.example.demo.calc.CalcDTO;
import com.example.demo.calc.CalcService;
import com.example.demo.grdae.GradeService;
import com.example.demo.hello.HelloService;
import com.example.demo.login.LoginService;

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
        GradeService gradeDemo = new GradeService();
        HelloService helloDemo = new HelloService();
        LoginService loginDemo = new LoginService();
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

                case "3":
                    res = "GRADE";


                    break;
                case "4":
                    res = "HELLO";



                    break;
                case "5":
                    res = "LOGIN";
                    break;
            }
            System.out.println(res);
        }
    }
    }

