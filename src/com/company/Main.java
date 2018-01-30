package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite savo svori ir ugi");
        Scanner scanner = new Scanner(System.in);
        float svoris = scanner.nextFloat();
        float ugis = scanner.nextFloat();
        float KMY = svoris / (ugis * ugis);
        System.out.println(KMY);


    }
}