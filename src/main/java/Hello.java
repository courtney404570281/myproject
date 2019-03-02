public class Hello {
    public static void main(String[] args) {

        Person p = new Person("Courtney", 66.5f, 1.72f);
        System.out.println(p.bmi());

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
