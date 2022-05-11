package com.company;

public class Dancer extends Person{
    private String GroupName;

    public Dancer() {}

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        GroupName = groupName;
    }

    public Dancer(String groupName) {
        GroupName = groupName;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer Name: " + getName() +  ", Designation: " + getDesignation() + ", GroupName: " + GroupName;
    }

    void dancing(String a) {
        System.out.println(a + " Танцует красиво!");
    }
}
