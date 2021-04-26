package Mumbling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        Accumul accumul = new Accumul(input);
        scanner.close();

        System.out.println("accum(\"" + input + "\") -> \"" + accumul.getOutput() + "\"");
    }
}
