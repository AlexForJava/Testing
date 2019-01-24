package net.ukr.hqq;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Space on 24.01.2019.
 */
public class Professor extends Human {
    private List<Group> groups;

    public Professor() {
        super(60, "Alex", "Kim");
        if (groups == null)
            groups = new ArrayList<Group>();
    }

    public Professor(int age, String name, String surname) {
        super(age, name, surname);
        if (groups == null)
            groups = new ArrayList<Group>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public Group getGroup(String name) {
        for (Group g : groups) {
            if (g.getGroupName().equalsIgnoreCase(name))
                return g;
        }
        return null;
    }

    public void roolCallAll() {
        for (Group g : groups)
            for (int i = 0; i < g.size(); i++)
                System.out.println(g.getStudent(i));
    }

    public void rollCall(int i) {
        if (i > groups.size()) return;
        for (int j = 0; j < groups.get(i).size(); j++)
            System.out.println(groups.get(i).getStudent(j));
    }

    public void roolCall(String groupName) {
        if (getGroup(groupName) == null) return;
        for (Student s : getGroup(groupName).getGroup())
            System.out.println(s);
    }
}
