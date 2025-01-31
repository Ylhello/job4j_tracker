package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftParts = left.split("\\. ", 2);
        String[] rightParts = right.split("\\. ", 2);
        int leftNumber = Integer.parseInt(leftParts[0]);
        int rightNumber = Integer.parseInt(rightParts[0]);
        return Integer.compare(leftNumber, rightNumber);
    }
}
