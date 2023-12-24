package org.example;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>, TeacherInterface{

    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }


    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age, String objectToTeach) {
        Teacher teacher = new Teacher(name, age, objectToTeach);
        teachers.add(teacher);
    }
}
