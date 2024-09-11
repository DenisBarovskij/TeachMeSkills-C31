package Lesson_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void task1() {
        System.out.println("Введите строку:");
        String input = getScanner().nextLine();
        // Регулярное выражение для поиска аббревиатур
        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(input);

        System.out.println("Найденные аббревиатуры:");
        while (matcher.find()) {
            String abbreviation = matcher.group();
            System.out.println(abbreviation + " (длина: " + abbreviation.length() + ")");
        }
    }
    public static void task2 (){
        System.out.println("Введите информацию:");
        String input = getScanner().nextLine();

        // Регулярные выражения для поиска информации
        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
        Pattern docPattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
        Pattern phonePattern = Pattern.compile("\\+\\(\\d{3}\\)-\\d{2}-\\d{7}");

        Matcher emailMatcher = emailPattern.matcher(input);
        Matcher docMatcher = docPattern.matcher(input);
        Matcher phoneMatcher = phonePattern.matcher(input);

        System.out.println("Найденная информация:");

        while (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
        }

        while (docMatcher.find()) {
            System.out.println("номер документа: " + docMatcher.group());
        }

        while (phoneMatcher.find()) {
            System.out.println("номер толефона: " + phoneMatcher.group());
        }
    }
}


