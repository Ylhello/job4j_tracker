package ru.job4j.ex;

public class Factorial {
    public int calc(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Start should be less than finish.");
        }
        int result = 1;
        for (int index = 2; index <= number; index++) {
            result *= index;
        }
        return result;
    }

    public static void main(String[] args) {
        new Factorial().calc(-1);
    }
}