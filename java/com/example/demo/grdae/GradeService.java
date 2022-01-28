package com.example.demo.grdae;

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
public class GradeService {
    public  String execute(String name, int kor, int eng, int math) {

      GradeDTO gradeApp = new GradeDTO();
      return gradeApp.getGradeTitle(name,kor,eng,math);

    }
}
