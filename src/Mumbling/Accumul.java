package Mumbling;

import java.util.Locale;

public class Accumul {
    private String input;
    private String[] outputString;

    Accumul(String input) {
        this.input = input;
        this.toAccum(input);
    }

    private void toAccum(String input) {
        outputString = new String[input.length()];
        final int INPUT_LENGTH = input.length();

        for (int i = 0; i < INPUT_LENGTH; i++) {
            char currentChar = input.charAt(i);

            String initialChar = Character.toString(currentChar).toUpperCase();

            String otherChars = Character.toString(currentChar).toLowerCase().repeat(i);

            outputString[i] = initialChar.concat(otherChars);
        }
    }

    public String getOutput() {
        String output = "";
        final int OUTPUT_LENGTH = outputString.length;

        for (int i = 0; i < OUTPUT_LENGTH; i++) {
            output += outputString[i] + "-";
        }

        // We make use of the substring method to remove the last "-" at the end of the output
        output = output.substring(0, (output.length() - 1));

        return output;
    }
}
