package student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print(){
        System.out.println(name + "\t" + english + "\t" + math + "\t" +
                getAverage());
    }

    public int highest () {
        // int max = (english > math) ? english : math;
        int max = 0;
        if (english > math){
            max = english;
        } else {
            max = math;
        }
        return max;
    }

    public int getAverage(){
        return (english + math)/2;
    }
}
