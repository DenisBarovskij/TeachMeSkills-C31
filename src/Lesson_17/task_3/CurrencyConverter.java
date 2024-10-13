package Lesson_17.task_3;

import java.util.function.Function;

import static Lesson_17.task_1.YearsCalculator.getScaner;

public class CurrencyConverter {
    public static void Task3() {
        Function<String, Double> convertToUSD = bynString -> {
            String[] parts = bynString.split(" ");
            double amountBYN = Double.parseDouble(parts[0]);
            double exchangeRate = 0.3058; // Текущий курс BYN к USD
            return amountBYN * exchangeRate;
        };
        System.out.println("Введите сумму в BYN (например, '100 BYN'):");
        String input = getScaner().nextLine();
        System.out.println("Сумма в USD: " + convertToUSD.apply(input));
    }
}
