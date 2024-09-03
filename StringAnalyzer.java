import java.util.Scanner;

public class StringAnalyzer {
    // Array representing the lowercase English alphabet
    private char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    // Array to store the frequency of each letter in the input string
    private int[] frequency = new int[26];

    // Scanner object for user input
    private Scanner ip = new Scanner(System.in);

    // Variable to store the input string
    private String theString;

    // Main method to start the program
    public static void main(String[] args) {
        StringAnalyzer myAnalyzer = new StringAnalyzer();
        myAnalyzer.start();
    }

    // Method to start the analysis
    private void start() {
        this.getString();        // Get input string from the user
        this.analyseString();    // Analyze the input string
        this.reportAnalysis();    // Report the analysis results
        System.out.println("Program Termination, Goodbye");
    }

    // Method to get input string from the user
    private void getString() {
        System.out.print("Please input the string to be analyzed: ");
        // Read user input, convert to lowercase, and remove non-alphabetic characters
        this.theString = ip.nextLine().toLowerCase().replaceAll("[^a-z]", "");
    }

    // Method to analyze the input string and update frequency array
    private void analyseString() {
        int theStringLength = theString.length();
        char nextLetter;
        int count = 0;
        for (int i = 0; i < theStringLength; i++) {
            nextLetter = theString.charAt(i);
            for (int y = 0; y < letters.length; y++) {
                System.out.println("Checking the character " + nextLetter + " against the letter " + letters[y]);
                count++;
                if (nextLetter == letters[y]) {
                    frequency[y]++;
                    break;
                }
            }
        }
        System.out.println("Number of checks: " + count);
    }

    // Method to report the analysis results
    private void reportAnalysis() {
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Character " + letters[i] +
                        " occurs " + frequency[i] + " times");
            }
        }
    }
}
