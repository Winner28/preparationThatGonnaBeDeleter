package com.leti.obshaga.preparing.parallel;

public class A {
    public static void main(String[] args) throws Exception {
        System.out.println(Thread.currentThread());
        B b = new B();
        b.setName("I`M B");
        b.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread());
            Thread.sleep(1000);
        }

    }
}
