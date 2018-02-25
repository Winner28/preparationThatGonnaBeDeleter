package com.leti.obshaga.preparing.mini.app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends People {
    private float stepuha;
    private int group;

    public Student(String name, Position position, int age) {
        super(name, position, age);
    }

    @Override
    public String toString() {
     return "Eto student s imenem "+super.getName()+" vozrast"+ getAge();
    }
}
