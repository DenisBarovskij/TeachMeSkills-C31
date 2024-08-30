package Lesson_8;

public class Rabbit extends Animal {
    @Override
    public String voice() {
        System.out.println("Rabbit say: squeak!!!");
        return "";
    }

    @Override
    public String eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Rabbit loves to eat Grass");
        } else {
            System.out.println("Rabbit doesn't like " + food + ".");
        } return (food);
    }
}