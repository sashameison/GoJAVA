package com.company;

public class Films {
    private String name;

    public Films() {
    }

    public Films(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
            return " Film{" +
                    "name='" + name + '\'' +
                    '}';
        }
}
