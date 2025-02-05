package ru.job4j.lambda;

import java.util.Comparator;
import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        Comparator<String> comparatorText = (left, right) -> left.compareTo(right);
        Comparator<String> comparatorDescSize = (left, right) -> Integer.compare(right.length(), left.length());
        List<String> names = Arrays.asList("Michaela", "Luisa", "Britney", "Taylor", "Jack");
        Collections.sort(names, comparatorText);
        System.out.println("По строкам: " + names);
        Collections.sort(names, comparatorDescSize);
        System.out.println("По убыванию длины: " + names);
    }
}