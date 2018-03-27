import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testNextDayCalculator0() {
        int day =30;
        int month=3;
        int year=2016;
        String date = NextDayCalculator.date(day,month,year);
        assertEquals(31,3,2016);
    }
}