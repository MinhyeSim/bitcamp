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

    public void execute (String name, String tall, String weight){
        BmiApp bmiApp = new BmiApp();
        String res = bmiApp.bmi(name,tall,weight);
        System.out.println(res);
    }






    }


