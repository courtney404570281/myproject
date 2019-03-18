package many;

public class Tester {
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 5;
        number[1] = 4;
        number[4] = 3;
        //number[5] = 6; // Wrong!
        int[] scores = {64, 34, 22, 75, 90};
        System.out.println(scores); // [I@63947c6b 記憶體位置
        for(int i = 0; i<5; i++) {
            System.out.println(scores[i]);
        }
    }
}
