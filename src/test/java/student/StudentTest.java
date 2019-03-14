package student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void highestTest(){
        Student student = new Student("Courtney", 60, 98);
        Assertions.assertEquals(98,student.highest());
    }
    @Test
    public void getAverageTest(){
        Student student = new Student("Courtney", 60, 98);
        Assertions.assertEquals(79, student.getAverage());
    }
}

