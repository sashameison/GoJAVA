package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Films {
    private String name;
    private int yearInWhichWasFilmed;

    public Films() {

    }

    public Films(String name, int yearInWhichWasFilmed) {
        this.name = name;
        this.yearInWhichWasFilmed = yearInWhichWasFilmed;

    }

   @Override
    public String toString() {
        return  "Name of film: " + name +
                ", year: " + yearInWhichWasFilmed;
    }

    public void next1(){
        ArrayList<String> actors = new ArrayList<>(Arrays.asList("Matt", "Johny", "Alice"));
        System.out.println("       List of my favourite names        ");
        for (String x: actors
             ) {
            System.out.println(x);
        }
        System.out.println("Our size of ArrayList: " + actors.size());
    }
    public  void next() {
        ArrayList<String> actors = new ArrayList<>();
        actors.add("Leonardo Wilhelm DiCaprio ");
        actors.add("Vin Diesel");
        actors.add("Jason Statham");
        actors.add("Dwayne Douglas Johnson");
        System.out.println("       List of my favourite actors        ");
        for (String x:actors
             ) {
            System.out.println(x);
        }
        System.out.println("Size: " + actors.size());

    }
    public void info(){
        List<Films> list = new ArrayList<>();
        Films first_films = new Films("Spider-Man", 2004);
        Films second_film = new Films("Matrix", 1999);
        Films third_film = new Films("Avatar", 2008);
        Films forth_film = new Films("Inception", 2010);
        Films fifth_film = new Films("PiratesOfCaribbean", 2001);

        list.add(first_films);
        list.add(second_film);
        list.add(third_film);
        list.add(forth_film);
        list.add(fifth_film);

        System.out.println('\n');
        for (Films y: list
        ) {
            System.out.println(y);
        }
        System.out.println('\n' + "Size of our list is :" + list.size());
        System.out.println("\n");
    }
    public void info1(){
        System.out.println("The result pf our victorina");
        List<String> some_list = new LinkedList<>(Arrays.asList("John", "Max", "Sasha", "Nasty"));
        for (String x : some_list
        ) {
            if (x.equals("John")) {
                System.out.println("Congratulations " + x + " You won 1 million dollars");
            } else {
                System.out.println("Unfortunately " + x + " You did not win 1 million");
            }
        }
        System.out.println('\n');
    }
}
