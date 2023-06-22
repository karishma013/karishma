package Backend.src.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class printHashMap {
    public static void main(String[] args) {

        HashMap<String, Student> m = new HashMap<>();


        Student[] s = new Student[8];
        s[0] = new Student("John", "Doe", 3.8);
        s[1] = new Student("Alice", "Smith", 3.5);
        s[2] = new Student("Bob", "Johnson", 3.2);
        s[3] = new Student("Emma", "Davis", 3.9);
        s[4] = new Student("Michael", "Wilson", 3.6);
        s[5] = new Student("Sophia", "Brown", 3.4);
        s[6] = new Student("David", "Taylor", 3.1);
        s[7] = new Student("Olivia", "Anderson", 3.7);


        for (Student s1 : s) {
            m.put(s1.getFirstName(), s1);
        }
        System.out.println();
        System.out.println("using EntrySet");
        for (Map.Entry set:m.entrySet() ) {
            System.out.println("Key: "+set.getKey()+",       Value : "+set.getValue());
        }
        System.out.println();
        System.out.println("Using keySet:");
        for (String key : m.keySet()) {

            System.out.println("Key: " + key +",       Value : " + m.get(key));
        }
        System.out.println();
        System.out.println("Using iterator method:");
        Iterator<String> it = m.keySet().iterator();
        while (it.hasNext()) {
          String key=it.next();
          Student value=m.get(key);
            System.out.println("Key: " +key+ ",       Value : "+value );
        }
    }
}

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }


    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}