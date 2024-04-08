package co.com.sofka;


import co.com.sofka.model.Course;
import co.com.sofka.model.Student;

import java.util.ArrayList;
import java.util.List;


import static co.com.sofka.model.Course.generateXCourses;
import static co.com.sofka.model.Student.generateXStudents;

public class Main {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        generateXStudents(students, 20);
        generateXCourses(courses, 5);

        
//        System.out.println(courses);
//        System.out.println(students);
    }






}