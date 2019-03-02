public class Person {

    String name;
    float weight;
    float height;

    public Person(float weight, float height){
        this.weight = weight; //this.weight 是屬性, weight 是區域變數
        this.height = height;
//        super();
    }

    //OverLoading
    public Person (String name, float weight, float height){
        this(weight, height); //可以不用多寫重複之程式碼
        this.name = name;
//        this.weight = weight;
//        this.height = height;

    }

    public float bmi(){
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello (){
        System.out.println("Hello World!");
    }
}
