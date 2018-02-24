package com.leti.obshaga.preparing.OOP.MODULE;

public interface CarInterface {

    void exat();
    void letat();
    void zapravitsa();

    default void abc() {
        System.out.println("abc");
    }
}
