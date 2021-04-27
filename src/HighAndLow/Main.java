package HighAndLow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a series of numbers separated by spaces: ");
        String input = scanner.nextLine();
        HighAndLow highAndLow = new HighAndLow(input);
        scanner.close();

        System.out.println(highAndLow.getHighestInt() + " " + highAndLow.getLowestInt());
    }
}
