package com.example.demo.bmi;

import java.util.Scanner;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiDemo
 * author     : MinHye_Sim
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */
public class BmiDemo {

    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();
        System.out.println(BmiApp.Bmi_App);
        System.out.println("이름 : ");
        String name = scanner.next();
        System.out.println("키 : ");
        String tall = scanner.next();
        System.out.println("몸무게");
        String weight = scanner.next();
        String res = bmiApp.bmi(name,tall,weight);
        System.out.println(res);
    }






    }


