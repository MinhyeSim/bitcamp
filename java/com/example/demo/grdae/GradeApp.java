package com.example.demo.grdae;

/**
 * packageName: com.example.demo.grdae
 * fileName   : GradeApp
 * author     : MinHye_Sim
 * date       : 2022-01-26
 * desc       :
 * 사용자로부터
 * 이름 [          ]
 * 국어 [          ]
 * 영어 [          ]
 * 수학 [          ]
 * 을 차례대로 입력 받아서
 * ########## 성적표 ########
 * 이름: 홍길동
 * > 국어: 80점
 * > 영어: 79점
 * > 수학: 80점
 * 총점: 239점
 * 평균(정수): 79점
 * 합격여부: 합격(불합격)
 * #######################
 * 출력되는 프로그램을 작성
 * 단, 합격 / 불합격 기준은
 * 평균 60점 이상이면 합격
 *
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-26   MinHye_Sim   최초 생성
 */
public class GradeApp {
    static String GRADE_TITLE;
    private String name;
    private int kor;
    private int eng;
    private int math;


    public String GradeTitle(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        int total = 0;
        int avg = 0;

        String pass = (avg >= 60) ? "합격" : "불합격";
        String grade = String.format("########## %s ########\n" +
                                " * 이름: %s\n" +
                                " * > 국어: %d점\n" +
                                " * > 영어: %d점\n" +
                                " * > 수학: %d점\n" +
                                " * 총점: %d점\n" +
                                " * 평균(정수): %d점\n" +
                                " * 합격여부: %s\n" +
                                " * #######################",
                        com.example.demo.grdae.GradeApp.GRADE_TITLE,
                name, kor, eng, math, total, avg, pass);
                return grade;
            }
        }





