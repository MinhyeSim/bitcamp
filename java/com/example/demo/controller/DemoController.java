package com.example.demo.controller;

import com.example.demo.bmi.BmiApp;
import com.example.demo.bmi.BmiDemo;

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
        for (int i = 0; i<2; i++) {
            System.out.println("메뉴선택");
            String menu = (i+"(1)BMI (2)CALC (3)SEARCH (4)GRADE (5)LOGIN");
            System.out.println(menu);
            String select = scanner.next();
            String res = "";

            switch (select) {
                case "1": res = "(1)BMI";break;
                case "2": res = "(2)CALC";break;
                case "3": res = "(3)SEARCH";break;
                case "4": res = "(4)GRADE";break;
                case "5": res = "(5)LOGIN";break;
                default: res = "Wrong";break;
            }
            System.out.println(res);


        }
    }
}