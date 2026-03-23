import java.util.Scanner;

public class TDArrayOne {

        public static void rowSum(int[][] matrix) {

            for(int i = 0; i < matrix.length; i++) {
                int sum = 0;
                for (int j = 0; j < matrix.length; j++) {
                    sum += matrix[i][j];
                }
                System.out.println("Row " + (i + 1) + " sum: " + sum);
            }
        }


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[][] matrix = new int[3][3];
            System.out.println("Enter 9 numbers: ");

            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    matrix[i][j] = input.nextInt();
                }
            }
            rowSum(matrix);
        }
}
