package com.leti.obshaga.preparing.mini.app;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Prepodavatel extends People {
    private float zarplata;
    private boolean isProfessor;
    public Prepodavatel(String name, Position position, int age) {
        super(name, position, age);
    }
}
