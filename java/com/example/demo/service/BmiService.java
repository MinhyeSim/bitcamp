package com.example.demo.service;

import com.example.demo.auth.domain.BmiDTO;

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
public class BmiService {
    public String getBmi(BmiDTO bmi){
        return String.format("%s는 정상", bmi.getName());

    }





    }


