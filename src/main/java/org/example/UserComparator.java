package org.example;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

//    @Override
//    public int compare(Object o1, Object o2) {
//        if(o1 instanceof Student && o2 instanceof Student){
//            int studentResScore = ((Student) o1).getScore() - ((Student) o2).getScore();
//            return studentResScore;
//        }
//        return -1;
//    }


    @Override
    public int compare(T s1, T s2) {
        return s1.getAge() - s2.getAge();
    }
}
