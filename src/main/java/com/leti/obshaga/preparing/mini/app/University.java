package com.leti.obshaga.preparing.mini.app;

public class University {
    private String name;
    private GroupInterface group;
    public University(String name) {
        this.name = name;
    }

    public void setGroup(GroupInterface group) {
        this.group = group;
    }

    public GroupInterface getGroup() {
        return group;
    }

    public static void main(String[] args) {
        University university = getUniversity();
        university.getGroup().showAll();
        university.getGroup().deleteStudent("Vitya");
        university.getGroup().showAll();
        Student student = university.getGroup().getStudent("Vitwvya");
        System.out.println(student);
    }

    private static University getUniversity() {
        University university = new University("LETI");
        Prepodavatel prepodavatel = new Prepodavatel("Vasya",Position.PREPODAVATEL,54);
        GroupInterface group = new Group(5,prepodavatel);
        Student student2 = new Student("Vitya",Position.STUDENT,19);
        Student student1 = new Student("Visdftya",Position.STUDENT,19);
        Student student3 = new Student("Vitwvya",Position.STUDENT,19);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        university.setGroup(group);
        return university;

    }
}
