package com._13pylons;

public class EmployeeTest {

    public static void main(String args[]) {

        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Jerry Garcia", 50000, 1966, 8,4);
        staff[1] = new Employee("Vinicius Chagas", 60000, 1994, 10, 9);
        staff[2] = new Employee("John McLaughlin", 70000, 1980, 9, 20);

        // raise each employees salary by 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println("name=" + e.getName()
                    + ", salary=" + e.getSalary()
                    + ", hireDate=" + e.getHireDate());
        }
    }
}
