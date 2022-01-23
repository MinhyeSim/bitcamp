package com.example.demo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalcApp {
    public static String website = "Calc.com";
    private int num1=0;
    private int num2=0;
    private String opcode = "+";
    int num3 = num1 + num2;

    public  String calc(int no1, String op, int no2 ){
        num1 = no1;
        num2 = no2;
        opcode = op;
        int result = no1+no2;
        return num1+" "+opcode+" "+num2+" = "+result;


    }


    }

