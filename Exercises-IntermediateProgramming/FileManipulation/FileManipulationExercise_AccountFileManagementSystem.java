import java.io.*;
import java.util.Scanner;

//Intermediate Programming Task 9 - Enhanced Water District Account File Management System
public class FileManipulationExercise_AccountFileManagementSystem {

    static final String fileName = "WDSAccounts-Saved.txt"; // File used to store all the account data

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int optionChoices;

        do {

            // Menu Options
            System.out.println("\n==== WATER DISTRICT SYSTEM ====");
            System.out.println("1. Add Account Record");
            System.out.println("2. View All Records");
            System.out.println("3. View File Information");
            System.out.println("4. Delete File");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            optionChoices = input.nextInt();
            input.nextLine();

            switch (optionChoices) {
                case 1:
                    addAccount(); // Adding data
                    break;
                case 2:
                    viewRecords(); // Displays all saved data
                    break;
                case 3:
                    fileInfo(); // Shows the File Information
                    break;
                case 4:
                    deleteFile(); // Removes the file
                    break;
                case 5:
                    System.out.println("Program closed");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (optionChoices != 5);
    }

    static void addAccount() {

        Scanner input = new Scanner(System.in);
        char addAnother;

        do {
            try {
                System.out.print("Enter Account Number (XXX-XX-XXXX): ");
                String accountNo = input.nextLine();

                // Checks if the account number format is correct
                if (!validateAccountNo(accountNo)) {
                    System.out.println("Invalid format. Try again!");
                    return;
                }

                System.out.print("Enter Name: ");
                String name = input.nextLine();

                System.out.print("Enter Address: ");
                String address = input.nextLine();

                // get values from the account number
                String zone = getZone(accountNo);
                String classification = getClassification(accountNo);
                String pipe = getPipeSize(accountNo);
                
                FileWriter file = new FileWriter(fileName, true);

                file.write("\nAccount Information:");
                file.write("\nName: " + name + "\n");
                file.write("Address: " + address + "\n");
                file.write("Account Number: " + accountNo + "\n");
                file.write("Zone: " + zone + "\n");
                file.write("Classification: " + classification + "\n");
                file.write("Pipe Size: " + pipe + "\n");

                file.close(); // closes the file after writing

                System.out.println("Record saved successfully!");

            } catch (Exception e) {
                System.out.println("Saving failed.");
            }

            System.out.print("Add another? (Y/N): ");
            addAnother = input.next().charAt(0);
            input.nextLine();

        } while (addAnother == 'Y' || addAnother == 'y');
    }

    static void viewRecords() {

        try {
            File file = new File(fileName);

            // Checks if the file exists first
            if (!file.exists()) {
                System.out.println("No saved records yet.");
                return;
            }

            Scanner reader = new Scanner(file);

            // Checks if the file is empty
            if (!reader.hasNextLine()) {
                System.out.println("No data found.");
                reader.close();
                return;
            }

            System.out.println("\n====== ALL RECORDS ======\n");

            // Print each line in the file
            while (reader.hasNextLine()) {
                String accountData = reader.nextLine();
                System.out.println(accountData);
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("Unable to read file.");
        }
    }

    static void fileInfo() {
        File file = new File(fileName);

        // Checks if the file is existing
        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }

        // Show the File Information
        System.out.println("\n====== FILE DETAILS ======");
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
    }

    static void deleteFile() {
        Scanner input = new Scanner(System.in);
        File file = new File(fileName);

        // Checks before deleting the file
        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }

        System.out.print("Delete file? (Y/N): ");
        char confirmation = input.next().charAt(0);

        if (confirmation == 'Y' || confirmation == 'y') {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Delete failed.");
            }
        } else {
            System.out.println("Cancelled.");
        }
    }

    // Checks the format of account number
    static boolean validateAccountNo(String accountNo) {
        String[] validNum = accountNo.split("-");

        if (validNum.length != 3) return false;
        if (validNum[0].length() != 3) return false;
        if (validNum[1].length() != 2) return false;
        if (validNum[2].length() != 4) return false;

        return true;
    }

    // Gets the zone number(the first 3 digits)
    static String getZone(String accountNo) {
        return accountNo.substring(0, 3);
    }

    // Gets the classification type
    static String getClassification(String accountNo) {
        char option = accountNo.charAt(4);

        switch (option) {
            case '1': return "Residential";
            case '2': return "Commercial";
            case '3': return "Industrial";
            case '4': return "Government";
            default: return "Error Option!";
        }
    }

    // Gets the pipe size value
    static String getPipeSize(String accountNo) {
        char option = accountNo.charAt(5);

        switch (option) {
            case '1': return "1/2";
            case '2': return "3/4";
            case '3': return "1";
            case '4': return "2";
            default: return "Error Option!";
        }
    }
}
