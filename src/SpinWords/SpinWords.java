package SpinWords;

public class SpinWords {

    private String input;
    private String reversedWord;
    private String[] output;

    SpinWords(String input) {
        this.input = input;
        this.spinWords(input);
    }

    private void spinWords(String input) {
        String[] words = input.split(" ");
        output = new String[words.length];

        /*
        * Loops over each individual word in the array, if a word
        * is five characters long or greater, then we reverse the
        * word and replace the old word with the new reversed one.
        * If the word is below five characters, then we just save it
        * as is into the output array.
        */
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                reversedWord = new StringBuilder(words[i]).reverse().toString();
                output[i] = reversedWord;
            } else {
                output[i] = words[i];
            }
        }
    }

    public String getOutput() {
        /*
         * Loop over the output array and concat each word
         * back into a string which we'll display back to the user.
         */
        String outputString = "";
        for (int i = 0; i < output.length; i++) {
            outputString = outputString + " " + output[i];
        }
        return outputString;
    }
}
