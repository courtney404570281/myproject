package student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu = new Student("Courtney", 60, 88);
        stu.print();
        System.out.println("High Score: " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        //name
        System.out.print("Please enter student's name: ");
        String name = scanner.next();
        //english
        System.out.print("Please enter student's english: ");
        int english = scanner.nextInt();
        //math
        System.out.print("Please enter student's math: ");
        int math = scanner.nextInt();

        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High Score: " + stu.highest());
    }
}
