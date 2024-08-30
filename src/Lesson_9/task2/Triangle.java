package Lesson_9.task2;

public class Triangle extends Figure {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        return (a + b + c) / 2;
    }

    @Override
    double calculatePerimetr() {
        return a + b + c;
    }
}
