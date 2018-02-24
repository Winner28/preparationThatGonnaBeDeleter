package com.leti.obshaga.preparing.intro;

public class Main {

    public static void main(String[] args) {
        Car bentley=new Car();
        bentley.setCarname("bentley");



        People vali=new People("zhopa");
        vali.setCar(bentley);
        System.out.println("Moe imya " + vali.getName() );
        vali.setName("pisun");
        System.out.println("Moe imya " + vali.getName() );
        vali.viebnutsyaTachkoy();
    }
}
