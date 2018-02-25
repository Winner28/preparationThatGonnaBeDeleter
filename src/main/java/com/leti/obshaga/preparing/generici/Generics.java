package com.leti.obshaga.preparing.generici;

import com.leti.obshaga.preparing.OOP.MODULE.Beantley;
import com.leti.obshaga.preparing.intro.Car;
import com.leti.obshaga.preparing.intro.People;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Generics{


    public static void main(String[] args) {
        int x = 3;
        List<Number> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2L);
        integerList.add(4.56123312);
        Iterator iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> set = new HashSet<>();
        set.add("stri");
        System.out.println(set);

    }
}
