package Lesson_5;

import java.util.Random;
import java.util.Scanner;

/*1.1 Создать двумерный массив, заполнить его случайными числами.
1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
1.3 Найти сумму всех получившихся элементов и вывести в консоль.*/
public class HomeWork4 {
    public static void main(String[] args) {
        getTask1();
        getTask2();
        getTaskStar();

    }

    public static void getTask1() {

        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[5][5];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = random.nextInt(100);
                // 1.1 Заполняем случайным числом от 0 до 99
            }
        }
        // 1.2 Вводим числа с консоли и добавляем их к каждому значению

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Введите число для [" + i + "][" + j + "]: ");
                int userInput = getScanner().nextInt();
                array[i][j] += userInput;
                sum += array[i][j]; // Добавляем значение к сумме

                // Выводим массив на экран
                for (int[] row : array) {
                    for (int num : row) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            }
        }
        // 1.3 Выводим сумму в консоль
        System.out.println("Сумма всех элементов: " + sum);
    }

    /*Создать программу для раскраски шахматной доски с помощью цикла. Создать
    двумерный массив String 8х8. С помощью циклов задать элементам массива значения
    B(Black) или W(White).*/
    public static void getTask2() {
        String[][] chessboard = new String[8][8];
        // Заполняем массив значениями B (Black) и W (White)
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    chessboard[row][col] = "B";
                } else {
                    chessboard[row][col] = "W";
                }
            }
        }
        // Выводим шахматную доску на экран
        for (String[] row : chessboard) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    public static void getTaskStar () {
        System.out.println("Задайте размер массива по строкам: ");
        int n = getScanner().nextInt();
        System.out.println("Задайте размер массива по столбцам: ");
        int m = getScanner().nextInt();
        int[][] arr = new int[n][m];
        int value = 1;
        //Проходим по строкам массива. Если номер строки четный, заполняем значения слева направо.
        //Если нечетный, заполняем справа налево.
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = value++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    arr[i][j] = value++;
                }
            }
        }
        //выведем полученный массив, отводя на вывод каждого числа ровно 3 символа:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }
    public static Scanner getScanner () {
        return new Scanner(System.in);
    }

}




