package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Feb10Service;
import com.example.demo.quiz.service.Feb10ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName   : Feb09Controller
 * author     : MinHye_Sim
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08   MinHye_Sim   최초 생성
 */
public class Feb10Controller {
    /**
     * 0: exit
     * 1. Sort3
     * 2. Sort2
     * 3. Square
     * 4. Zigzag
     * 5. Star
     * */
    public void execute(Scanner scanner) {
        Feb10Service service = new Feb10ServiceImpl();
        while (true){
            System.out.println("[소메뉴] 0)Exit 1)Sort3 2)Sort2 3)Square 4)Zigzag 5)Star");

            switch (scanner.next()){
                case "0" :
                    System.out.println("exit");
                    return;

                case "1" :
                    System.out.println("Sort3");

                    break;

                case "2" :
                    System.out.println("Sort2");
                    break;

                case "3" :
                    System.out.println("Square");
                    break;

                case "4" :
                    System.out.println("Zigzag");
                    service.zigzag();
                    break;

                case "5" :
                    System.out.println("Star");
                    break;


                case "6" :
                    System.out.println("Wrong");
                    break;



            }
        }

    }
}
