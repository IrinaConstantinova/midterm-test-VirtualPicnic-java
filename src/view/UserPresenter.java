package view;

import java.util.Map;

public class UserPresenter {

    public void presentResults(int totalWords, String longestWord, Map<String, Integer> wordFrequency) {
        System.out.println("Общее количество слов в тексте: " + totalWords);
        System.out.println("Самое длинное слово: " + longestWord);
        System.out.println("Частота слов:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
