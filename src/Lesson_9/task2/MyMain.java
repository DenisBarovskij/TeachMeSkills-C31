package Lesson_9.task2;

public class MyMain {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(5, 6, 7),
                new Rectangle(11, 12),
                new Circle(15),
                new Triangle(2, 3, 2),
                new Rectangle(5, 6),
        };
        double result = 0;
        for (Figure figure : figures) {
            result += figure.calculatePerimetr();
        }
        System.out.println("Sum perimeters figures: " + result);
    }
}
