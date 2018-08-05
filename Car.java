package com.luxoft.oop.xtasks;

public class Car extends Vehicle {
    public static void main(String[] args){
        Vehicle a =new Car();
        boolean result= a instanceof Vehicle;
        System.out.println(result);
    }
}