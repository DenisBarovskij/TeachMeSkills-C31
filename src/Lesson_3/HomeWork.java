package Lesson_3;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        getTask1();
        getTask2();
        getTask3();
        getTask4();
        getTask5();

    }

    public static void getTask1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " - четное число.");
        } else {
            System.out.println(num + " - нечетное число.");
        }
    }

    public static void getTask2() {
        Scanner temp = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int temperature = temp.nextInt();
        if (temperature > -5) {
            System.out.println("Warm");
        } else if (temperature > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }

    public static void getTask3() {
        for (int a = 10; a <= 20; a++) {
            int square = a * a;
            System.out.println("Квадрат числа " + a + " равен " + square);
            if (a == 20) {
                break;
            }
        }
    }

    public static void getTask4() {
        int value = 7;
        while (true) {
            if (value >= 99) {
                break;
            }
            System.out.println("Необходимое число: " + value);
            value = value + 7;
        }
    }
    public static void getTask5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите любое число от 1 для выведения их суммы:");
        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            if (number > 0) {
                int sum = 0;
                for (int i = 1; i <= number; i++) {
                    sum = sum + i;
                }
                System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
            }
        }
    }}




