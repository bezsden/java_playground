package com.luxoft.oop.xtasks;

public class Human {
    private String Name;
   // private Human h1;



    //Human next(){
     //   return this.h1;
   // }

    public Human(String name) {
        Name = name;
    }

    public Human() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
