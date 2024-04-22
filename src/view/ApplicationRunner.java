package view;

import main_logic.InputReader;
import main_logic.util.Countable;
import main_logic.util.WordCounter;
import storage.OutputWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplicationRunner {

    public static void run() {
        String fileName = "input.txt";
        InputReader inputReader = new InputReader();
        List<String> words = inputReader.readInputText(fileName);

        Countable wordCounter = new WordCounter();

        int totalWords = wordCounter.countTotalWords(words);
        String longestWord = wordCounter.findLongestWord(words);
        Map<String, Integer> wordFrequency = wordCounter.calcWordFrequency(words);

        UserPresenter userPresenter = new UserPresenter();
        userPresenter.presentResults(totalWords, longestWord, wordFrequency);

        OutputWriter outputWriter = new OutputWriter();
        outputWriter.writeResults("output.txt", totalWords, longestWord, wordFrequency);

    }
}
