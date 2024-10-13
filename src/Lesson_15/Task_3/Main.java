package Lesson_15.Task_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван Иванов", "Группа 1", 1, List.of(4, 3, 5)));
        students.add(new Student("Пётр Сидоренко", "Группа 1", 1, List.of(2, 3, 2)));
        students.add(new Student("Анна Пригожина", "Группа 2", 2, List.of(5, 5, 5)));

        removeAndAdvanceStudents(students);
        printStudents(students, 2);
    }

    public static void removeAndAdvanceStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.advanceCourse();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }
}
