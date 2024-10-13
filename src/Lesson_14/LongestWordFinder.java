package Lesson_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LongestWordFinder {

    public static void main(String[] args) {
        String inputFilePath = "src/Lesson_14/Romeo and Julietta (en).txt"; // Путь к файлу с текстом
        String outputFilePath = "src/Lesson_14/longest_word.txt"; // Путь к файлу для записи самого длинного слова

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             FileWriter writer = new FileWriter(outputFilePath)) {

            String longestWord = "";
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+"); // Разделение строки на слова

                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            writer.write("Самое длинное слово: " + longestWord);
            System.out.println("Самое длинное слово записано в файл: " + outputFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

