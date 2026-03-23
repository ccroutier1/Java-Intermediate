


public class ArrayPracticeTwo {

        public static void main(String[] args)  {
            //This array will store 100 random integers
            int[] randomNumbers = new int[100];

            //This array will count how many times number from 0 to 9 appear
            int[] countNumbers = new int[10];

            for(int i = 0; i < 100; i++) {
                //The Math.random it generates random value greater than or equal to 0.0 and less than 1.0
                randomNumbers[i] = (int)(Math.random() * 10);
            }
            //It checks each number in the randomNumbers Array
            for(int i = 0; i < randomNumbers.length; i++) {
                //It compares the number with value 0 to 9
                for(int num = 0; num < 10; num++) {
                    if(randomNumbers[i] == num){
                        countNumbers[num]++;

                    }
                }
            }
            //This will print the results of how many times each number occured
            for(int i = 0; i < 10; i++) {
                System.out.println(i + " occurs " + countNumbers[i] + " times");

            }
        }

    }
