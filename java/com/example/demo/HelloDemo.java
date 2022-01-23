package com.example.demo;

import java.util.Scanner;

public class HelloDemo {

    public static void main(String[] args){
        HelloNameApp helloNameApp = new HelloNameApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID: ");
        System.out.println("Input PW: ");
        System.out.println("Input Name: ");
        System.out.println("Output: ");
        String id =scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        System.out.println("Output: ");
        String result = helloNameApp.hellonameapp(id, pw, name);
        System.out.println(result);

    }

}

