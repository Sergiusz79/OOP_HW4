package org.example;

import java.util.List;

public class TeacherViev <Teacher extends User> implements UserViev<Teacher>{


    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher user : teachers) {
            System.out.println(user);
        }
    }
}
