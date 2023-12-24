package org.example;

import java.util.List;


public class StudentViev<Student extends User> implements UserViev<Student> {

    @Override
    public void sendOnConsole(List<Student> students) {
        for (Student user : students) {
            System.out.println(user);
        }
    }
}
