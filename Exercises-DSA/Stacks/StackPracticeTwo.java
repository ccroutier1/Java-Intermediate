
import java.util.Stack;
import java.util.Scanner;

public class StackPracticeTwo {


        public static boolean isBalanced(String expression) {

            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < expression.length(); i++) {

                char ch = expression.charAt(i);

                if(ch == '(') {
                    stack.push(ch);
                }

                else if(ch == ')') {

                    if(stack.isEmpty()) {
                        return false;
                    }

                    stack.pop();
                }
            }

            return stack.isEmpty();
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter expression: ");
            String exp = input.nextLine();

            if(isBalanced(exp)) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }
        }
    }
