package com._13pylons;

public class ManagerTest {
    public static void main(String args[]) {

        Manager boss = new Manager("Jerry Garcia", 80000, 1961, 12, 15);
        boss.setBonus(5000);
        System.out.println(boss.getSalary());

        var staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Phil Colins", 70000, 1966, 12, 23);
        staff[2] = new Employee("The Dude", 20000, 1993, 12, 2);

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
