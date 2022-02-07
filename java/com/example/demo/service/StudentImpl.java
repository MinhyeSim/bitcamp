package com.example.demo.service;

import com.example.demo.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentImpl
 * author     : MinHye_Sim
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07   MinHye_Sim   최초 생성
 */
public class StudentImpl implements StudentService{
    @Override
    public String bmi(BmiDTO bmi) {
        return String.format("%s는 정상", bmi.getName());

    }

    @Override
    public String calc(CalcDTO calc) {
        return String.format("%d %s %d = %d",calc.getNum1(),calc.getOpcode(),calc.getNum2());
    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (avg >=60) ? "pass" : "non" ;


        return String.format("########## %s ########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d점\n" +
                        " * > 영어: %d점\n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점\n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################",GradeDTO.GRADE_TITLE,
                grade.getName(),
                grade.getKor(),
                grade.getEng(),
                grade.getMath(),
                total,
                avg,
                pass);
    }

    @Override
    public String getHello(HelloDTO hello) {
        return null;
    }

    @Override
    public String getLogin(LoginDTO login) {
        return null;
    }
}
