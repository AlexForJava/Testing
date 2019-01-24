package net.ukr.hqq;

/**
 * Created by Space on 24.01.2019.
 */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(19, "Ivan", "Ivanov");
        Student s2 = new Student(18, "Kolya", "Petrov");
        Student s3 = new Student(17, "Dima", "Conan");
        Student s4 = new Student(19, "Anna", "Korlova");
        Student s5 = new Student(20, "Dash", "Golads");

        Group group = new Group("AA19");
        group.addStudent(s1);
        group.addStudent(s2);
        group.addStudent(s3);
        group.addStudent(s4);
        group.addStudent(s5);

        Professor professor = new Professor();
        professor.addGroup(group);

        group.setCaptainRand();
        professor.roolCallAll();

        System.out.println();
        professor.roolCall(group.getGroupName());
    }
}
