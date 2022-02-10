package com.example.demo.auth.controller;

import com.example.demo.service.*;
import com.example.demo.auth.domain.*;
import com.example.demo.auth.service.StudentServiceImpl;
import com.example.demo.auth.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController
 * author     : MinHye_Sim
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27   MinHye_Sim   최초 생성
 */
public class AuthController {
    public void execute(Scanner scanner) {

        CalcService calcService = new CalcService();
        BmiService bmiService = new BmiService();
        StudentService studentService = new StudentServiceImpl();
        GradeService gradeService = new GradeService();
        HelloService helloService = new HelloService();
;
        LoginService loginService = new LoginService();

        while (true) {
            System.out.println("메뉴 선택");
            String menu = "(0)Exit (1)BMI (2)CALC (3)GRADE (4)HELLO (5)LOGIN ";
            System.out.println();
            String select = scanner.next();
            String res = "";

            switch (select) {
                case "0":
                    System.out.println("EXit");
                    return;
                case "1":
                    System.out.println(BmiDTO.Bmi_App+"\n이름, 키, 몸무게 입력");
                    BmiDTO b = BmiDTO.getInstance();
                    b.setName(scanner.next());
                    b.setTall(scanner.nextDouble());
                    b.setWeight(scanner.nextDouble());
                    res= studentService.bmi(b);

                    break;
                case "2":
                    System.out.println(CalcDTO.CALC_APP+"\n숫자1, 연산자, 숫자2 입력");
                    CalcDTO c = CalcDTO.getInstance();
                    c.setNum1(scanner.nextInt());
                    c.setOpcode(scanner.next());
                    c.setNum2(scanner.nextInt());
                    res = studentService.calc(c);

                    break;

                case "3":
                    System.out.println(GradeDTO.GRADE_TITLE+"\n name, kor, eng, math 입력");
                    int count = scanner.nextInt();
                    GradeDTO[] grades = new GradeDTO[count];
                    for (int i = 0; i<grades.length;i++){
                        System.out.println("이름, 국어, 영어, 수학 점수");
                        GradeDTO g = GradeDTO.getInstance();
                        g.setName(scanner.next());
                        g.setKor(scanner.nextInt());
                        g.setEng(scanner.nextInt());
                        g.setMath(scanner.nextInt());
                        res = studentService.getGrade(g);
                }
                    break;
                case "4":
                    System.out.println(HelloDTO.HELLO_TITLE+"\n name, age");
                    HelloDTO h = HelloDTO.getInstance();
                    h.setName(scanner.next());
                    h.setAge(scanner.nextInt());
                    res = studentService.getHello(h);

                    break;
                case "5":
                    System.out.println(UserDTO.LOGIN_APP+"\n id, pw, name");
                    UserDTO u =UserDTO.getInstance();
                    u.setName(scanner.next());
                    u.setId(scanner.next());
                    u.setName(scanner.next());
                    res = studentService.getLogin(u);

                    break;
                default: res = "Wrong";break;
            }
            System.out.println(res);
        }
    }
    }

