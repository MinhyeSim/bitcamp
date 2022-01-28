package com.example.demo.controller;

import com.example.demo.algorithim.Hash;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController2
 * author     : MinHye_Sim
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27   MinHye_Sim   최초 생성
 */
public class AlgoController {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("[메뉴] 0.Exit\n" +
                    "1. stack\t"+
                    "2. queue\t" +
                    "3. heap\n"+
                    "4. hash\t" +
                    "5. sort\t" +
                    "6. brute force\n"+
                    "7. dfs\t" +
                    "8. bfs\n" +
                    "9. dp\t" +
                    "10. graph\n" +
                    "11. bin search\t "+
                    "12. greedy");

            switch (scanner.next()){
                case "0" : return;
                case "1" :
                    System.out.println(Hash.solution(null));break;
                default:
                    System.out.println("WRONG MENU");break;




            }
        }
    }
}
