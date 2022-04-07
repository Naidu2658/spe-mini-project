package calculator;

import org.junit.Test;
import static org.junit.Assert.*;
public class calculatorTest {
    calculator c=new calculator();

    @Test
    public void addingfortrueaddition()
    {
        assertEquals("adding two numbers" ,  8, c.add(4,4));
    }
    @Test
    public void addingfortruesub()
    {
        assertEquals("adding two numbers" ,  0, c.sub(5,5));
    }

    @Test
    public void addingforfasleaddition()
    {
        assertNotEquals("adding two numbers" ,  8, c.add(4,3));
    }
}
