package main;


public class StringCalculator {

	public int add(String numbers) {
        // Case: Empty string
        if (numbers.isEmpty()) {
            return 0;
        }
        
        //If there is just one number, return it
        if (!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        }

        return 0;
    }
}
