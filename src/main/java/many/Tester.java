package many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
          //hashTest
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        stocks.put("2330", "TSMC");
        System.out.println(stocks.get("2330"));
        System.out.println(stocks);
        for (String key: stocks.keySet()) {
            System.out.println(stocks.get(key));
        }
//        setTest();
//        listTest();
//        arrayTest();
    }

    private static void setTest() {
        HashSet<Integer> set = new HashSet();
        set.add(1);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(6);
        System.out.println(set);
        for (int n : set) {
            System.out.println(n);
        }
    }

    private static void listTest() {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(1);
        System.out.println(list); // [5, 3, 1, 7, 1]
        int n1 = (int)list.get(0);
        int n2 = (int)list.get(3);
        System.out.println(list.size());
        List<Integer> scores = Arrays.asList(68, 88, 90, 49, 50);
        for (int score : scores) {
            System.out.println(score);
        }
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
