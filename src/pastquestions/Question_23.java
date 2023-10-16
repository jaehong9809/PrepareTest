package pastquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] student = br.readLine().split(" ");
            String name = student[0];
            int korean = Integer.parseInt(student[1]);
            int english = Integer.parseInt(student[2]);
            int math = Integer.parseInt(student[3]);

            students.add(new Student(name, korean, english, math));
        }
        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.name);
        }
    }

    static class Student implements Comparable<Student> {
        String name;
        int korea;
        int english;
        int math;

        public Student(String name, int korea, int english, int math) {
            this.name = name;
            this.korea = korea;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(Student o) {
            if (o.korea == this.korea) {
                if (o.english == this.english) {
                    if (o.math == this.math) {
                        return this.name.compareTo(o.name);
                    }
                    return o.math - this.math;
                }
                return this.english - o.english;
            }
            return o.korea - this.korea;
        }
    }

}
