package school;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class StudentRunner {

    public static void main(String[] args) {
//        userInput();
        Student.pass = 60;
        Student stu = new Student("Hank", 77, 99);
        Student stu2 = new Student("Eric", 60, 40);
        Student stu3 = new Student("John", 70, 40);
        GraduateStudent gstu = new GraduateStudent("Jack", 60, 60, 60);
        gstu.print();
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score: " + stu.highest());
    }


    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter student's name : ");
        String name = scanner.next();
        System.out.println("english:");
        int english =scanner.nextInt();
        System.out.println("math:");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("Hight Score:" + stu.highest());
    }

}
