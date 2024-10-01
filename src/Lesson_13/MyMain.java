package Lesson_13;

import java.util.Scanner;

import static Lesson_13.UserValidator.validate;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        System.out.print("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();

        try {
            boolean result = validate(login, password, confirmPassword);
            System.out.println("Validation result: " + result);
        } catch (UserValidator.WrongLoginException | UserValidator.WrongPasswordException e) {
            System.out.println("Validation error: " + e.getMessage());
        }

        scanner.close();
    }
}

