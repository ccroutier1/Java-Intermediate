import java.util.Scanner;
public class StringPracticeOne {
}


class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- MENU ---");
        System.out.println("1. Count Vowels and Consonants");
        System.out.println("2. Manual String Reversal");
        System.out.println("3. Digit Sum in String");
        System.out.print("\nPick a challenge (1-3): ");

        int choice = sc.nextInt();
        sc.nextLine(); // Clear buffer

        switch (choice) {
            case 1:
                // Problem: Count how many vowels and consonants are in a string.
                System.out.print("Enter a string: ");
                String input1 = sc.nextLine().toLowerCase();
                int vowels = 0, consonants = 0;

                for (int i = 0; i < input1.length(); i++) {
                    char c = input1.charAt(i);

                    if (c >= 'a' && c <= 'z') { // Check if it's a letter
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                            vowels++;
                        } else {
                            consonants++;
                        }
                    }
                }
                System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
                break;

            case 2:
                // Problem: Reverse a string.
                System.out.print("Enter text to reverse: ");
                String input2 = sc.nextLine();
                String reversed = "";

                for (int i = input2.length() - 1; i >= 0; i--) {
                    reversed += input2.charAt(i);
                }
                System.out.println("Reversed: " + reversed);
                break;

            case 3:
                // Problem: Extract numbers from a string and find their sum.
                // Example: "abc123" -> 1 + 2 + 3 = 6
                System.out.print("Enter a string with numbers: ");
                String input3 = sc.nextLine();
                int sum = 0;

                for (int i = 0; i < input3.length(); i++) {
                    char c = input3.charAt(i);
                    if (c >= '0' && c <= '9') {
                        // Character '0' has ASCII value 48.
                        // Subtracting '0' converts the char digit to an actual int.
                        sum += (c - '0');
                    }
                }
                System.out.println("Sum of digits: " + sum);
                break;

            default:
                System.out.println("Invalid selection.");
        }
        sc.close();
    }
}

class CountUpperLowerDigits {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String str = input.nextLine();
        int upper = 0;
        int lower = 0;
        int digit = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                upper++;
            }else if(ch >= 'a' && ch <= 'z'){
                lower++;
            }else if(ch >= '0' && ch <= '9'){
                digit++;
            }
        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digit);
    }
}

class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("Without duplicates: " + result);
    }
}

class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String str = sc.nextLine();

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Most frequent character: " + maxChar);
    }
}

