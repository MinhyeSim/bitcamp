package com.example.demo.controller;

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
public class QuizController {
    public static void main(String[] args) {
        String[] arr = {"심민혜", "권솔이", "김지혜", "하진희", "최은아",
                "해시", "힙", "깊이", "탐욕법", "스택",
                "DP", "완전탐색", "너비", "이분탐색", "큐",
                " ", " ", "정렬", "   ", "그래프"};
        Scanner scanner = new Scanner(System.in);
        while (true){
            switch (scanner.next()){
                case  "0" :
                    System.out.println("시스템종료"); return;
                case  "1" :
                    quiz1(arr); break;
                case "2" :
                    quiz2(arr); break;
                case "3" :
                    quiz3(arr); break;
                case  "4" :
                    quiz4(arr); break;

            }
        }


    }

    private static void quiz4(String[] arr) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요 예) 심민혜(2개),권솔이(2개),김지혜(3개),하진희(2개),최은아(3개) ");
        int count = 0;
        String countManager = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i].equals(arr[5])) {
                count0++;
            }
            if (arr[i].equals(arr[6])) {
                count1++;
            }
            if (arr[i].equals(arr[7])) {
                count2++;
            }
            if (arr[i].equals(arr[8])) {
                count3++;
            }
            if (arr[i].equals(arr[9])) {
                count4++;
            }
        }
        System.out.println(arr[0] + "의 카운트는" + count0);
        System.out.println(arr[1] + "의 카운트는" + count1);
        System.out.println(arr[2] + "의 카운트는" + count2);
        System.out.println(arr[3] + "의 카운트는" + count3);
        System.out.println(arr[4] + "의 카운트는" + count4);
    }

    private static void quiz3(String[] arr) {
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요 예) 큐를 담당한 사람 : 최은아");
        String s = "";
        for(int i = 0; i< arr.length; i++){
            if(arr[i].equals("큐")) {
                s += arr[i] + "의 담당자는 " + arr[i%5] ;

            }
            System.out.println(s);
            }
    }

    private static void quiz2(String[] arr) {
        String s;
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요.");
        s = " ";
        for(int i = 0; i< arr.length; i++){
        if(arr[i].equals("김지혜")){
           // l +="김지혜 : " + arr[7]+","+arr[12]+","+arr[17];
            // l += arr[i]+":";
            //l += arr[i+5]+",";
           //l += arr[i+10]+",";
            // l += arr[i+15];

            //int [] a = {1,2,3,4,5};
            //for(int j =1; j<6; j++){
            //System.out.println(j);

            for(int j=0; j<4;j++)
            s +=  arr[i+j*5]+",";
            if(i==17){break;}
            }

        }
        System.out.println(s);
    }

    private static void quiz1(String[] arr) {

        System.out.println("Q1.팀별 과제를 출력하세요");
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 ==0) {s+="\n";}
             s += i + ":" + arr[i] ;
        }
        System.out.println(s);
    }


}



























