package Summation;

public class Summation {
    private int input;
    private int output;

    Summation(int input) {
        this.input = input;
        this.summation(input);
    }

    // Finds total summation of every number from 1 to input
    private void summation(int input) {
        for (int i = 0; i < input; i++) {
            output += (i + 1);
        }
    }

    public int getOutput() {
        return output;
    }
}
