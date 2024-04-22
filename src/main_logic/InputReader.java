package main_logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReader {

    public List<String> readInputText(String fileName) {
        List<String> words = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: файл, который вы пытаетесь прочесть не найден.");
        }
        return words;
    }
}
