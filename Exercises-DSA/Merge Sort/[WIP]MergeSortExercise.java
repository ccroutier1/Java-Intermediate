import java.io.File;
import java.util.Scanner;

public class Bendana_Merge  {

    static String[] studentNames = new String[20];
    static String[] studentGenders = new String[20];
    static String[] enrolledCourse = new String[20];
    static String[] yearLevel = new String[20];
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sortingChoice;
        do {

            System.out.println("===== MENU =====");
            System.out.println("1. Sort by Name");
            System.out.println("2. Sort by Gender");
            System.out.println("3. Sort by Course");
            System.out.println("4. Sort by Year Level");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            sortingChoice = input.nextInt();
            boolean isSort = true;

            switch (sortingChoice) {
                case 1:
                    System.out.println("Sorting by Name...");
                    break;

                case 2:
                    System.out.println("Sorting by Gender");
                    break;

                case 3:
                    System.out.println("Sorting by Course");
                    break;

                case 4:
                    System.out.println("Sorting by Year Level");
                    break;

                case 5:
                    System.out.println("Exiting program");
                    isSort = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
                    isSort = false;
            }
            
        } while(sortingChoice != 5);

    }

    static void readFile(String filename) {

        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){
                String line = input.nextLine();
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(",");

                if (data.length < 4) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }
                studentNames[count] = data[0].trim();
                studentGenders[count] = data[1].trim();
                enrolledCourse[count] = data[2].trim();
                yearLevel[count] = data[3].trim();

                count++;
            }

            input.close();

        } catch (Exception e) {
            System.out.println("File not Found");
        }
    }
}

