package ru.mirea.it.java.work27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task1 {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A1", 34);
        map.put("A2", 565);
        map.put("A3", 0);
        map.put("B1", -123);
        map.put("B2", 333);
        map.put("B3", -1);
        map.put("C1", 1);
        map.put("C2", 555);
        map.put("C3", 123);
        map.put("D1", 321);
        return map;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        System.out.println("Значение B2 = " + map.get("B2"));
        map.remove("B3");

        System.out.println("========== Удаление B3");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        HashSet<String> set = new HashSet<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            set.add(entry.getKey());
        }


        System.out.println("============ Преобразование в Set (array для вывода)");
        System.out.println(Arrays.toString(set.toArray()));

    }
}
