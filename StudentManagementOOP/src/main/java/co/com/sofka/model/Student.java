package co.com.sofka.model;

import com.github.javafaker.Faker;

import java.util.Date;
import java.util.List;

public final class Student extends Person{
    private String semester;
    private List<Course> enrolledCourses;
    private Course currentClass;

    public Student(){}

    public Student(String id, String name, String lastName, Date birthday, String semester, List<Course> enrolledCourses, Course currentClass) {
        super(id, name, lastName, birthday);
        this.semester = semester;
        this.enrolledCourses = enrolledCourses;
        this.currentClass = currentClass;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public Course getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(Course currentClass) {
        for(Course course: enrolledCourses){
            if (course.getId().equals(currentClass.getId())) {
                this.currentClass = currentClass;
                break;
            }
        }
    }

    public void addEnrolledCourse(Course newEnrolledCourse){
        this.enrolledCourses.add(newEnrolledCourse);
    }

    public static Student createStudent(){
        Faker faker = new Faker();
        Student createdStudent = new Student();
        createdStudent.setId(faker.bothify("###"));
        createdStudent.setName(faker.name().name());
        createdStudent.setLastName(faker.name().lastName());
        createdStudent.setBirthday(faker.date().birthday());
        return createdStudent;
    }

    public static void generateXStudents(List<Student> students, int X) {
        for (int i = 0; i < 20; i++){
            students.add(createStudent());
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "semester='" + semester + '\'' +
                ", enrolledCourses=" + enrolledCourses +
                ", currentClass=" + currentClass +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
