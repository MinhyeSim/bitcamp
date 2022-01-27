package com.example.demo.controller;

import com.example.demo.bmi.BmiApp;
import com.example.demo.bmi.BmiDemo;
import com.example.demo.calc.CalcApp;
import com.example.demo.calc.CalcDemo;
import com.example.demo.grdae.GradeApp;
import com.example.demo.grdae.GradeDemo;
import com.example.demo.hello.HelloApp;
import com.example.demo.hello.HelloDemo;
import com.example.demo.login.LoginDemo;

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
        CalcDemo calcDemo = new CalcDemo();
        BmiDemo bmiDemo = new BmiDemo();
        GradeDemo gradeDemo = new GradeDemo();
        HelloDemo helloDemo = new HelloDemo();
        LoginDemo loginDemo = new LoginDemo();
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
                    res = "BMI";
                    System.out.println(BmiApp.Bmi_App);
                    System.out.println("이름, 키, 몸무게");
                    String name = scanner.next();
                    String tall = scanner.next();
                    String weight = scanner.next();
                    bmiDemo.execute(name,tall,weight);

                    break;
                case "2":
                    res = "CALC";
                    System.out.println(CalcApp.CALC_APP+"\n숫자1, 연산자, 숫자2 입력");
                    System.out.println(calcDemo.execute(scanner.nextInt(), scanner.next(),scanner.nextInt()));
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

