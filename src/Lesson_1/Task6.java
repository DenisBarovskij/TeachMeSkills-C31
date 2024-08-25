package Lesson_1;

public class Task6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        b = (b + a) - b;
        a = (a + b + b) - a;
        System.out.println("Теперь а = " + a);
        System.out.println(" b = " + b);
    }
}
