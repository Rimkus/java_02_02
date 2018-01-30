package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite savo svori ir ugi");
        Scanner scanner = new Scanner(System.in);
        float svoris = scanner.nextFloat();
        float ugis = scanner.nextFloat();
        System.out.println("jusu KMY yra:" + KMYskaiciuokle(svoris, ugis));


    }

    public static float KMYskaiciuokle(float svoris, float ugis) {
        return svoris / (ugis * ugis);
    }

}