package Lesson_10;

public class MyMain {
    public static void main(String[] args) {
        User user1 = new User("Alina", 28, "Minsk");
        User user2 = new User("Alina", 28, "Minsk");
        User user3 = new User("Vova", 26, "Grodno");

        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
        System.out.println("user3: " + user3);

        System.out.println("user1 equals user2: " + user1.equals(user2));
        System.out.println("user1 equals user3: " + user1.equals(user3));
    }
}
