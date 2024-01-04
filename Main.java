import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            StringBuffer inputText = new StringBuffer("Boys next door. Three Bucks hundred bucks is three hundred bucks. Boy. Boyfriend come here. Boy. Boyfriend. Three bucks.");
            String[] words = {"Boy", "Three", "bucks"};

            Text text = new Text(inputText);

            List<Sentence> sentences = text.getSentences();

            WordCount.processText(sentences, words);
        } catch (Exception e) {
            System.out.println("Виникла помилка: " + e.getMessage());
        }
    }
}
