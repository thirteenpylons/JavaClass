package com._13pylons;

public class PersonTest {
    public static void main(String args[]) {
        var people = new Person[2];

        people[0] = new Student("Dude", "Software Development");
        people[1] = new Employee("Ingrid", 20000, 1999, 2, 11);

        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
