package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> predicate) {
        List<Folder> result = new ArrayList<>();
        for (Folder folder : list) {
            if (predicate.test(folder)) {
                result.add(folder);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Folder> folders = List.of(
                new Folder("project", 120),
                new Folder("bugfix", 80),
                new Folder("feature", 150),
                new Folder("debug", 200)
        );

        List<Folder> largeFolders = filter(folders, folder -> folder.getSize() > 100);
        List<Folder> bugFolders = filter(folders, folder -> folder.getName().contains("bug"));

        System.out.println("Large folders: " + largeFolders);
        System.out.println("Folders with 'bug' in name: " + bugFolders);
    }
}
