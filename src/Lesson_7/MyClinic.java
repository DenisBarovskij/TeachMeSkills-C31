package Lesson_7;

import Lesson_7.Patients.Patient;

public class MyClinic {
    public static void main (String[] arg){
        System.out.println("Выберите план лечения: ");
        Patient patient = new Patient(3); // Создаем пациента с планом лечения
        // Назначаем врача пациенту
        patient.assignDoctor();
        // Выполняем лечение
        patient.performTreatment();
    }
}
