package main_logic.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter implements Countable {

    @Override
    public int countTotalWords(List<String> words) {
        return words.size();
    }

    @Override
    public String findLongestWord(List<String> words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    @Override
    public Map<String, Integer> calcWordFrequency(List<String> words) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String word : words) {
            resultMap.put(word, resultMap.getOrDefault(word, 0) + 1);
        }
        return resultMap;
    }
}
