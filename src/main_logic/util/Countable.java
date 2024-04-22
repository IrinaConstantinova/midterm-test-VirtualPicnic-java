package main_logic.util;

import java.util.List;
import java.util.Map;

public interface Countable {

    int countTotalWords(List<String> words);

    String findLongestWord(List<String> words);

    Map<String, Integer> calcWordFrequency(List<String> words);
}
