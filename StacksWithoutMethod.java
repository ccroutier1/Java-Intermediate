import java.util.Stack;

public class StacksWithoutMethod {

        public static void main(String[] args) {

            // Stack to store 100 random integers
            Stack<Integer> randomNumbers = new Stack<>();

            // Stack to store how many times numbers 0–9 appear
            Stack<Integer> countNumbers = new Stack<>();

            // Initialize count stack with 0 (for numbers 0 to 9)
            for (int i = 0; i < 10; i++) {
                countNumbers.push(0);
            }

            // Generate 100 random numbers from 0 to 9
            for (int i = 0; i < 100; i++) {

                int number = (int)(Math.random() * 10);

                // Add random number to stack
                randomNumbers.push(number);

                // Update the count immediately (manual counting)
                countNumbers.set(number, countNumbers.get(number) + 1);
            }

            // Display results
            for (int i = 0; i < countNumbers.size(); i++) {
                System.out.println(i + " occurs " + countNumbers.get(i) + " times");
            }
        }
    }
