package com.leti.obshaga.preparing.intro;

public class People {
    private Car car;
    private House house;
    private String name;
    public People(String namer){
        this.name = namer;
    }
    public String getName(){
        return this.name;
    }
    public void viebnutsyaTachkoy(){
        System.out.println("smotrite kakaya u menya tachka " + getCar().getCarname());
    }

    public void viebnutsyaHatoy(){
        System.out.println("smotrite kakaya u menya hata = " + house.getTypeofhouse());
    }
    public void setName(String namer){
        this.name = namer;
    }
    public void setCar(Car car1){
        this.car = car1;
    }


    public Car getCar() {
        return car;
    }
}
