import java.util.Scanner;

//Problem 1 - TOGGLE CASE
public class ToggleCase {
        static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String result = "";
            
            System.out.print("Input: ");
            String stringInput = input.nextLine();

            for(int i = 0; i < stringInput.length(); i++){

                if (stringInput.charAt(i) >= 'a' && stringInput.charAt(i) <= 'z') {
                    result += stringInput.toUpperCase().charAt(i);
                }
                else if (stringInput.charAt(i) >= 'A' && stringInput.charAt(i) <= 'Z') {
                    result += stringInput.toLowerCase().charAt(i);
                }
                else {
                    result += stringInput.charAt(i);
                }
            }
            System.out.println("Output: " + result);
        }
    }

//Problem 2 - FREQUENCY COUNTER
class FrequencyCounter {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        System.out.print("Input Text: ");
        String inputText = input.nextLine();
        System.out.print("Find Character: ");
        char targetChar = input.next().charAt(0);

        for (char Char : inputText.toCharArray()) {
            if (targetChar == Char) {
                count++;
            }
        }
        System.out.print("Frequency Count: " + count);
    }
}

