
import java.util.Stack;
import java.util.Scanner;

public class InfixToPostfixScanner {
        // Method to determine operator precedence
        public static int Precedence(char ch) {

            if(ch == '+' || ch == '-') return 1; // lowest priority
            if(ch == '*' || ch == '/') return 2; // medium priority
            if(ch == '^') return 3; // highest priority

            return -1;
        }

        // Method to convert INFIX to POSTFIX
        public static String Convert(String Infix) {

            Stack<Character> stack = new Stack<>(); // stack for operators
            String Postfix = ""; // final postfix expression

            // Loop through the infix expression
            for(int i = 0; i < Infix.length(); i++) {

                char ch = Infix.charAt(i); // get current character

                // If character is a letter or number
                if (Character.isLetterOrDigit(ch)){
                    Postfix += ch; // add directly to postfix
                }

                // If opening parenthesis
                else if(ch == '('){
                    stack.push(ch); // push to stack
                }

                // If closing parenthesis
                else if(ch == ')'){

                    // pop until '(' is found
                    while (!stack.empty() && stack.peek() != '(') {
                        Postfix += stack.pop();
                    }

                    stack.pop(); // remove '('
                }

                // If operator (+ - * / ^)
                else{

                    // pop operators with higher or equal precedence
                    while(!stack.isEmpty() && Precedence(stack.peek()) >= Precedence(ch)) {
                        Postfix += stack.pop();
                    }

                    stack.push(ch); // push current operator
                }
            }

            // pop remaining operators
            while (!stack.isEmpty()) {
                Postfix += stack.pop();
            }

            return Postfix;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in); // create scanner object

            // Ask user to input infix expression
            System.out.print("Enter Infix Expression: ");
            String Infix = sc.nextLine();

            // Convert expression
            String Postfix = Convert(Infix);

            // Print result
            System.out.println("Postfix Expression: " + Postfix);

            sc.close(); // close scanner
        }
    }

