package com.leti.obshaga.preparing.mini.app;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class People {
    private String name;
    private int age;
    private Position position;
    public People(String name,Position position,int age){
        this.name = name;
        this.position = position;
        this.age = age;
    }

}
