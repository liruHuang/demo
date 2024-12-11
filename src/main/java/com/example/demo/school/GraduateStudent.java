package com.example.demo.school;

public class GraduateStudent extends Student {
    int thisis;
    static int pass = 70;
    public GraduateStudent(String name, int english, int math, int thisis) {
        super(name, english, math);
        this.thisis = thisis;
    }

    @Override
    public void print() {
        int average = getAverage();
        System.out.println(name + "\t" + english + "\t" + math + "\t" + thisis + "\t"
                + getAverage() + "\t" + ((average >= pass) ? "PASS" : "FAILED"));
        char grading = 'F';
        switch (average / 10) {
            case 10 :
            case 9 :
                grading = 'A';
                break;
            case 8 :
                grading = 'B';
                break;
            case 7 :
                grading = 'C';
                break;
            case 6 :
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println("\t"+ grading);
    }
}
