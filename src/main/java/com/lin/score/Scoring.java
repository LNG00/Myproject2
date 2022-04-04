package com.lin.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rita",75,95));
        students.add(new Student("Joanna",80,65));
        students.add(new GraduateStudent("Nana",85,70,75));
        students.add(new GraduateStudent("Selina",75,85,70));


        for (Student s:students
             ) {
            s.print();
        }
    }
}
