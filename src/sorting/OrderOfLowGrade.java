package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderOfLowGrade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputString = br.readLine().split(" ");
            students.add(new Student(inputString[0],Integer.parseInt(inputString[1])));
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getGrade()-o1.getGrade();
            }
        });
        for (Student student : students) {
            System.out.print(student.getName()+" ");
        }
    }
    static class Student{
        private String name;
        private Integer grade;

        public Student(String name, Integer grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public Integer getGrade() {
            return grade;
        }
    }
}
