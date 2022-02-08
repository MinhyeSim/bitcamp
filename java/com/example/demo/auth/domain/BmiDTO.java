package com.example.demo.auth.domain;

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
public class BmiDTO extends Object {
    public static String Bmi_App = "BMI 구하기";
        private String name;
        private double tall;
        private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}




