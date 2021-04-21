package SpinWords;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a sentence or phrase: ");
        String input = scanner.nextLine();
        SpinWords spinWords = new SpinWords(input);
        scanner.close();

        System.out.println("\"" + input + "\"" + " => " + "\"" + spinWords.getOutput() + "\"");
    }
}
