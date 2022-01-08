package com._13pylons;
import java.time.*;
import java.util.Objects;

public class Employee {
    // instance fields
    private String name;
    private double salary;
    private LocalDate hireDate;

    // constructor
    public Employee(String name, double salary, int yearHired, int monthHired, int dayHired) {
        this.name = Objects.requireNonNullElse(name, "Unknown");
        this.salary = salary;
        this.hireDate = LocalDate.of(yearHired, monthHired, dayHired);
    }

    // a method
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        this.salary += raise;
    }
}
