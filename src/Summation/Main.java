package Summation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        Summation summation = new Summation(input);
        scanner.close();

        System.out.println("Summation(" + input + ") -> " + summation.getOutput());
    }
}
