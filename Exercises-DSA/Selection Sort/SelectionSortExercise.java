import java.util.Scanner;

// ACTIVITY 3 - Sorting Numbers using SELECTION SORT
public class SelectionSortExercise {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int numElements = input.nextInt();

        // Choices for sorting the numbers
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Enter choice: ");
        int sortingChoice = input.nextInt();
        System.out.println();

        // Checks if the input is valid
        if(sortingChoice != 1 && sortingChoice != 2) {
            System.out.print("Invalid Choice! Please Input 1 or 2: ");
            sortingChoice = input.nextInt();
        }
        System.out.println();

        // Get the numbers from user
        int[] numbers = inputNumbers(numElements, input);

        // Sort the numbers
        sortNumbers(numbers, sortingChoice);
        // Displays result
        sortedOutput(numbers, sortingChoice);
    }
    // Method for inputting numbers
    static int[] inputNumbers(int elementSize, Scanner input) {
        int[] numbers = new int[elementSize]; // Creates an array
        System.out.println("Enter numbers: ");
        for (int i = 0; i < elementSize; i++) {
            numbers[i] = input.nextInt(); // Will store each number
        }
        System.out.println();
        return numbers;
    }

    // Using Selection Sort
    static void sortNumbers(int[] numbers, int sortingChoice) {
        int number = numbers.length;

        // Loop through the array
        for (int i = 0; i < number - 1; i++) {
            int numPosition = i; // Assume the current index is the smallest or the largest

            // find smallest or largest depending on choice
            for(int x = i + 1; x < number; x++) {
                if(sortingChoice == 1) { // Ascending
                    if(numbers[x] < numbers[numPosition]) {
                        numPosition = x;
                    }
                } else { // Descending
                    if (numbers[x] > numbers[numPosition]) {
                        numPosition = x;
                    }
                }
            }
            // Swaps the values
            int temp = numbers[i];
            numbers[i] = numbers[numPosition];
            numbers[numPosition] = temp;
        }
    }
    // Displays the sorted numbers
    static void sortedOutput(int [] numbers, int sortingChoice) {

        // check what type of sorting was used
        if (sortingChoice == 1) {
            System.out.println("Sorted Output (Ascending):");
        } else {
            System.out.println("Sorted Output (Descending):");
        }
        // Prints the numbers
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
