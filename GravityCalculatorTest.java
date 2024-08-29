import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;


public class GravityCalculatorTest {
    @Test
    public void testcalculateFinalPosition1() {
        double finalPosition = GravityCalculator.calculateFinalPosition(-9.8,0.0,10.0,0.0);
        assertEquals(finalPosition,-490.0);
    }

    public void testcalculateFinalPosition2() {
        double finalPosition = GravityCalculator.calculateFinalPosition(-9.8,100.0,10.0,0.0);
        assertEquals(finalPosition,510.0);
    }
}
