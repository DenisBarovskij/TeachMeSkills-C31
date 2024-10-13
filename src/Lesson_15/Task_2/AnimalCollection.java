package Lesson_15.Task_2;

import java.util.LinkedList;

class AnimalCollection {
    private LinkedList<String> animals;

    public AnimalCollection() {
        animals = new LinkedList<>();
    }

    // Метод для добавления животного в начало коллекции
    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    // Метод для удаления животного с конца коллекции
    public String removeAnimal() {
        if (!animals.isEmpty()) {
            return animals.removeLast();
        } else {
            return "Коллекция пуста";
        }
    }

    // Метод для отображения всех животных в коллекции
    public void displayAnimals() {
        System.out.println("Животные в коллекции: " + animals);
    }
}

