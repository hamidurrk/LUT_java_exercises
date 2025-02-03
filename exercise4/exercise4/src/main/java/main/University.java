package main;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class University implements Serializable {
    private static final String FILENAME = "students.dat";
    private List<Student> students;

    public University() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void saveStudents() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(students);
        }
    }

    @SuppressWarnings("unchecked")
    public void loadStudents() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            students = (List<Student>) ois.readObject();
        }
    }
}