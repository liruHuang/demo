package com.example.demo;

public class Ticket {
    int origin;
    int destination;
    int pric;

    public Ticket(int origin, int destination, int pric) {
        this.origin = origin;
        this.destination = destination;
        this.pric = pric;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getPric() {
        return pric;
    }

    public void setPric(int pric) {
        this.pric = pric;
    }
}
