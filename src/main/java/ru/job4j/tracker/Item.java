package ru.job4j.tracker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created;

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item() {
        this.created = LocalDateTime.now();
    }

    public LocalDateTime getCreated() {
        return created;
    }
}

class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime Created = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String DateTimeFormat = Created.format(formatter);
        System.out.println(DateTimeFormat);
    }
}


