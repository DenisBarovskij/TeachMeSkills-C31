package Lesson_6;

import java.util.Scanner;

public class CreditCard {


    private String accountNumber;
    private double currentBalance;

    public CreditCard(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Сумма " + amount + " успешно начислена на карточку.");
        } else {
            System.out.println("Некорректная сумма для начисления.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
            System.out.println("Сумма " + amount + " успешно снята с карточки.");
        } else {
            System.out.println("Недостаточно средств на карточке.");
        }
    }

    public void displayInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Текущий баланс: " + currentBalance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем три объекта класса CreditCard с начальными балансами
        CreditCard card1 = new CreditCard("123456789", 10000.0);
        CreditCard card2 = new CreditCard("987654321", 20000.0);
        CreditCard card3 = new CreditCard("777777777", 5000.0);

        // Пополняем первые две карточки
        System.out.print("Введите сумму для пополнения карточки 1: ");
        double deposit1 = scanner.nextDouble();
        card1.deposit(deposit1);

        System.out.print("Введите сумму для пополнения карточки 2: ");
        double deposit2 = scanner.nextDouble();
        card2.deposit(deposit2);

        // Снимаем с третьей карточки
        System.out.print("Введите сумму для снятия с карточки 3: ");
        double withdraw3 = scanner.nextDouble();
        card3.withdraw(withdraw3);

        // Выводим информацию о всех карточках
        System.out.println("----------------------------------------");
        System.out.println("Состояние карточек после операций:");
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}