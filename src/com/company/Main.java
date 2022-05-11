package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Нурсултан");
        person.setDesignation("Балерина");
        System.out.println(person);
        person.eat(person.getName());
        person.walk(person.getName());
        person.learn(person.getName());
        System.out.println();

        Programmer programmer = new Programmer();
        programmer.setName("Камчыбек");
        programmer.setDesignation("Тестировшик");
        programmer.setCompanyName("PeaksoftHouse");
        System.out.println(programmer);
        programmer.eat(programmer.getName());
        programmer.walk(programmer.getName());
        programmer.learn(programmer.getName());
        programmer.coding(programmer.getName());
        System.out.println();

        Dancer dancer = new Dancer();
        dancer.setName("Айзада");
        dancer.setDesignation("Go-Go");
        dancer.setGroupName("D-12");
        System.out.println(dancer);
        dancer.eat(dancer.getName());
        dancer.walk(dancer.getName());
        dancer.learn(dancer.getName());
        dancer.dancing(dancer.getName());
        System.out.println();

        Singer singer = new Singer();
        singer.setName("Азиза");
        singer.setDesignation("Гитарист");
        singer.setBandName("Rammstein");
        System.out.println(singer);
        singer.eat(singer.getName());
        singer.walk(singer.getName());
        singer.learn(singer.getName());
        singer.singing(singer.getName());
        singer.playGitar(singer.getName());
        System.out.println();

    }
}
