package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Feb08Service;
import com.example.demo.quiz.service.Feb08ServiceImpl;

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
        Feb06Controller feb06Controller = new  Feb06Controller();
        Feb07Controller feb07Controller = new Feb07Controller();
        Feb08Controller feb08Controller = new Feb08Controller();

        while (true){
            System.out.println("[서브메뉴] 0)exit 1)2월 6일 2)2월 7일 3)2월 8일");
            switch (scanner.next()){
                case "0":
                    System.out.println("exit"); return;
                case "1" : feb06Controller.execute(scanner); break;
                case "2" : feb07Controller.execute(scanner); break;
                case "3" : feb08Controller.execute(scanner); break;
                case "4" : break;
                default:
                    System.out.println("Wrong Choice"); break;
            }
        }
    }

    }






























