import java.util.Stack;

public class StacksWIthMethod {

        public static void main(String[] args) {

            // This stack will store 100 random integers
            Stack<Integer> randomNumbers = new Stack<>();

            // This stack will store how many times each number appears
            Stack<Integer> countNumbers = new Stack<>();

            // Initialize count stack with 0 (for numbers 0–9)
            for (int i = 0; i < 10; i++) {
                countNumbers.push(0);
            }

            // Generate 100 random numbers from 0 to 9
            for (int i = 0; i < 100; i++) {
                int number = (int) (Math.random() * 10);
                randomNumbers.push(number);
            }

            // Call method to count occurrences
            countOccurrence(randomNumbers, countNumbers);

            // Print results
            for (int i = 0; i < countNumbers.size(); i++) {
                System.out.println(i + " occurs " + countNumbers.get(i) + " times");
            }
        }

        // Method to count occurrences
        public static void countOccurrence(Stack<Integer> randomNumbers,
                                           Stack<Integer> countNumbers) {

            for (int number : randomNumbers) {
                countNumbers.set(number, countNumbers.get(number) + 1);
            }
        }
    }
