package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite du skaicius");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("suma:" +suma(a,b));
        System.out.println("skirtumas:" +skirtumas(a,b));
        System.out.println("suma:" + suma((float) a, (float) b));
        System.out.println("skirtumas:" + skirtumas((float) a, (float) b));


    }
    public static int suma(int a, int b){
        return a+b;

    }
    public static int skirtumas(int a, int b){
        return a-b;

    }
    public static float suma(float a, float b){
        return a+b;
    }
    public static float skirtumas(float a, float b){
        return a-b;
    }



}