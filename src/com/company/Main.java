package com.company;


import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* List<String> list = new ArrayList<>();
        list.add(0, "one");
        list.add(1, "two");
        list.add(2, "three");
        list.add(3, "four");
        for (String x: list
             ) {
            System.out.println(x);
        }
        List<String> list1 = new LinkedList<>();
        list1.add(0, "five");
        list1.add(1, "six");
        list1.add(2, "seven");
        list1.add(3, "eight");
        list1.add(4, "nine");
        list1.add(5, "ten");
        for (String x: list1
             ) {
            System.out.println(x);
        }
       Set<String> list3 = new HashSet<>();
        list3.add("Botya");
        list3.add("Sava");
        for (String x: list3
             ) {
            System.out.println(x);
        }
*/
      /*  Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sasha");
        map.put(2, "Dasha");
        map.put(3, "Kolya");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));*/


        System.out.println(" ");
        Films films = new Films();

        films.next1();
        films.InfoAboutFilms();
        films.Info1();


        Animals animals = new Animals();
        animals.InfoAboutAnimals1();

    }
}

