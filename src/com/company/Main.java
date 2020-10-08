package com.company;

import java.util.*;

public class Main extends Films{
    public static void main(String[] args) {

        //В конструкторе класса Films можно поместить метод void который уже содержит коллекцию с помещенными в него элементами!
        Films films = new Films();
        //Вызываем наш метод next()
        films.next1();
        films.next();
        films.info();
        /*Animals animals = new Animals();
        animals.info();*/
        Animals animals = new Animals();
        animals.info();


        /*Реализаия с помощью создания обьектов для каждого
        фильма не совсем удобно!
        */









        /*

        List<String> some_list = new LinkedList<>(Arrays.asList("John", "Max", "Sasha", "Nasty"));
        for (String x : some_list
        ) {
            if (x.equals("John")) {
                System.out.println("Congratulations " + x + " You won 1 million dollars");
            } else {
                System.out.println("Unfortunately " + x + " You did not win 1 million");
            }
        }
        // Мы создали тренировочною коллекцию set и попробовали её вывести
        Map<Integer, Integer> some_map = new TreeMap<>();

        some_map.put(1, 2);
        some_map.put(2, 4);
        System.out.println(some_map.get(2));*/

    }
}

