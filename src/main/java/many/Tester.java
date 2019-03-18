package many;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(5);
        array.add(3);
        array.add("abc");
        array.add(true);
        System.out.println(array);
        int n1 = (int)array.get(0);
        String s = (String)array.get(2);

//        arrayTest();
    }

    private static void arrayTest() {
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
        for (int n : scores) {
            System.out.println(n);
        }
    }
}
