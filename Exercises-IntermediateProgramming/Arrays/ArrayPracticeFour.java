import java.util.Scanner;

//Count Total Even Numbers using 1D ARRAY

public class ArrayPracticeFour {
    public static int countEven(int[] numbers) {
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers  = new int[8];

        System.out.println("Enter 8 numbers: ");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

        }
        int result = countEven(numbers);
        System.out.println("Total even numbers: " + result);
    }
}
