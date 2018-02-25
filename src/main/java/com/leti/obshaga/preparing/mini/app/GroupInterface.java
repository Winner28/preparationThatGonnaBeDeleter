package com.leti.obshaga.preparing.mini.app;

public interface GroupInterface {
    void addStudent(Student student);
    void deleteStudent(String name);
    void showAll();
    Student getStudent(String name);
    void swapPrepod(Prepodavatel newPrepod);
}
