package com.company;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    void learn(String a) {
        System.out.println(a + " Учиться хорошо!");
    }

    void walk(String a) {
        System.out.println(a + " Работает 24/7");
    }

    void eat(String a) {
        System.out.println(a + " Кушает 7 раз в день");
    }

    @Override
    public String toString() {
        return "Person name: " + name +
                ", designation: " + designation;
    }
}
