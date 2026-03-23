import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayPracticeSix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("How many food you want to enter: ");
        size = input.nextInt();
        foods = new String[size];

        for(int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = input.nextLine();
        }
        for(String food : foods) {
            System.out.println(food);
        }
    }
}
