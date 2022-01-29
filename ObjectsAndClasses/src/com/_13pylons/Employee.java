package com._13pylons;
import java.time.*;
import java.util.Objects;

public class Employee extends Person{
    // instance fields
    private String name;
    private double salary;
    private LocalDate hireDate;

    private int id;

    // set a static field nextId
    private static int nextId;
    private static int assignId() {
        int n = nextId;
        nextId++;
        return n;
    }

    // constructor
    public Employee(String name, double salary, int yearHired, int monthHired, int dayHired) {
        this.name = Objects.requireNonNullElse(name, "Unknown");
        this.salary = salary;
        this.hireDate = LocalDate.of(yearHired, monthHired, dayHired);
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this("Employee # " + nextId, salary);
        nextId++;
    }

    public Employee() {
        this.name = "Employee # " + nextId; nextId++;
        this.salary = 0;
        this.hireDate = LocalDate.now();
    }

    // set the id
    public void setId() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    //returning a static method
    public static int getNextId() {
        return nextId;
    }

    // a final method cannot be changed in subclasses
    public final String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public String getDescription() {
        return String.format("an employee with a salary of %.2f", salary);
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}
