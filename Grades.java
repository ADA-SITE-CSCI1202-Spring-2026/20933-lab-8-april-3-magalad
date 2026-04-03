import java.util.HashMap;
import java.util.Map;

public class Grades {

    public static void main(String[] args) {

        // a) Create map
        Map<String, Double> students = new HashMap<>();

        // b) Add students
        students.put("Ali", 3.5);
        students.put("Nigar", 3.9);
        students.put("Murad", 2.8);
        students.put("Aysel", 3.9);
        students.put("Elvin", 2.5);

        // c) Find highest GPA
        double maxGPA = Double.MIN_VALUE;

        for (double gpa : students.values()) {
            if (gpa > maxGPA) {
                maxGPA = gpa;
            }
        }

        System.out.println("Highest GPA: " + maxGPA);

        System.out.println("Student(s) with highest GPA:");
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() == maxGPA) {
                System.out.println(entry.getKey());
            }
        }

        // d) Find average GPA
        double sum = 0;

        for (double gpa : students.values()) {
            sum += gpa;
        }

        double average = sum / students.size();
        System.out.println("Average GPA: " + average);

        // e) Count students below average
        int count = 0;

        for (double gpa : students.values()) {
            if (gpa < average) {
                count++;
            }
        }

        System.out.println("Students below average: " + count);
    }
}