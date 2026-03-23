import java.util.Scanner;

public class ArrayPracticeThree {
//Find the Largest Number using 1D ARRAY
    public static int findLargest(int[] numbers) {
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers [i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers: ");

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int largest = findLargest(numbers);
        System.out.println("Largest Number: " + largest);
    }
}
