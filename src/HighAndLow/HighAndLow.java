package HighAndLow;

import java.util.Arrays;

public class HighAndLow {
    private String input;
    private int[] output = new int[2];

    HighAndLow(String input) {
        this.input = input;
        this.calcHighAndLow(input);
    }

    private int[] calcHighAndLow(String input) {
        String[] numbers = input.split(" ");
        final int INPUT_LENGTH = numbers.length;
        int[] numbersToInt = new int[INPUT_LENGTH];

        for (int i = 0; i < INPUT_LENGTH; i++) {
            numbersToInt[i] = Integer.parseInt(numbers[i]);
        }

        int highestInt = Arrays.stream(numbersToInt).max().getAsInt();
        int lowestInt = Arrays.stream(numbersToInt).min().getAsInt();

        output[0] = highestInt;
        output[1] = lowestInt;

        return output;
    }

    public int getHighestInt() {
        return output[0];
    }

    public int getLowestInt() {
        return output[1];
    }
}
