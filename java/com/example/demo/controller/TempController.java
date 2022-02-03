package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : TempController
 * author     : MinHye_Sim
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-03   MinHye_Sim   최초 생성
 */
public class TempController {
    public static void main(String[] args) {
        String[] arr =    {"심민혜","권솔이","김지혜","하진희","최은아",
                            "해시",  "힙",  "깊이", "탐욕법","스택",
                            "DP", "완전탐색", "너비", "이분탐색","큐",
                            " " , " ",       "정렬", " ",     "그래프"} ;

        for (int i =0; i<5;i++){
            System.out.println("인덱스값"+i);
            System.out.println(arr[i]
                    +":"+arr[i+5]
                    +","+arr[i+10]
                    +","+arr[i+15]);
        }



        }


    }

