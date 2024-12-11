package com.example.demo.Report;

public class Tester2 {
    public static void main(String[] args) {
        FinanceReport financeReport = new FinanceReport();
        Report someReport = new Report() {
            @Override
            public void print() {

            }

            @Override
            public void load() {

            }
        };
    }
}
