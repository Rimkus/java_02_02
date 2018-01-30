package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("irasykite atstuma");
        Scanner scanner = new Scanner(System.in);
        float atstumas = scanner.nextFloat();
        System.out.println("irasykite sanaudas");
        float sanaudos = scanner.nextFloat();

        float vidurkis = (sanaudos * 100) / atstumas;
        System.out.println("jusu vidurkis ira:" + vidurkis);


    }
}