package Lesson_8;

public class Tiger extends Animal {

    @Override
    public String voice() {
        System.out.println("Tiger say: Rrrrr!!!");
        return "";
    }

    @Override
    public String eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Tiger loves to eat meat");
        } else {
            System.out.println("Tiger doesn't like " + food + ".");
        }
        return food;
    }
}