package Lesson_15.Task_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите набор чисел через запятую: ");
        String input = scanner.nextLine();

        // Разделяем строку на элементы
        String[] numbers = input.split(",\\s*");

        // Используем Set для удаления повторяющихся элементов
        Set<String> uniqueNumbers = new HashSet<>();
        for (String number : numbers) {
            uniqueNumbers.add(number);
        }

        // Выводим результат
        System.out.println("Результат без повторяющихся элементов: " + String.join(", ", uniqueNumbers));

        scanner.close();
    }
}

