package student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //name
        System.out.println("Please enter student's name: ");
        String name = scanner.next();
        //english
        System.out.println("Please enter student's english: ");
        int english = scanner.nextInt();
        //math
        System.out.println("Please enter student's math: ");
        int math = scanner.nextInt();

        Student stu = new Student(name, english, math);
        stu.print();
    }
}
