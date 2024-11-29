package ru.mirea.it.java.work14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Task9 {
    private HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    public Task9() {
        try {
            File file = new File("src/ru/mirea/it/java/work14/t9text.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                char ch = scanner.next().charAt(0);
                map.put(ch, map.getOrDefault(Character.toLowerCase(ch), 0) + 1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Нет файла \"t9text.txt\".");
        }

        this.map = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public static void main(String[] args) {
        Task9 task9 = new Task9();
        for (Character ch : task9.map.keySet()) {
            System.out.println(ch + " - " + task9.map.get(ch) + " исп.");
        }
    }
}
