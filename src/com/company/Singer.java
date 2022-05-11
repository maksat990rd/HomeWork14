package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer() {}

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer Name: " + getName() +  ", Designation: " + getDesignation() + ", BandName: " + bandName;
    }

    void singing(String a) {
        System.out.println(a + " Поет в подземках!");
    }
    void playGitar(String a) {
        System.out.println(a + " Играет на гитаре!");
    }
}
