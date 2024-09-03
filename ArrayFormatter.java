// Import the Arrays class from java.util package
import java.util.Arrays;

// Define a class named ArrayFormatter
public class ArrayFormatter {

    // Declare an instance variable for the array of integers
    private int[] numbers;

    // Constructor to initialize the ArrayFormatter with an array of integers
    public ArrayFormatter(int[] numbers){
        this.numbers = numbers;
    }

    // Method to format the array of integers and return the formatted string
    public String formatArray(){
        // Create a string array to hold the string representation of each integer
        String[] stringArray = new String[numbers.length];

        // Sort the array of integers
        Arrays.sort(numbers);

        // Convert each integer to its string representation
        for(int i = 0; i < numbers.length; i++){
            stringArray[i] = String.valueOf(numbers[i]);
        }

        // Join the string representations with " - " as a separator
        return String.join(" - ", stringArray);
    }
}

