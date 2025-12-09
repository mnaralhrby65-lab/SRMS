package srms;

import java.util.Scanner;

public class Main {
    
    private static StudentManagement studentManager = new StudentManagement();
    private static Scanner scanner = new Scanner(System.in);

    private static void addNewStudent() {
        System.out.println("\n--- Enter New Student Details ---");
        
        Department csDept = new Department("CS", "Computer Science"); 

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        
        int year = 0;
        double gpa = 0.0;
        
        boolean inputValid = false;
        while (!inputValid) {
            try {
                System.out.print("Enter Academic Year: ");
                year = scanner.nextInt();
                inputValid = true; 
            } catch (java.util.InputMismatchException e) {
                System.out.println("⚠️ Error: Please enter a valid integer for the Academic Year.");
                scanner.nextLine(); 
            }
        }
        
        inputValid = false; 
        scanner.nextLine();

        while (!inputValid) {
            System.out.print("Enter GPA: ");
            String gpaInput = scanner.nextLine();
            
            gpaInput = gpaInput.replace(',', '.'); 
            
            try {
                gpa = Double.parseDouble(gpaInput); 
                inputValid = true;
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Error: Please enter a valid decimal number for the GPA (e.g., 3.5 or 3,5).");
            }
        }

        Student newStudent = new Student(name, id, csDept, year, gpa);
        studentManager.addStudent(newStudent);
    }
    
    private static void displayMenu() {
        System.out.println("\n===== Student Management System =====");
        System.out.println("1. Add New Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Exit");
        System.out.println("=====================================");
        System.out.print("Please enter the function number: ");
    }

    public static void main(String[] args) {
        
        boolean running = true;
        while (running) {
            displayMenu();
            
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        addNewStudent(); 
                        break;
                    case 2:
                        studentManager.displayAllStudents(); 
                        break;
                    case 3:
                        running = false;
                        System.out.println("Thank you for using the system. Goodbye!");
                        break;
                    default:
                        System.out.println("❌ Invalid choice. Please enter a number from 1 to 3.");
                }
            } else {
                System.out.println("❌ Invalid input. Please enter a number.");
                scanner.nextLine(); 
            }
        }
        scanner.close();
    }
}