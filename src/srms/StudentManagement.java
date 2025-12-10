package srms;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    
    private List<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
        System.out.println(" Student: " + student.getName() + " added successfully.");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("️ No students currently registered.");
            return;
        }

        System.out.println("\n--- Registered Students List ---");
        for (Student student : students) {
            System.out.println(student); 
        }
        System.out.println("--------------------------------\n");
    }
}