package Lesson_7.Doctors;

public class Dentist extends Doctor {


    @Override
    public void heal() {
        // Реализация лечения дантиста
        System.out.println("Дантист лечит пациента.");
    }
}