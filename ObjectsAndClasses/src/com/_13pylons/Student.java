package com._13pylons;

public class Student extends Person{
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    // defining getDescription method makes Student class concrete
    // since there are no more abstract methods.
    public String getDescription() {
        return "a student majoring in " + this.major;
    }
}
