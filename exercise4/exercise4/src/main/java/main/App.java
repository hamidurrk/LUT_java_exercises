package main;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class App {
    private static University university = new University();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = readIntInput("");
            switch (choice) {
                case 1: addStudent(); break;
                case 2: listStudents(); break;
                case 3: addCourseCompletion(); break;
                case 4: listCourseCompletions(); break;
                case 5: calculateAverage(); break;
                case 6: calculateMedian(); break;
                case 7: saveStudents(); break;
                case 8: loadStudents(); break;
                case 0: exit(); return;
                default: System.out.println("Invalid option.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("1) Add student, 2) List students, 3) Add course completion for student, 4) " +
                "List course completions of student, 5) Calculate the average of course completions, " +
                "6) Calculate median of course completions, 7) Save students to file, 8) Load students from file, 0) End the program");
    }

    private static int readIntInput(String prompt ) {
        while (true) {
            if (prompt != null && !prompt.isEmpty()) {
                System.out.print(prompt+"\n");
            }
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    private static void addStudent() {
        System.out.println("What is the name of the student?");
        String name = scanner.nextLine();
        System.out.println("What is the student number of the student?");
        String number = scanner.nextLine();
        university.addStudent(new Student(name, number));
    }

    private static void listStudents() {
        List<Student> students = university.getStudents();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(i + ": " + s.getStudentNumber() + ": " + s.getName());
        }
    }

    private static void addCourseCompletion() {
        listStudents();
        int index = readIntInput("Which student?");
        List<Student> students = university.getStudents();
        if (invalidIndex(index, students.size())) return;
        
        Student student = students.get(index);
        System.out.println("What is the name of the course?");
        String course = scanner.nextLine();
        int grade = readIntInput("What is the grade of the course?");
        student.addGrade(course, grade);
    }

    private static void listCourseCompletions() {
        listStudents();
        int index = readIntInput("Which student?");
        List<Student> students = university.getStudents();
        if (invalidIndex(index, students.size())) return;
        
        Student student = students.get(index);
        for (Grade grade : student.getGrades()) {
            System.out.println(grade.getCourse() + ": " + grade.getGrade());
        }
    }

    private static void calculateAverage() {
        listStudents();
        int index = readIntInput("Which student?");
        List<Student> students = university.getStudents();
        if (invalidIndex(index, students.size())) return;
        
        double avg = Calculator.getAverageGrade(students.get(index));
        System.out.println("Average is " + avg);
    }

    private static void calculateMedian() {
        listStudents();
        int index = readIntInput("Which student?");
        List<Student> students = university.getStudents();
        if (invalidIndex(index, students.size())) return;
        
        double median = Calculator.getMedianGrade(students.get(index));
        System.out.println("Median is " + median);
    }

    private static void saveStudents() {
        try {
            university.saveStudents();
            System.out.println("Students saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    private static void loadStudents() {
        try {
            university.loadStudents();
            System.out.println("Students loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading students: " + e.getMessage());
        }
    }

    private static boolean invalidIndex(int index, int size) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid student index.");
            return true;
        }
        return false;
    }

    private static void exit() {
        System.out.println("Thank you for using the program.");
        scanner.close();
    }
}