package com.example.demo.grdae;

import java.util.Scanner;

/**
 * packageName: com.example.demo.grdae
 * fileName   : GradeDemo
 * author     : MinHye_Sim
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-26   MinHye_Sim   최초 생성
 */
public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();
        String name = scanner.next();
        int kor = scanner.nextInt();
        int eng = scanner.nextInt();
        int math = scanner.nextInt();
        String res = gradeApp.GradeTitle(name,kor,eng,math);
        System.out.println(res);
    }
}
