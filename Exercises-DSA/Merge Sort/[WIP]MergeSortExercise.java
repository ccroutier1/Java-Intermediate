import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Bendana_Merge  {

    static String sortingType = "";
    static String[] studentNames = new String[20];
    static String[] studentGenders = new String[20];
    static String[] enrolledCourse = new String[20];
    static String[] yearLevel = new String[20];
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        readFile("student.txt");

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

// Sorting Choices based on type 
            switch (sortingChoice) {
                case 1:
                    System.out.println("Sorting by Name..");
                    sortingType = "Name";
                    break;

                case 2:
                    System.out.println("Sorting by Gender..");
                    sortingType = "Gender";
                    break;

                case 3:
                    System.out.println("Sorting by Course..");
                    sortingType = "Course";
                    break;

                case 4:
                    System.out.println("Sorting by Year Level..");
                    sortingType = "Year Level";
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    isSort = false;
                    break;

                default:
                    System.out.println("Invalid Choice.");
                    isSort = false;
            }

            if(isSort) {
                mergeSortDivide(0, count - 1, sortingChoice);
                displayStudentList();
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

        } catch (IOException e) {
            System.out.println("File not Found");
        }
    }

    static void mergeSortDivide(int left, int right, int choice) {

        if(left < right) {
            int mid = (left + right) / 2;

            mergeSortDivide(left, mid, choice);
            mergeSortDivide(mid + 1, right, choice);
            mergeSortCombine(left, mid, right, choice);
        }
    }


    static void mergeSortCombine(int left, int mid, int right, int choice) {
        int l = left;
        int m = mid + 1;
        int i = 0;

        String[] tempName = new String[right - left + 1];
        String[] tempGender = new String[right - left + 1];
        String[] tempEnrolledCourse = new String[right - left + 1];
        String[] tempYearLevel = new String[right - left + 1];

        while (l <= mid && m <= right) {
            String val1 = getField(l, choice);
            String val2 = getField(m, choice);

            if(val1.compareTo(val2) <= 0) {
                tempName[i] = studentNames[l];
                tempGender[i] = studentGenders[l];
                tempEnrolledCourse[i] = enrolledCourse[l];
                tempYearLevel[i] = yearLevel[l];
                l++;
            } else {
                tempName[i] = studentNames[m];
                tempGender[i] = studentGenders[m];
                tempEnrolledCourse[i] = enrolledCourse[m];
                tempYearLevel[i] = yearLevel[m];
                m++;
            }
            i++;
        }
        while (l <= mid) {
            tempName[i] = studentNames[l];
            tempGender[i] = studentGenders[l];
            tempEnrolledCourse[i] = enrolledCourse[l];
            tempYearLevel[i] = yearLevel[l];
            l++; i++;
        }
        while (m <= right) {
            tempName[i] = studentNames[m];
            tempGender[i] = studentGenders[m];
            tempEnrolledCourse[i] = enrolledCourse[m];
            tempYearLevel[i] = yearLevel[m];
            m++; i++;
        }

        for (int x = 0; x < i; x++) {
            studentNames[left + x] = tempName[x];
            studentGenders[left + x] = tempGender[x];
            enrolledCourse[left + x] = tempEnrolledCourse[x];
            yearLevel[left + x] = tempYearLevel[x];
        }
    }

    static String getField(int index, int choice) {
        if(choice == 1) return studentNames[index];
        if (choice == 2) return studentGenders[index];
        if (choice == 3) return enrolledCourse[index];
        return yearLevel[index];
    }

    static void displayStudentList() {
        System.out.println("\n==== SORTED DATA [Sorted by " + sortingType + "] ====");
        for (int i = 0; i < count; i++) {
            System.out.println(
                    studentNames[i] + ", " + studentGenders[i] +
                    ", " + enrolledCourse[i] + ", " + yearLevel[i]);
        }
        System.out.println();
    }
}
