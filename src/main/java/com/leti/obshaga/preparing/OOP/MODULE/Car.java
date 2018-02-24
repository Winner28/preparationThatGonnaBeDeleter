package com.leti.obshaga.preparing.OOP.MODULE;

public abstract class Car {
    protected int kolesa;
    protected int dveri;
    protected String carName;

    protected Destination myDestination;

    public Car(int kolesa,int dveri){
        this.kolesa = kolesa;
        this.dveri = dveri;
    }

    public abstract void drive(int kilometrov);
    public abstract void stop();
    public abstract void driveTo(Destination destination);
    public abstract boolean priexaliLiSUdaMashina(String mesto);

    public void hi() {
        System.out.println("hello");
    }

    public final void buy() {
        System.out.println("asdda");
    }

    public void setMyDestination(Destination myDestination) {
        this.myDestination = myDestination;
    }

    public Destination getMyDestination() {
        return myDestination;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
}
