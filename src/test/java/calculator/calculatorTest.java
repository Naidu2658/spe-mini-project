package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
public class calculatorTest {
    calculator c=new calculator();
    private static final double DELTA = 1e-15;
    @Test
    public void checking_for_true_square_root()
    {
        assertEquals("square root of a  number" ,  2, c.square_root(4), DELTA);
    }
    @Test
    public void checking_for_true_factorial()
    {
        assertEquals("factorial of a  number" ,  24, c.factorial(4));
    }
    @Test
    public void checking_for_true_natural_log()
    {
        assertEquals("natural log of a  number" ,  1.3862943611198906, c.natural_logarithm(4),DELTA);
    }
    @Test
    public void checking_for_true_exponential()
    {
        assertEquals("exponential of x to a" ,  16.0, c.exponential(4, 2), DELTA);
    }

    @Test
    public void checking_for_false_square_root()
    {
        assertNotEquals("square root of a  number" ,  23, c.square_root(4), DELTA);
    }
    @Test
    public void checking_for_false_factorial()
    {
        assertNotEquals("factorial of a  number" ,  242, c.factorial(4));
    }
    @Test
    public void checking_for_false_natural_log()
    {
        assertNotEquals("natural log of a  number" ,  12.3862943611198906, c.natural_logarithm(4),DELTA);
    }
    @Test
    public void checking_for_false_exponential()
    {
        assertNotEquals("exponential of x to a" ,  162.0, c.exponential(4, 2), DELTA);
    }
}
