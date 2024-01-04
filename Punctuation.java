public class Punctuation {

    private static final String PUNCTUATION_CHARACTERS = ";/?,:";

    public static String removePunctuationCharacters(String input) {
        return input.replaceAll("[" + PUNCTUATION_CHARACTERS + "]", "");
    }
}
