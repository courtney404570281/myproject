package guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i=1; i<=3; i++) {
//            //System.out.println(i);
//            sum += i;
//        }
//        System.out.println(sum);
//
//        for (int i=5; i>=1; i--) {
//            System.out.println(i);
//        }
        int secret = new Random().nextInt(10) + 1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<=4; i++) {
            System.out.print("Please enter number:(" + i + "/4)");
            int number = scanner.nextInt();
            System.out.println("第" + i + "次：" + number);
            if (number > secret) {
                System.out.println("Lower");
            } else if (number < secret) {
                System.out.println("Higher");
            } else {
                System.out.println("Great! The number is " + number);
                break;
            }
//            if (number == -1) {
//                break;
//            }
        }
        System.out.println("結束");
    }
}
