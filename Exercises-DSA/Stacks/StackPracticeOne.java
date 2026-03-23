import java.util.Scanner;
import java.util.Stack;

// Reverse Words using Stacks

public class StackPracticeOne {

    public static String reverseWord(String word) {
        Stack<Character> stack = new Stack<>();


        for(int i = 0; i < word.length(); i++){
            stack.push(word.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.nextLine();
        String result = reverseWord(word);

        System.out.println("Reversed Word: " + result);
    }
}
