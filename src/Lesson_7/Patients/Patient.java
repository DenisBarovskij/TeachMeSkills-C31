package Lesson_7.Patients;

import Lesson_7.Doctors.Dentist;
import Lesson_7.Doctors.Doctor;
import Lesson_7.Doctors.Surgeon;
import Lesson_7.Doctors.Therapist;

import java.util.Scanner;

public class Patient {
    Scanner scanner = new Scanner(System.in);
    int treatmentPlan = scanner.nextInt(); // Код плана лечения
    Doctor assignedDoctor; // Ссылка на врач

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void assignDoctor() {
        if (treatmentPlan == 1) {
            assignedDoctor = new Surgeon();
        } else if (treatmentPlan == 2) {
            assignedDoctor = new Dentist();
        } else {
            assignedDoctor = new Therapist();
        }
    }

    public void performTreatment() {
        assignedDoctor.heal();
    }
}