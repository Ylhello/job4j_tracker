package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Collections;

public class ItemTest {

    @Test
    void whenSortAscending() {
        List<Item> items = Arrays.asList(
                new Item("Max"),
                new Item("Petr"),
                new Item("Ivan")
        );
        List<Item> expected = Arrays.asList(
                new Item("Ivan"),
                new Item("Max"),
                new Item("Petr")
        );
        Collections.sort(items, new ItemAscByName());
        assertEquals(expected,items);
    }

    @Test
    void whenSortDescending() {
        List<Item> items = Arrays.asList(
                new Item("Max"),
                new Item("Petr"),
                new Item("Ivan")
        );
        List<Item> expected = Arrays.asList(
                new Item("Petr"),
                new Item("Max"),
                new Item("Ivan")
        );
        Collections.sort(items, new ItemDescByName());
        assertEquals(expected,items);
    }
}