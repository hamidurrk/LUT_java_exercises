package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    public static double getAverageGrade(Student student) {
        List<Grade> grades = student.getGrades();
        if (grades.isEmpty()) return 0.0;
        
        int sum = 0;
        for (Grade grade : grades) sum += grade.getGrade();
        return (double) sum / grades.size();
    }

    public static double getMedianGrade(Student student) {
        List<Grade> grades = student.getGrades();
        if (grades.isEmpty()) return 0.0;
        
        List<Integer> sortedGrades = new ArrayList<>();
        for (Grade grade : grades) sortedGrades.add(grade.getGrade());
        Collections.sort(sortedGrades);

        int size = sortedGrades.size();
        if (size % 2 == 1) {
            return sortedGrades.get(size / 2);
        } else {
            int mid = size / 2;
            return (sortedGrades.get(mid - 1) + sortedGrades.get(mid)) / 2.0;
        }
    }
}
