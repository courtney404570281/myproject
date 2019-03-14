package guess;

import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        for (int i=1; i<=3; i++) {
            System.out.println(i);
        }

        for (int i=1; i<=5; i++) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println("第" + i + "次：" + number);
        }
    }
}
