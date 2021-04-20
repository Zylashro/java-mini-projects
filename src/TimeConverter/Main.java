package TimeConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter seconds to convert:");
        int seconds = scanner.nextInt();
        TimeConverter timeConverter = new TimeConverter(seconds);
        scanner.close();

        System.out.println(
                seconds + " --> " +
                timeConverter.getHours() + " hour(s) and " +
                timeConverter.getMinutes() + " minute(s)."
        );

    }
}
