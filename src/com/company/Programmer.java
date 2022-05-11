package com.company;

public class Programmer extends Person{
   private String companyName;

    public Programmer() {}

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    void coding(String a) {
       System.out.println(a + " Пишет коды!");
   }

    @Override
    public String toString() {
        return "Programist Name: " + getName() +  ", Designation: " + getDesignation() + ", СompanyName: " + companyName;
    }
}
