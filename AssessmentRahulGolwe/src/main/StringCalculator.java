package main;


public class StringCalculator {

	public int add(String numbers) {
        // Case: Empty string
        if (numbers.isEmpty()) {
            return 0;
        }
        
        // If there's one number, return its integer value
        return Integer.parseInt(numbers);
    }
}
