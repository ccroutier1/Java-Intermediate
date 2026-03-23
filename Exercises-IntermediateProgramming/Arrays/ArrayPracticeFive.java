import java.util.Scanner;


//Reversing Array Numbers using ARRAY

public class ArrayPracticeFive {
    public static void reverseArray(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;


        while(start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        System.out.println("Enter 6 numbers: ");

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        reverseArray(numbers);
        System.out.println("Reverse Array");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
