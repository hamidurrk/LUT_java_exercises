package main;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Programming 101", 30);

        System.out.println("Course Information:");
        System.out.println("Name: " + course.getCourseName());
        System.out.println("Maximum students: " + course.getMaxStudents());

        Student student1 = new Student("John Smith", "S001");
        Student student2 = new Student("Alice Johnson", "S002");

        System.out.println("\nStudent Information:");
        System.out.println("Student 1 - Name: " + student1.getName() + ", ID: " + student1.getStudentId());
        System.out.println("Student 2 - Name: " + student2.getName() + ", ID: " + student2.getStudentId());
    }
}

