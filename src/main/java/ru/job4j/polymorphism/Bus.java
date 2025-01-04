package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Движение автобуса");
    }

    @Override
    public int passengers(int count) {
        System.out.println("Количество пассажиров" + count);
        return count;
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("Дозаправка" + fuel);
        return fuel;
    }
}

