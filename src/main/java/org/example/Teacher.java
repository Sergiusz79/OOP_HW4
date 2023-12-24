package org.example;

public class Teacher extends User{

    private String objectToTeach;

    public String getObjectToTeach() {
        return objectToTeach;
    }

    public void setObjectToTeach(String objectToTeach) {
        this.objectToTeach = objectToTeach;
    }

    public Teacher(String name, int age, String objectToTeach) {
        super(name, age);
        this.objectToTeach = objectToTeach;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name='" + this.getName() + ", age=" + this.getAge() +
                ", objectToTeach='" + objectToTeach + '\'' +
                "} ";
    }
}
