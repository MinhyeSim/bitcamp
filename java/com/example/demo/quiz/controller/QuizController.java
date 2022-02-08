package com.example.demo.quiz.controller;

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
    public void execute(Scanner scanner){
        Feb06Controller feb06Controller = new
                Feb06Controller();
        Feb07Controller feb07Controller = new Feb07Controller();
        while (true){
            System.out.println("0)exit 1)2월 6일 2)2월 7일 3)2월 8일");
            switch (scanner.next()){
                case "0":
                    System.out.println("exit"); return;
                case "1" : feb06Controller.execute(scanner); break;
                case "2" : feb07Controller.execute(scanner);
            }
        }
    }

    }






























