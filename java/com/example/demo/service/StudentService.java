package com.example.demo.service;

import com.example.demo.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentService
 * author     : MinHye_Sim
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07   MinHye_Sim   최초 생성
 */
public interface StudentService {
    String bmi(BmiDTO bmi);
    String Calc(CalcDTO calc);
    String getGrade(GradeDTO grade);
    String getHello(HelloDTO hello);
    String getLogin(LoginDTO login);
}
