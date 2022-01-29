package com._13pylons;


// a class with one or more abstract methods must itself be declared abstract.
// abstract classes cannot be instantiated(no objects can be created (ie: new Person("Dude") == error)
// however you can create objects of concrete subclasses.
public abstract class Person {

    private String name;

    public Person() {
        this.name = "Unknown";
    }

    public Person(String name) {
        this.name = name;
    }

    // Abstract methods act as placeholders for methods that are
    // implemented in the subclasses.
    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
