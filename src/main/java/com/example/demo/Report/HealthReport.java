package com.example.demo.Report;

public class HealthReport implements Report {
    @Override
    public void load() {
        System.out.println("Health loading Data");
    }

    @Override
    public void print() {
        System.out.println("Health printing Data");
    }
}
