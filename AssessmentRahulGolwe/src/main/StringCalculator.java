package main;


public class StringCalculator {

	public int add(String numbers) {
        // Case: Empty string
        if (numbers.isEmpty()) {
            return 0;
        }
        
        //Split by commas and sum the numbers
        String[] numArray = numbers.split("[,]");
        int sum = 0;
        for (String num : numArray) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
