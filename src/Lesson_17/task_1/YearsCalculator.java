package Lesson_17.task_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class YearsCalculator {
    public static Scanner getScaner() {
        return new Scanner(System.in);
    }

    public static void Task1() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Введите дату своего рождения (дд-ММ-гггг): ");
        String birthDateString = getScaner().nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateString, formatter);
        LocalDate hundredYearsDate = birthDate.plusYears(100);

        System.out.println("Вам исполнится 100 лет: " + hundredYearsDate.format(formatter));
    }
}

