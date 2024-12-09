package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.StringCalculator;


class StringCalculatorTest {

	//Method to check Empty String test.
    @Test
    void testEmptyString() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));
    }
    

	//Method to check Single number input.
    @Test
    void testSingleNumber() {
        StringCalculator calc = new StringCalculator();
        assertEquals(1, calc.add("1"));
    }
    
    
    //Method to check comma separated multiple number input.
    @Test
    void testMultipleNumbers() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1,5"));
    }
    
    
    //Method to check new line and comma separated multiple number input.
    @Test
    void testNewLineSeparators() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1\n2,3"));
    }
    
    
    
}