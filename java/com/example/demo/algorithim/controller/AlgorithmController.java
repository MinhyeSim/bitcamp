package com.example.demo.algorithim.controller;

import com.example.demo.algorithim.service.HashService;
import com.example.demo.algorithim.service.HashServiceImpl;

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
public class AlgorithmController {
    public void execute (Scanner scanner) {
        HashService service = new HashServiceImpl();



        while (true){
            System.out.println("[담당] 0.Exit 1.심민혜");

            switch (scanner.next()){
                case "0" : return;
                case "1" :
                    System.out.println("0.Exit 1.Hash 2.Dp");
                    switch (scanner.next()){
                        case "0" :
                            System.out.println("Exit");return;
                        case "1" :
                            String[] participant = new String[10] ;
                            String[] completion = new String[10];
                            service.failedplayer(participant,completion);
                        case "2" :

                    }





            }
        }
    }
}
