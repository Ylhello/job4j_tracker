package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        HashSet autos = new HashSet<>();
        autos.add("BMW");
        autos.add("Lada");
        autos.add("BMW");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyoto");
        autos.add("Volvo");
        for (Object auto : autos) {
            System.out.println(auto);
        }
    }
}
