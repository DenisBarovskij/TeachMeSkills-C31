package Lesson_9.taskStar;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

            MyClass obj1 = new MyClass(10, 20);
            MyClass obj2 = (MyClass) obj1.clone();

            System.out.println("Original object:");
            obj1.display();

            System.out.println("Cloned object:");
            obj2.display();

    }
}



