package Lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        getTask1();
        getTask2();
        getTask3();
        getTask4();
        getTask5();
        getTask6();
    }

    public static void getTask1() {
        // Создаем сканер для ввода данных с консоли
        Scanner entry = new Scanner(System.in);
        // Запрашиваем у пользователя размер массива
        System.out.println("Введите размер необходимого Вам массива: ");
        int size = entry.nextInt();
        // Создаем массив указанного размера
        int[] arr = new int[size];
        // Заполняем массив элементами, введенными пользователем
        System.out.println("Введите " + size + " элементов массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = entry.nextInt();
        }
        // Выводим элементы массива в прямом порядке
        System.out.println("Элементы массива в порядке ввода:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Элементы массива в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Элементы массива по возрастанию:");

        {
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void getTask2() {
        // Создаем сканер для ввода данных с консоли
        Scanner entry = new Scanner(System.in);

        System.out.println("Введите размер необходимого Вам массива: ");
        // Запрашиваем у пользователя размер массива
        int[] size = new int[entry.nextInt()];
        //Здесь мы задаем min , как минимально возможное число
        // а max - как максимально возможное число
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Заполняем массив элементами, введенными пользователем
        System.out.println("Введите " + size.length + " элементов массива:");
        for (int i = 0; i < size.length; i++) {
            System.out.print("Введите элемент массива " + (i + 1) + ": ");
            size[i] = entry.nextInt();
            min = Math.min(min, size[i]);
            max = Math.max(max, size[i]);
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println();
    }

    public static void getTask3() {
        // Создаем сканер для ввода данных с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        double[] array = new double[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        int indexOfMin = findIndexOfMin(array);
        int indexOfMax = findIndexOfMax(array);

        System.out.println("Индекс минимального элемента: " + indexOfMin);
        System.out.println("Индекс максимального элемента: " + indexOfMax);
    }

    public static int findIndexOfMin(double[] array) {
        double min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int findIndexOfMax(double[] array) {
        double max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void getTask4() {
        // Создаем сканер для ввода данных с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();// Размер массива
        int[] array = new int[n];

        // Ввод элементов массива
        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        // Подсчет нулевых элементов
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount > 0) {
            System.out.println("Количество нулевых элементов: " + zeroCount);
        } else {
            System.out.println("Нулевых элементов нет.");
        }
    }

    public static void getTask5() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Проходим по массиву и меняем местами элементы
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }

        System.out.println("Массив после замены:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void getTask6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        boolean isAscending = true;
        for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("Массив является возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является возрастающей последовательностью.");
        }
    }
}
