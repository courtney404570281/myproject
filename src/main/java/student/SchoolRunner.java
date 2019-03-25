package student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {

//        userInput();

        Student.pass = 50;
//        com.courtney.Student.setPass(40);

        Student stu = new Student("Courtney", 10, 91);
        Student stu1 = new Student("Jennifer", 50, 48);
        Student stu2 = new Student("Griselda", 22, 33);
        GraduateStudent gs = new GraduateStudent("Florence", 70, 59, 90);

        stu.print();
        stu1.print();
        stu2.print();
        gs.print();

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
