import java.util.LinkedList;

 //Problem 5 - Data Structure and Algorithms LinkedList 1.1 ver 
public class LinkedListTwo {
        public static void main(String [] args) {

            LinkedList<Integer> randomNumbers = new LinkedList<>();
            LinkedList<Integer> countNumbers = new LinkedList<>();

            Numbers(randomNumbers, countNumbers);
            countOccurrence(randomNumbers, countNumbers);
            printOccurence(countNumbers);

        }
            public static void Numbers(LinkedList<Integer> randomNumbers, 
                LinkedList<Integer> countNumbers)
        {
            for(int i = 0; i < 10; i++) {
                countNumbers.add(0);            
            }
            for(int i = 0; i < 100; i++) {
                int numbers = (int)(Math.random() * 10);

                randomNumbers.add(numbers);
            }
        }
            // Method to count the occurrences
        public static void countOccurrence(
                LinkedList<Integer> randomNumbers, 
                LinkedList<Integer> countNumbers) {
            // Check every number in randomNumbers
            for (int number : randomNumbers) {
                // This code will update how many times number appears
                countNumbers.set(number, countNumbers.get(number) + 1);
            }
        }
        public static void printOccurence(LinkedList<Integer> countNumbers) {
            for(int i = 0; i < countNumbers.size(); i++) {
                System.out.println(i + " occurs " + countNumbers.get(i) + " times");
            }
        }

    }
