package com.leti.obshaga.preparing.exceptions.module;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionsModule {

    public static void main(String[] args) {
        System.out.println("hello");
        proceedException(0);
    }

    private static void proceedException(int INCOME) {
        try {
            // kod который может спровоцировать исколбчение
            System.out.println(100/INCOME);
        } catch (ArithmeticException e) {
            oneMoreTime();
        }

        System.out.println("its ok + " + INCOME);

    }

    private static void oneMoreTime() {
        proceedException(10);
        try {
            fileWork();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileWork() throws IOException {
        InputStream is = new BufferedInputStream(System.in);
        is.read();
    }

    private void check(int x) {
        if (x<0) {
            throw new XyeviiVvvodException("XYEVO VVODISH");
        }
    }
}

