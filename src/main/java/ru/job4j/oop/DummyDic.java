package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово: " + eng;
    }

    public static void main(String[] args) {
        DummyDic translation = new DummyDic();
        String word = translation.engToRus("starry");
        System.out.println(word);
    }
}
