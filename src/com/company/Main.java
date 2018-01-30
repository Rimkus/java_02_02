package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite du skaicius");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("suma:" + suma(a,b));
        System.out.println("skirtumas:" + skirtumas(a,b));
	// wsrite your code here
    }
    public static int suma(int a, int b){
        return a+b;
    }
    public static int skirtumas(int a, int b){
        return a-b;
    }
}
