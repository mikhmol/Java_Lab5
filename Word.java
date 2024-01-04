import java.util.ArrayList;
import java.util.List;

public class Word {
    private List<Letter> letters;

    public String getWordAsString() {
        StringBuffer processedWord = new StringBuffer();
        for (Letter letter : letters) {
            processedWord.append(letter.getLetter());
        }
        return processedWord.toString();
    }

    public Word(StringBuffer word) {
        this.letters = new ArrayList<>();
        processWord(word);
    }

    private void processWord(StringBuffer word) {
        String processedWord = word.toString();

        char[] charArray = processedWord.toCharArray();

        for (char character : charArray) {
            letters.add(new Letter(character));
        }
    }
}
