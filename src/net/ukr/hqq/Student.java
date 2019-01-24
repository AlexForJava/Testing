package net.ukr.hqq;

/**
 * Created by Space on 24.01.2019.
 */
public class Student {
    private int age;
    private String name;
    private String surname;
    private String groupName;
    private boolean captain;

    public Student(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public boolean isCaptain() {
        return captain;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + "e.o. in group " + groupName + ((captain) ? " староста" : "");
    }
}
