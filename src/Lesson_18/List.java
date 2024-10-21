package Lesson_18;

import java.util.ArrayList;

public class List {
    // Создаем коллекцию ArrayList и наполняем ее элементами типа Integer
    public static void getArray () {
        java.util.List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        numbers.add(6);
        numbers.add(5);
        numbers.add(6);

        // Используем Stream для обработки коллекции
        int sum = numbers.stream()
                .distinct() // Удаляем дубликаты
                .filter(n -> n % 2 == 0) // Оставляем только четные элементы
                .mapToInt(Integer::intValue) // Преобразуем в IntStream
                .sum(); // Вычисляем сумму оставшихся элементов

        // Выводим результат
        System.out.println("Сумма четных уникальных элементов: " + sum);
    }
}
