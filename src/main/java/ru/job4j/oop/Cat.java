package ru.job4j.oop;

public class Cat {

    private String name;
    private String eat;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.eat);
    }

    public void eat(String seafood) {
        this.eat = seafood;
    }

    public static void main(String[] args) {
        Cat bublik = new Cat();
        bublik.giveNick("Bublik");
        bublik.eat("prawns");
        bublik.show();
    }
}



