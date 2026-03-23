
import java.util.LinkedList;

//Problem 5 - Data Structure and Algorithms LinkedList 1.3 ver
public class LinkedListThree {
    static LinkedList<Integer> randomNumbers = new LinkedList<>();
    static LinkedList<Integer> countNumbers = new LinkedList<>();

    public static void main(String[]args) {
        
        Numbers(randomNumbers, countNumbers);
        for(int i = 0; i < randomNumbers.size(); i++) {
            countOccurrence(countNumbers, randomNumbers.get(i));
        }
        printOccurrence();

    }
    static void Numbers(
        LinkedList<Integer> randomNumbers,
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
        
    static int countOccurrence(LinkedList<Integer> countNumbers, int numbers) {
            countNumbers.set(numbers, countNumbers.get(numbers) + 1);
            return countNumbers.get(numbers);
    }
    static void printOccurrence() {
        for(int i = 0; i < countNumbers.size(); i++) {
            System.out.println(i + " occurs " + countNumbers.get(i) + " times");
        }
    }
}
