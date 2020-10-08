package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Films> list = new ArrayList<Films>();

        Films first_films = new Films("Spider-Man");
        Films second_film = new Films("Matrix");
        Films third_film = new Films("Avatar");
        Films forth_film = new Films("Inception");
        Films fifth_film = new Films("PiratesOfCaribbean");

        list.add(first_films);
        list.add(second_film);
        list.add(third_film);
        list.add(forth_film);
        list.add(fifth_film);

        System.out.println("       List of my favourite films         ");
        for (Films x: list
             ) {
            System.out.println(x);
        }
        System.out.println("\n");

        List<String> some_list = new LinkedList<String>(Arrays.asList("John", "Max", "Sasha", "Nasty"));
        for (String x : some_list
        ) {
            if (x == "John") {
                System.out.println("Congratulations " + x + " You won 1 million dollars");
            } else {
                System.out.println("Unfortunatly " + x + " You did not win 1 million");
            }
        }

        Map<Integer, Integer> some_map = new TreeMap<>();

        some_map.put(1, 2);
        some_map.put(2, 4);
        System.out.println(some_map.get(2));




    }
}

