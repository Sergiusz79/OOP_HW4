package org.example;


import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student>, StudentInterface {
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }
    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int age, int score) {
        Student student = new Student(name, age, score);
        students.add(student);
    }




}
