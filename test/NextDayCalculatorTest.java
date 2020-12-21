import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("test case 1/1/2018")
    void testday1month1year2020(){
        int dayTest =1;
        int monthTest=1;
        int yearTest=2018;
        String expected = "2-1-2018";
        String result = NextDayCalculator.findNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("test case 31/1/2018")
    void testday31month1year2020(){
        int dayTest =31;
        int monthTest=1;
        int yearTest=2018;
        String expected = "1-2-2018";
        String result = NextDayCalculator.findNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("test case 30/4/2018")
    void testday30month4year2018(){
        int dayTest =30;
        int monthTest=4;
        int yearTest=2018;
        String expected = "1-5-2018";
        String result = NextDayCalculator.findNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test case 28/2/2018")
    void testday28month2year2018(){
        int dayTest =28;
        int monthTest=2;
        int yearTest=2018;
        String expected = "1-3-2018";
        String result = NextDayCalculator.findNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName("test case 29/2/2020")
    void testday29month2year2018(){
        int dayTest =29;
        int monthTest=2;
        int yearTest=2020;
        String expected = "1-3-2020";
        String result = NextDayCalculator.findNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName("test case 31/12/2020")
    void testday31month12year2020(){
        int dayTest =31;
        int monthTest=12;
        int yearTest=2020;
        String expected = "1-1-2021";
        String result = NextDayCalculator.findNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName("test case 1/32/2020")
    void testday1month32year2020(){
        int dayTest =1;
        int monthTest=32;
        int yearTest=2020;
        String expected = "Invalid date";
        String result = NextDayCalculator.findNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);

    }




}