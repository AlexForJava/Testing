package net.ukr.hqq;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Space on 24.01.2019.
 */
public class Group {
    private String groupName;
    private List<Student> group;
    private boolean captain;

    public Group(String groupName) {
        this.groupName = groupName;
        if (group == null)
            group = new ArrayList<Student>();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public boolean hasCaptain() {
        for (Student s : group)
            if (s.isCaptain()) {
                captain = true;
                return captain;
            }
        captain = false;
        return captain;
    }

    public void addStudent(Student student) {
        group.add(student);
        student.setGroupName(groupName);
    }

    public int size() {
        return group.size();
    }

    public void setCaptainRand() {
        if (!hasCaptain()) {
            Random rnd = new Random();
            group.get(rnd.nextInt(group.size())).setCaptain(true);
        } else {
            for (Student s : group)
                s.setCaptain(false);
            hasCaptain();
            setCaptainRand();
        }
    }

    public void setCaptain(int i) {
        for (Student student : group)
            student.setCaptain(false);

        getStudent(i).setCaptain(true);
    }

    public List<Student> getGroup() {
        return group;
    }

    public Student getStudent(int i) {
        if (i > size())
            throw new IllegalArgumentException();
        return group.get(i);
    }
}
