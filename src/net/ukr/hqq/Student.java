package net.ukr.hqq;

/**
 * Created by Space on 24.01.2019.
 */
public class Student extends Human{
        private String groupName;
    private boolean captain;

    public Student(int age, String name, String surname) {
        super(age, name, surname);
    }

    public boolean isCaptain() {
        return captain;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }


    public String getGroupName() {
        return groupName;
    }


    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " " + getAge() + "e.o. in group " + groupName + ((captain) ? " староста" : "");
    }
}
