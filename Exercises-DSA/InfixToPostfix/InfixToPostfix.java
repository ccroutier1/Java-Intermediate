import java.util.Stack; 

public class InfixToPostfix {

    // Method that returns the precedence (priority) of operators
    public static int Precedence(char ch) {

        // + and - have lowest priority
        if(ch == '+' || ch == '-') return 1;

        // * and / have higher priority than + -
        if(ch == '*' || ch == '/') return 2;

        // ^ has the highest priority
        if(ch == '^') return 3;

        // if the character is not an operator
        return -1;
    }

    // Method that converts an INFIX expression to POSTFIX
    public static String Convert(String Infix) {

        // Create a stack to store operators
        Stack<Character> stack = new Stack<>();

        // This will store the final postfix expression
        String Postfix = "";

        // Loop through every character in the infix expression
        for(int i = 0; i < Infix.length(); i++) {

            // Get the current character from the string
            char ch = Infix.charAt(i);

            // If the character is a letter or number (operand)
            if (Character.isLetterOrDigit(ch)){

                // Add it directly to the postfix expression
                Postfix += ch;
            }

            // If the character is an opening parenthesis
            else if(ch == '('){

                // Push it into the stack
                stack.push(ch);
            }

            // If the character is a closing parenthesis
            else if(ch == ')') {

                // Pop operators from stack until '(' is found
                while (!stack.empty() && stack.peek() != '(') {

                    // Add popped operator to postfix
                    Postfix += stack.pop();
                }

                // Remove the '(' from the stack
                stack.pop();
            }

            // If the character is an operator (+, -, *, /, ^)
            else{

                // Pop operators from stack while they have
                // higher or equal precedence
                while(!stack.isEmpty() && Precedence(stack.peek()) >= Precedence(ch)) {

                    Postfix += stack.pop();
                }

                // Push the current operator to the stack
                stack.push(ch);
            }
        }

        // After scanning the expression, pop remaining operators
        while (!stack.isEmpty()) {

            Postfix += stack.pop();
        }

        // Return the final postfix expression
        return Postfix;
    }

    public static void main(String[] args) {

        // Example infix expression
        String Infix = "A+B*C/D+E%F";

        // Convert infix to postfix
        String Postfix = Convert(Infix);

        // Print the result
        System.out.println("Postfix: " + Postfix);
    }

}
