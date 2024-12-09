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
    
    
    //handle the case where the input specifies a custom delimiter at the beginning, 
    //example:-    "//;\n1;2", where the delimiter is ;
    @Test
    void testCustomDelimiter() {
        StringCalculator calc = new StringCalculator();
        assertEquals(3, calc.add("//;\n1;2"));
    }
    
    
    
}