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
    public  String execute(String name, int kor, int eng, int math) {

      GradeApp gradeApp = new GradeApp();
      return gradeApp.getGradeTitle(name,kor,eng,math);

    }
}
