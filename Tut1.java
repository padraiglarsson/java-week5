// Define a class named Tut1
public class Tut1 {
    // The main method where the program execution starts
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {5, 8, 12, 4, 7};

        // Call the arrayToString method to format the array and get the result
        String formattedString = arrayToString(numbers);

        // Print the formatted string
        System.out.println("Formatted String: " + formattedString);
    }

    // Helper method to convert an array of integers to a formatted string
    private static String arrayToString(int[] array){
        // Create a string array to hold the string representation of each integer
        String[] stringArray = new String[array.length];

        // Convert each integer to its string representation
        for (int i = 0; i < array.length; i++){
            stringArray[i] = Integer.toString(array[i]);
        }

        // Join the string representations with " - " as a separator
        return String.join(" - ", stringArray);
    }
}


