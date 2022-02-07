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
public class StudentServiceImpl implements StudentService{
    /**
     * BMI = w / t * t
     * 고도 비만 : 35 이상
     * 중(重)도 비만 (2단계 비만) : 30 - 34.9
     * 경도 비만 (1단계 비만) : 25 - 29.9
     * 과체중 : 23 - 24.9
     * 정상 : 18.5 - 22.9
     * 저체중 : 18.5 미만
     * */
    @Override
    public String bmi(BmiDTO param) {
        double bmi = param.getWeight() / (param.getTall() * param.getTall()) * 10000 ;
        String s = "";
        if(bmi >= 35){
            s = "고도 비만";
        }else if(bmi >=30){
            s = "중(重)도 비만 (2단계 비만)";
        }else if(bmi >= 25){
            s = "경도 비만 (1단계 비만)";
        }else if(bmi >=23){
            s = "과체중";
        }else if(bmi >= 18.5){
            s = "정상";
        }else {
            s = "저체중";
        }

        return "";

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
        return String.format("안녕 나는 %s이고 나이는 %d야.",hello.getName(),hello.getAge());

    }

    @Override
    public String getLogin(LoginDTO login) {
        return String.format("ID : %s , PW : %s, NAME %s님 로그인 성공",login.getId(),login.getPw(),login.getName());
    }
}
