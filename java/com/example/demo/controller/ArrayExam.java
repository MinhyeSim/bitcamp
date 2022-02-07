package com.example.demo.controller;

import org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor;

/**
 * packageName: com.example.demo.controller
 * fileName   : ArrayExam
 * author     : MinHye_Sim
 * date       : 2022-02-04
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-04   MinHye_Sim   최초 생성
 */
public class ArrayExam {
    public static void main(String[] args) {
        String[] arr = {"심민혜", "권솔이", "김지혜", "하진희", "최은아",
                "해시", "힙", "깊이", "탐욕법", "스택",
                "DP", "완전탐색", "너비", "이분탐색", "큐",
                " ", " ", "정렬", " ", "그래프"};


        System.out.println("Q1.팀별 과제를 출력하세요");
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + ":" + arr[i] + "\t";
        }
        System.out.println(s);


        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 심민혜, 해시, DP");
        String l = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("김지혜")) {
                l += arr[i] + "," + arr[i + 5] + "," + arr[i + 10] + "," + arr[i + 15];
            }
        }
        System.out.println(l);
    }
}





        //System.out.println("Q3. 큐를 담당한 사람을 출력하세요 예) 큐를 담당한 사람 : 최은아");


        //System.out.println("Q4. 팀원별 과제 수를 출력하세요 " +"예) 심민혜(2개),권솔이(2개),김지혜(3개),하진희(2개),최은아(3개) ");







        //System.out.println(l);












