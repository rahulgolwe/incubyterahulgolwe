package main;


public class StringCalculator {

	public int add(String numbers) {
        // Case: Empty string
        if (numbers.isEmpty()) {
            return 0;
        }
        
        //Check if the numbers string starts with the delimiter syntax
        if (numbers.startsWith("//")) {
            String delimiter = numbers.substring(2, numbers.indexOf("\n")); //get the custom delimiter
            numbers = numbers.substring(numbers.indexOf("\n") + 1);
            String[] numArray = numbers.split(delimiter); //split the numbers by using custom delimiter and store in an array. 
            return sumNumbers(numArray);
        }
        
        // Default case: split by commas and newlines
        String[] numArray = numbers.split("[,\\n]");
        return sumNumbers(numArray);
    }
	
	//method to return the sum of numbers stored in array
	private int sumNumbers(String[] numArray) {
        int sum = 0;
        for (String num : numArray) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
