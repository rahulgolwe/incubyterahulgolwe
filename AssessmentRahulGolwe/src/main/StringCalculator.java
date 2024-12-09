package main;


public class StringCalculator {

	public int add(String numbers) {
        // Case: Empty string
        if (numbers.isEmpty()) {
            return 0;
        }
        
        //Split by both commas and new lines
        String[] numArray = numbers.split("[,\\n]");
        int sum = 0;
        for (String num : numArray) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
