package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> some_list= new LinkedList<String>(Arrays.asList("John", "Max", "Sasha"));
        for (String x: some_list
             ) {
            if (x == "John"){
                System.out.println("Congratulations " + x + " You won 1 million dollars");
            }
            else {
                System.out.println("Sorry " + x + " You did not win 1 million");
            }
        }
    }
}

