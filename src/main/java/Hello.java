public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Person p = new Person("Courtney",66.5f, 1.72f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.72f;
        System.out.println(p.bmi());
        /*int age;
        age = 22 ;
        char c = '中';
        byte b = 1;
        float f = 12.3f;
        boolean d = true;
        String s = new String("eeee");
        System.out.println(s);*/
    }
}
