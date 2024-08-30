package Lesson_9.taskStar;

class MyClass implements Cloneable {
    int a;
    int b;

    // Конструктор
    MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Переопределение метода clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Метод для отображения значений
    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
