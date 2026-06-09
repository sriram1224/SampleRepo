import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

    @Test
    void firstTest(){
        System.out.println("Hi Junit");


    }

    @Test
    void addNumeber(){
        Calculator cal = new Calculator();
        int actual = cal.add(4,5);
        int expected = 10;
        assertEquals(expected, actual, "Failure Message");
        assertNotEquals(expected, actual, "Failure Message");
    }


}
