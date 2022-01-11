
import org.junit.jupiter.api.Test;
import thuchanh.AbsoluteNumberCalculator.AbsoluteNumberCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteNumberCalculatorTest {
    @Test
    void testFindAbsolute() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}
