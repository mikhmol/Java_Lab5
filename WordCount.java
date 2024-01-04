import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class WordCount {
        public static void processText(List<Sentence> sentences, String[] words) throws IllegalArgumentException {
        try {
            if (sentences == null || words == null || words.length == 0) {
                throw new IllegalArgumentException("Невірні вхідні дані");
            }

            Map<String, Integer> wordCountMap = new HashMap<>();

            for (Sentence sentence : sentences) {
                for (String word : words) {
                    int wordCountInSentence = countWordInSentence(sentence, word);
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + wordCountInSentence);
                }
            }

            System.out.println("Результати підрахунку:");
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                System.out.println("Слово \"" + entry.getKey() + "\": " + entry.getValue() + " входжень");
            }

        } catch (Exception e) {
            throw new IllegalArgumentException("Помилка обробки тексту: " + e.getMessage());
        }
    }
    private static int countWordInSentence(Sentence sentence, String word) {
        int count = 0;
        for (Word sentenceWord : sentence.getWordsList()) {
            if (sentenceWord.getWordAsString().equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
}