package Lesson_17.task_5;


import java.util.function.Supplier;

import static Lesson_17.task_1.YearsCalculator.getScaner;

public class ReverseString {
    public static void Task5 () {


        // Supplier для получения строки с консоли и её реверса
        Supplier<String> reverseStringSupplier = () -> {
            System.out.println("Введите строку:");
            String input = getScaner().nextLine();
            return new StringBuilder(input).reverse().toString();
        };

        // Использование Supplier для вывода реверсированной строки
        String reversedString = reverseStringSupplier.get();
        System.out.println("Реверсированная строка: " + reversedString);
    }
}

