package biz.hahamo.dev.ccfractals;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author GHajba
 */
public class FractalCalculatorTest {

    /**
     * Test of calculateFractalPerimeter method, of class FractalCalculator with three sides.
     */
    @Test
    public void testCalculateFractalPerimeter() {
        System.out.println("calculateFractalPerimeter");
        FractalCalculator instance = new FractalCalculator();
        int sides = 3;
        assertEquals(new BigDecimal(27), instance.calculateFractalPerimeter(9, 0, sides));
        assertEquals(new BigDecimal(36), instance.calculateFractalPerimeter(9, 1, sides));
        assertEquals(new BigDecimal(48), instance.calculateFractalPerimeter(9, 2, sides));
    }
    
    /**
     * Test of calculateFractalPerimeter method, of class FractalCalculator with four sides.
     */
    @Test
    public void testQuadraKoch()
    {
        System.out.println("quadraKoch");
        FractalCalculator instance = new FractalCalculator();
        int sides = 4;
        assertEquals(new BigDecimal(36), instance.calculateFractalPerimeter(9, 0, sides));
        assertEquals(new BigDecimal(60), instance.calculateFractalPerimeter(9, 1, sides));
        // Tell me (write issue or mail or anything) why is the result 100 of the following test
        // or stated else: why do I get with manually drawing and calculating the perimeter
        // only 84 instead of 100 (which is the result of the calculation)?
        // reward: coding / discussion session with me
//        assertEquals(new BigDecimal(84), instance.calculateFractalPerimeter(9, 2, sides));
    }
    
}
