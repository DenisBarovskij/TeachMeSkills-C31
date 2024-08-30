package Lesson_8;

public abstract class Animal {
    public abstract String voice();
    public abstract String eat(String food);

    public static void main (String[] args) {
        Animal dog = new Dog();
        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");
        System.out.println();

        Animal tiger = new Tiger();
        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Grass");
        System.out.println();

        Animal rabbit = new Rabbit();
        rabbit.voice();
        rabbit.eat("Meat");
        rabbit.eat("Grass");
        System.out.println();
    }
}
