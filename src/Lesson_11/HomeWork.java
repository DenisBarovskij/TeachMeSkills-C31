package Lesson_11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void task1() {
        System.out.println("Введите первую строку:");
        String str1 = getScanner().nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = getScanner().nextLine();
        System.out.println("Введите третью строку:");
        String str3 = getScanner().nextLine();

        String shortest = str1;
        String longest = str1;

        if (str2.length() < shortest.length()) {
            shortest = str2;
        }
        if (str3.length() < shortest.length()) {
            shortest = str3;
        }

        if (str2.length() > longest.length()) {
            longest = str2;
        }
        if (str3.length() > longest.length()) {
            longest = str3;
        }

        System.out.println("Самая короткая строка: \"" + shortest + "\", длина: " + shortest.length());
        System.out.println("Самая длинная строка: \"" + longest + "\", длина: " + longest.length());
    }

    public static void task2() {
        System.out.println("Введите первую строку:");
        String str1 = getScanner().nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = getScanner().nextLine();
        System.out.println("Введите третью строку:");
        String str3 = getScanner().nextLine();

        String[] strings = {str1, str2, str3};
        Arrays.sort(strings, Comparator.comparingInt(String::length));

        System.out.println("Строки в порядке возрастания длины:");
        for (String str : strings) {
            System.out.println(str + " (длина: " + str.length() + ")");
        }
    }

    public static void task3() {
        System.out.println("Введите первую строку:");
        String str1 = getScanner().nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = getScanner().nextLine();
        System.out.println("Введите третью строку:");
        String str3 = getScanner().nextLine();

        int totalLength = str1.length() + str2.length() + str3.length();
        double averageLength = totalLength / 3.0;

        System.out.println("Строки, длина которых меньше средней (" + averageLength + "):");
        if (str1.length() < averageLength) {
            System.out.println(str1 + " (длина: " + str1.length() + ")");
        }
        if (str2.length() < averageLength) {
            System.out.println(str2 + " (длина: " + str2.length() + ")");
        }
        if (str3.length() < averageLength) {
            System.out.println(str3 + " (длина: " + str3.length() + ")");
        }
    }

    public static void task4() {
        System.out.println("Введите первое слово:");
        String wrd1 = getScanner().nextLine();
        System.out.println("Введите второе слово:");
        String wrd2 = getScanner().nextLine();
        System.out.println("Введите третье слово:");
        String wrd3 = getScanner().nextLine();

        String[] word = {wrd1, wrd2, wrd3};

        for (String wrd : word) {
            if (hasAllUniqueCharacters(wrd)) {
                System.out.println("Словом состоящим только из различных символов является: " + wrd);
                return;
            }
        }

        System.out.println("Нет слов, состоящих только из различных символов.");
    }

    private static boolean hasAllUniqueCharacters(String wrd) {
        boolean[] charSet = new boolean[1252];
        for (int i = 0; i < wrd.length(); i++) {
            char c = wrd.charAt(i);
            if (charSet[c]) {
                return false;
            }
            charSet[c] = true;
        }
        return true;
    }

    public static void task5() {
        System.out.println("Введите слово: ");
        String input = getScanner().nextLine();
        StringBuilder doubledString = new StringBuilder();
        for (char c : input.toCharArray()) {
            doubledString.append(c).append(c);
        }

        System.out.println("Новое слово: " + doubledString.toString());
    }
}
