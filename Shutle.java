package com.luxoft.oop.xtasks;

public class Shutle {

     String ShutleName;
     Astronaut[] AstronautInShutle = new Astronaut[10];


    public Shutle(String shutleName) {
        this.ShutleName = shutleName;
    }

    public Astronaut[] getAstronautInShutle() {
        return AstronautInShutle;
    }

    public void setAstronautInShutle(Astronaut[] astronautInShutle) {
        AstronautInShutle = astronautInShutle;
    }
}
