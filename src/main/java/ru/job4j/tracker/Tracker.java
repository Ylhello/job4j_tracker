package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int result = - 1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != - 1) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != - 1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int count = 0;
        for (int index = 0; index < items.length; index++) {
            Item name = items[index];
            if (name != null && name.getName().equals(key)) {
                result[count++] = name;
            }
        }
        result = Arrays.copyOf(result, count);
        return result;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }
}