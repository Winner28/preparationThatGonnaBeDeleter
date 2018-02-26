package com.leti.obshaga.preparing.OOP.MODULE;

public class Beantley extends Car {

    private boolean isLetat;
    private boolean isBomzh;

    public Beantley(int kolesa,int dveri, boolean isBomzh) {
        super(kolesa, dveri);
        this.isBomzh = isBomzh;
    }

    public static void abc() {
        System.out.println("pisedequery");
    }

    @Override
    public void drive(int kilometrov) {
        for (int i = 0; i<kilometrov; i++) {
            System.out.println("Ya proexal " + i + " kilometrov");
        }
    }

    @Override
    public void stop() {
        System.out.println("ya ostanovilsa");
    }

    @Override
    public void driveTo(Destination destination) {
        if (getMyDestination()==destination) {
            System.out.println("sosi");
            return;
        }
        switch(destination){
            case SPB:
                drive(13);
                setMyDestination(destination);
                break;
            case BREST:
                drive(10);
                setMyDestination(destination);
                break;
            case MOSCOW:
                drive(14);
                setMyDestination(destination);
                break;
            case GAT4INO:
                drive(16);
                setMyDestination(destination);
                break;
        }
    }

    @Override
    public boolean priexaliLiSUdaMashina(String mesto) {
        return false;
    }

    public void killPeople() {

    }

    @Override
    public void hi() {
        if (isBomzh) {
            System.out.println("diriavi");
        } else {
            System.out.println("добры вечар");
        }
    }

    @Override
    public String toString() {
        return getMyDestination() + " eto gde ja, a eto moya ta4ka " + getCarName();
    }

    @Override
    public int hashCode() {
        int result = 31*super.kolesa + 37*super.dveri;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o.getClass() != this.getClass()) return false;
        if (this == o) return true;
        Car car = (Car) o;
        return car.kolesa == this.kolesa && car.dveri == this.dveri && car.carName == this.carName;
    }


    public static void main(String[] args) {
        Car car = new Beantley(4,5, false);
        car.setCarName("Beantley");
        car.setMyDestination(Destination.BREST);

        Car car1 = new Beantley(4,5, true);
        car1.setCarName("Beantley");
        System.out.println(car.equals(car1));

        System.out.println(car1.hashCode());
       // System.out.println(car);
        //car.driveTo(Destination.MOSCOW);
        //System.out.println(car.getMyDestination());

        LexinaMashiba lexinaMashiba = new LexinaMashiba();
        CarInterface carInterface = new LexinaMashiba();
    }

}
