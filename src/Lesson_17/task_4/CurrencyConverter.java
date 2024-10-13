package Lesson_17.task_4;

import java.util.function.Consumer;

import static Lesson_17.task_1.YearsCalculator.getScaner;

public class CurrencyConverter {
    public static void Task4() {
        Consumer<String> convertAndPrint = bynString -> {
            String[] parts = bynString.split(" ");
            double amountBYN = Double.parseDouble(parts[0]);
            double exchangeRate = 0.3058; // Текущий курс BYN к USD
            double amountUSD = amountBYN * exchangeRate;
            System.out.println(amountBYN + " BYN -> " + amountUSD + " USD");
        };

        // Ввод суммы через Scanner
        System.out.println("Введите сумму в BYN (например, '100 BYN'):");
        String input = getScaner().nextLine();
        convertAndPrint.accept(input);
    }
}