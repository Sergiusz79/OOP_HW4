package org.example;

public class Student extends User {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + this.getName() + ", age=" + this.getAge() + ", score=" + score + '\'' +
                '}';
    }
}
