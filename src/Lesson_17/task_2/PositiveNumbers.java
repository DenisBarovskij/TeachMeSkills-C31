package Lesson_17.task_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void Task2 () {
        List<Integer> numbers = Arrays.asList(-12, -15, 0, 6, 20, 35);

        // Создаем Predicate для проверки положительных чисел
        Predicate<Integer> isPositive = number -> number > 0;

        // Фильтруем положительные числа из списка
        List<Integer> positiveNumbers = numbers.stream()
                                               .filter(isPositive)
                                               .collect(Collectors.toList());

        // Выводим положительные числа
        System.out.println("Положительные числа: " + positiveNumbers);
    }
}
