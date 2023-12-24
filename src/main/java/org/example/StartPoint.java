package org.example;

import java.util.ArrayList;
import java.util.List;


public class StartPoint {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 20, 5);
        Student st2 = new Student("Oleg", 23, 3);
        Student st3 = new Student("Artur", 23, 2);
        Teacher th1 = new Teacher("Mikolay", 36,"Mathematics");
        Teacher th2 = new Teacher("Alexandr", 45, "Physical");
        Teacher th3 = new Teacher("Sergey", 41, "Biologic");

//        System.out.println("---------------------------------StudentComparator---------------------------------");
//
//        List<Student> students = new ArrayList<>();
//        students.add(st1);
//        students.add(st2);
//        students.add(st3);
//        System.out.println("---------------StudentViev------------------");
//        StudentViev<Student> sv = new StudentViev<>();
//        sv.sendOnConsole(students);
//        System.out.println("---------------------------------");
//        printUsers(students);
//        System.out.println("---------------------------------");
//        students.sort(new UserComparator<Student>());
//        printUsers(students);
//
//        System.out.println("---------------------------------TeacherComparator---------------------------------");
//
//        List<Teacher> teachers = new ArrayList<>();
//        teachers.add(th1);
//        teachers.add(th2);
//        teachers.add(th3);
//        System.out.println("----------------TeacherViev-----------------");
//        TeacherViev<Teacher> tv = new TeacherViev<>();
//        tv.sendOnConsole(teachers);
//        System.out.println("---------------------------------");
//        printUsers(teachers);
//        System.out.println("-----------------TeacherComparator----------------");
//        teachers.sort(new TeacherComparator<Teacher>());
//        printUsers(teachers);
//
        System.out.println("---------------------------------UserComparator---------------------------------");

        List<User> users = new ArrayList<>();
        users.add(st1);
        users.add(st2);
        users.add(st3);
        users.add(th1);
        users.add(th2);
        users.add(th3);
        System.out.println("----------------UserService-----------------");
        printUsers(users);
        System.out.println("---------------------------------");
        users.sort(new UserComparator<User>());
        printUsers(users);

        StudentService ss = new StudentService();
        ss.create("Ivan", 25, 5);
        ss.create("Oleg", 23, 3);
        ss.create("Artur", 20, 2);
        System.out.println("---------------StudentViev------------------");
        StudentViev<Student> sv = new StudentViev<>();
        sv.sendOnConsole(ss.getAll());
        System.out.println("---------------StudentComparator------------------");
        ss.getAll().sort(new UserComparator<Student>());
        sv.sendOnConsole(ss.getAll());

        TeacherService ts = new TeacherService();
        ts.create("Mikolay", 36,"Mathematics");
        ts.create("Alexandr", 45, "Physical");
        ts.create("Sergey", 41, "Biologic");
        System.out.println("----------------TeacherViev-----------------");
        TeacherViev <Teacher> tv = new TeacherViev<>();
        tv.sendOnConsole(ts.getAll());
        System.out.println("-----------------TeacherComparator----------------");
        ts.getAll().sort(new UserComparator<Teacher>());
        tv.sendOnConsole(ts.getAll());



    }

    public static void printUsers(List users) {
        for (Object user : users) {
            System.out.println(user);
        }
    }


}