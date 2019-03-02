public class Hello {
    public static void main(String[] args) {

        Person p = new Person("Courtney", 66.5f, 1.72f);
        System.out.println(p.bmi());

        //練習比較
        int score = 88;
        System.out.println(score > 80); //true
        System.out.println(score > 80 && score < 90); //true
        System.out.println(score < 80 || score > 90); //false

        char c = 'A'; // A = 65
        System.out.println(c > 'a'); // a = 97

        //利用屬性計算 bmi 值
       /* p.weight = 66.5f;
        p.height = 1.72f;
        System.out.println(p.bmi());*/

        //p.hello();

        //練習基本資料型態
        /*int age;
        age = 22 ;
        char c = '中';
        byte b = 1;
        float f = 12.3f;
        boolean d = true;
        String s = new String("eeee");
        System.out.println(s);*/

        //System.out.println("Hello World!");
    }
}
