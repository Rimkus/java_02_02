package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite du skaicius");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int suma = a+b;
        int skirtumas = a-b;
        System.out.println("suma:" +suma);
        System.out.println("skirtumas:" + skirtumas);


    }
}