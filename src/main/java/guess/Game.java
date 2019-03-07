package guess;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != -1) {
            System.out.print("Please enter a number: ");
            number = scanner.nextInt();
            System.out.println(number);
        }

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while ( i<3 );
    }
}
