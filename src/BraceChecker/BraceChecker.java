package BraceChecker;

public class BraceChecker {
    private String input;
    private boolean output;

    BraceChecker(String input) {
        this.input = input;
        this.isValid(input);
    }

    private void isValid(String input) {
        if (input.contains("()") == true) {
            output = true;
        } else if (input.contains("[]") == true) {
            output = true;
        } else if (input.contains("{}") == true) {
            output = true;
        } else {
            output = false;
        }
    }

    public boolean getOutput() {
        return output;
    }
}
