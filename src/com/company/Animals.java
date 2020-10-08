package com.company;

import java.util.ArrayList;

public class Animals extends Films{
    private String breed;
    private int age;
    private String name;

    public Animals(String breed, int age, String name) {
        this.breed = breed;
        this.age = age;
        this.name = name;
        info();
    }

    public Animals() {

    }

    @Override
    public String toString() {
        return
                "Breed of animal: " + breed +
                ", age of animal: " + age +
                ", name of animal: " + name
                ;
    }
    public void info(){

        ArrayList<Animals> some_animal = new ArrayList<>();

        Animals first = new Animals("Boba", 12, "Sasha");
        Animals second = new Animals("Chika", 10, "Masha");
        Animals third = new Animals("Aba", 8, "Artem");
        some_animal.add(first);
        some_animal.add(second);
        some_animal.add(third);

        for (Animals x: some_animal
        ) {
            System.out.println(x);
        }
        System.out.println(some_animal.size());
        System.out.println(some_animal.isEmpty());

    }
}