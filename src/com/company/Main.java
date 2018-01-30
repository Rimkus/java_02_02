package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite savo varda");
        Scanner scanner = new Scanner(System.in);
        String vardas = scanner.nextLine();
        System.out.println("jusu vardas turi simboliu:" + vardas.length());
	// wsrite your code here
    }
}
