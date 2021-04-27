package BraceChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sequence of \"(){}[]\" symbols: ");
        String input = scanner.nextLine();
        BraceChecker braceChecker = new BraceChecker(input);
        scanner.close();

        System.out.println("\"" + input + "\" -> " + braceChecker.getOutput());
    }
}
