package Lesson_8;

public class Dog extends Animal {

    @Override
    public String voice() {
        System.out.println("Dog says: Gaw, Gaw!!!");
        return "";
    }

    @Override
    public String eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Dog loves to eat meat.");
        } else {
            System.out.println("Dog doesn't like " + food + ".");
        }
        return food;
    }


}
