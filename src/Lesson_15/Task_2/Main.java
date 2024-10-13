package Lesson_15.Task_2;

public class Main {
    public static void main(String[] args) {
        AnimalCollection animalCollection = new AnimalCollection();

        // Добавление животных
        animalCollection.addAnimal("Лев");
        animalCollection.addAnimal("Тигр");
        animalCollection.addAnimal("Медведь");

        // Отображение коллекции
        animalCollection.displayAnimals();

        // Удаление животного
        System.out.println("Удалено животное: " + animalCollection.removeAnimal());

        // Отображение коллекции после удаления
        animalCollection.displayAnimals();
    }
}
