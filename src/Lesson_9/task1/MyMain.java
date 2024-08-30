package Lesson_9.task1;

public class MyMain {
    public static void main(String[] args) {
        Position director = new Director();
        Position worker = new Worker();
        Position accountant = new Accountant();

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }



}
