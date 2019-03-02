public class Person {

    String name;
    float weight;
    float height;

    public Person(float weight, float height){
        this.height = height;
        this.weight = weight;
//        super();
    }

    //OverLoading
    public Person (String name, float weight, float height){
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public float bmi(){
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello (){
        System.out.println("Hello World!");
    }
}
