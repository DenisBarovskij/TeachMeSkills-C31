package Lesson_9.task2;

public class Rectangle extends Figure {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimetr() {
        return 2 * (length + width);
    }
}
