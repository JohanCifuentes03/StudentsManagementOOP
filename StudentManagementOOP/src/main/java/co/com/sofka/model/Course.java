package co.com.sofka.model;

import com.github.javafaker.Faker;

import java.util.List;

public class Course {
    private String id;
    private String name;
    private List<Student> enrolledStudents;
    private List<Student> studentsInClass;

    public Course(){}

    public Course(String id, String name, List<Student> enrolledStudents, List<Student> studentsInClass) {
        this.id = id;
        this.name = name;
        this.enrolledStudents = enrolledStudents;
        this.studentsInClass = studentsInClass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public List<Student> getStudentsInClass() {
        return studentsInClass;
    }

    public void setStudentsInClass(List<Student> studentsInClass) {
        this.studentsInClass = studentsInClass;
    }

    public static Course createCourse(){
        Faker faker = new Faker();
        Course createdCourse = new Course();
        createdCourse.setId( faker.bothify("###"));
        createdCourse.setName(faker.funnyName().name());
        return createdCourse;
    }

    public static void generateXCourses(List<Course> courses, int X) {
        for (int i = 0; i < 10; i++) {
            courses.add(createCourse());
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", enrolledStudents=" + enrolledStudents +
                ", studentsInClass=" + studentsInClass +
                '}';
    }
}
