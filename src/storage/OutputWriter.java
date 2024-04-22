package storage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class OutputWriter {

    public void writeResults(String fileName, int totalWords, String longestWord, Map<String, Integer> wordFrequency) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Общее количество слов в тексте: " + totalWords + "\n");
            writer.write("Самое длинное слово: " + longestWord + "\n");
            writer.write("Частота слов:\n");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            writer.close();
            System.out.println("Результаты успешно записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл.");
        }
    }
}
