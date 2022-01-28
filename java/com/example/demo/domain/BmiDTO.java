package com.example.demo.domain;

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
public class BmiDTO {
    public static String Bmi_App = "BMI";
        private String name;
        private String tall;
        private String weight;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getTall(){
            return tall;
        }

        public void setTall(String tall){
            this.tall = tall;
        }

        public String getWeight(){
            return weight;
        }

        public void setWeight(String weight){
            this.weight = weight;
        }





    }




