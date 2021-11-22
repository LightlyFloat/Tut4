package nz.ac.massey.cs._251.tut4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestCalc

{
    @Test
    void add() {
        int a = 24;
        int b = 12;
        assertEquals(36, Calc.add(a,b));
    }

    @Test
    void subtract() {
        int a = 24;
        int b = 12;
        assertEquals(12,Calc.subtract(a,b));
    }


}