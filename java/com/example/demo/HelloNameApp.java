package com.example.demo;

import java.util.Scanner;

public class HelloNameApp {
    String id = "";
    String pw = "";
    String name = "";
    String state = "";

    public String hellonameapp(String paramId, String paramPw, String paramName){
        id = paramId;
        pw = paramPw;
        name = paramName;
        return " ID "+id+" PW "+pw+" Name "+name;


    }
}
