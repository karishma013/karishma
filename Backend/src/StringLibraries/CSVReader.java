package Backend.src.StringLibraries;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    class Student implements Comparable<Student> {
        private String firstName;
        private String lastName;
        private double gpa;

        public Student(String firstName, String lastName, double gpa) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gpa = gpa;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public int compareTo(Student other) {
            return this.lastName.compareTo(other.getLastName());
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", gpa=" + gpa +
                    '}';
        }
    }

    public class CSVReader {
        public static void main(String[] args) {
            String csvFile = "C:\\Users\\karis\\OneDrive\\Desktop\\JAVA_BACKEND\\Backend\\src\\Assignment7\\studentCsv.csv";

            List<Student> students = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    String firstName = data[0].trim();
                    String lastName = data[1].trim();
                    double gpa = Double.parseDouble(data[2].trim());

                    Student student = new Student(firstName, lastName, gpa);
                    students.add(student);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            Collections.sort(students);

            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

