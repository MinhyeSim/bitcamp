package com.example.demo.auth.domain;

/**
 * packageName: com.example.demo.calc
 * fileName   : CalcApp.java
 * author     : MinHye_Sim
 * date       : 2022-01-24
 * desc       : 숫자 2개와 연산자 1개를 받아서 결과를 리턴하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */

public class CalcDTO {
    public static String CALC_APP ="계산기";

    private final static CalcDTO calcDTO = new CalcDTO();

    private CalcDTO(){}

    public static CalcDTO getInstance(){
        return calcDTO;
    }

    private int num1;
    private String opcode;
    private int num2;


    public int getNum1(){
        return num1;
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }

    public String getOpcode(){
        return opcode;
    }

    public void setOpcode(String opcode){
        this.opcode = opcode;
    }

    public int getNum2(){
        return num2;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public String calc(int num1, String opcode, int num2) {
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;
        int res = 0;
        /*
        if(opcode.equals("+")){
            res = num1 + num2;
        }else if (opcode.equals("-")){
            res = num1 - num2;
        }else if (opcode.equals("*")){
            res = num1 * num2;
        }else if (opcode.equals("/")){
            res = num1 / num2;
        } */



        switch (opcode){
            case "+" : res = num1 + num2; break;
            case "-" : res = num1 - num2; break;
            case "*" : res = num1 * num2; break;
            case "/" : res = num1 / num2; break;
        }



        String result = String.format("%d %s %d = %d",
                this.num1, this.opcode, this.num2, res);

        return result;
    }

    }


















