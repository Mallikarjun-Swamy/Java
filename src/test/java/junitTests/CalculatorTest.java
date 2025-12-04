package junitTests;

import junit.Calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator test = new Calculator();

    @Test
    void testPositiveAddition (){
        int actual = test.add(10,10);
        int expected = 10+10;
        assertEquals(expected, actual);
    }

    @Test
    void testNegativeAddition (){
        int actual = test.add(-10,50);
        int expected = -10+50;
        assertEquals(expected, actual);
    }

    @Test
    void testmultiply(){
        int actual = test.multiply(10000,5);
        int expected = 10000*5;
        assertEquals(expected, actual);
    }

    @Test
    void testmultiplyZero(){
        int actual = test.multiply(10000,0);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
