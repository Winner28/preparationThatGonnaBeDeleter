package com.leti.obshaga.preparing.parallel;

public class B extends Thread {

    @Override
    public void run() {
        for (int i =0; i<5; i++) {
            System.out.println("i`m here " + i + " my thread " + Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
