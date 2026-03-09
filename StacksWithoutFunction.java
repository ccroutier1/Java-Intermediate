


public class StacksWithoutFunction {
        public static void main(String[] args) {

            int[] randomNumbers = new int[100]; // stack named randomNumbers
            int[] countNumbers = new int[10];
            int top = -1;

            // Push the random numbers (0 to 9)
            for (int i = 0; i < 100; i++) {
                randomNumbers[++top] = (int) (Math.random() * 10);
            }

            // Count occurrences
            for (int i = 0; i <= top; i++) {
                countNumbers[randomNumbers[i]]++;
            }

            // Display result
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " occurs " + countNumbers[i] + " times");
            }
        }
    }
