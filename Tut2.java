// Define a class named Tut2
public class Tut2 {
    // The main method where the program execution starts
    public static void main(String[] args){
        // Create an array of integers
        int[] numbers = {30, 14, 22, 34, 9};

        // Create an instance of ArrayFormatter with the array of integers
        ArrayFormatter formatter = new ArrayFormatter(numbers);

        // Call the formatArray method to format the array and get the result
        String formattedString = formatter.formatArray();

        // Print the formatted string
        System.out.println("Formatted String: " + formattedString);
    }
}

