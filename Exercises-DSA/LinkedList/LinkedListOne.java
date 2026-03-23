import java.util.LinkedList;
//Problem 5 - Data Structure and Algorithms LinkedList 1.0 ver
public class LinkedListOne {
        public static void main(String [] args) {
            //This linkedlist will store 100 random integers
            LinkedList<Integer> randomNumbers = new LinkedList<>();

            //This linkedlist will store how many times each numbers appears
            LinkedList<Integer> countNumbers = new LinkedList<>();

            //This for loop will initialize count list that starts with 0
            for(int i = 0; i < 10; i++) {
                countNumbers.add(0);
            }
            //This for loop will generate 100 random numbers from 0 to 10
            for(int i = 0; i < 100; i++) {
                //The math.random will generate random integers from 0.0 to 0.999
                int numbers = (int)(Math.random() * 10);

                //This will add the random numbers to the list
                randomNumbers.add(numbers);
            }
            //This will call the countOccurrence method
            countOccurrence(randomNumbers, countNumbers);

            //This will print how many times each number appears
            for (int i = 0; i < countNumbers.size(); i++) {
                System.out.println(i + " occurs " + countNumbers.get(i) + " times");
            }
        }

        // Method to count the occurrences
        public static void countOccurrence(
                LinkedList<Integer> randomNumbers, LinkedList<Integer> countNumbers) {
            // Check every number in randomNumbers
            for (int number : randomNumbers) {
                // This code will update how many times number appears
                countNumbers.set(number, countNumbers.get(number) + 1);
            }
        }
    }


