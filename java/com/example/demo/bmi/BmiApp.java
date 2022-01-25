package com.example.demo.bmi;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiApp
 * author     : MinHye_Sim
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25   MinHye_Sim   최초 생성
 */
public class BmiApp {
    public static String Bmi_App = "BMI";
        private String name;
        private String tall;
        private String weight;

        public String bmi(String name, String tall, String weight){
            this.name = name;
            this.tall = tall;
            this.weight =weight;
            String res = String.format("%s는 정상",this.name);
            return res;

        }



    }




