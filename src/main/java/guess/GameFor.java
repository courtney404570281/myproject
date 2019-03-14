package guess;

import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=3; i++) {
            //System.out.println(i);
            sum += 1;
        }
        System.out.println(sum);

        for (int i=1; i<=5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter number:");
            int number = scanner.nextInt();
            System.out.println("第" + i + "次：" + number);
            if (number == -1) {
                break;
            }
        }
        System.out.println("結束");
    }
}
