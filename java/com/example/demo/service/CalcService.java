package com.example.demo.service;

import com.example.demo.domain.CalcDTO;

/**
 * packageName: com.example.demo.calc
 * fileName   : CalcDemo.java
 * author     : MinHye_Sim
 * date       : 2022-01-24
 * desc       : 계산기 앱을 실행하는 데모
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */
public class CalcService {

    public String getCalc(CalcDTO calc){
        return String.format("%d %s %d = %d",calc.getNum1(),calc.getOpcode(),calc.getNum2());


    }

    }

