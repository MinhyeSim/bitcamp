package com.example.demo.controller;

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
    public static void main(String []args){
        String[] arr = {"심민혜", "권솔이", "김지혜", "하진희", "최은아",
                "해시",    "힙",   "깊이",  "탐욕법", "스택",
                "DP",   "완전탐색","너비", "이분탐색", "큐",
                " " ,     " " ,   "정렬",  "   ", "그래프"};

        System.out.println("Q1.팀별 과제를 출력하세요");
        String s ="";
        for(int i=0; i < arr.length;i++){
            s += arr[i]+"\t";

        }
        System.out.println(s);


        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요.");

        System.out.println("Q3. 큐를 담당한 사람을 출력하세요 예) 큐를 담당한 사람 : 최은아");

    }
}
