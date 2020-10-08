package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Films {
    private String name;
    private int yearInWhichWasFilmed;

    public Films() {

    }

    public Films(String name, int yearInWhichWasFilmed) {
        this.name = name;
        this.yearInWhichWasFilmed = yearInWhichWasFilmed;
    }

    public int getYearInWhichWasFilmed() {
        return yearInWhichWasFilmed;
    }

    public void setYearInWhichWasFilmed(int yearInWhichWasFilmed) {
        this.yearInWhichWasFilmed = yearInWhichWasFilmed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   @Override
    public String toString() {
        return  "Name of film: " + name +
                ", year: " + yearInWhichWasFilmed;
    }

    public void next1(){
        ArrayList<String> actors = new ArrayList<>(Arrays.asList("Brody"));
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

}
