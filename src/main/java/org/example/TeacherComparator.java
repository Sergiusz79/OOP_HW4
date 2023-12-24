package org.example;

import java.util.Comparator;

public class TeacherComparator <T extends Teacher> implements Comparator<T> {

    @Override
    public int compare(T t1, T t2) {
       return t1.getAge()- t2.getAge();
    }
}
