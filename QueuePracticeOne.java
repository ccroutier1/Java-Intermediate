import java.util.LinkedList;
import java.util.Queue;

// Printer Queue using Queue
public class QueuePracticeOne {

    public static void printDocuments(Queue<String> printQueue) {
        while(!printQueue.isEmpty()) {
            System.out.println("Printing: " + printQueue.poll());
        }
    }
    public static void main(String[] args) {
        Queue<String> printerQueue = new LinkedList<>();
        printerQueue.add("Thesis.pdf");
        printerQueue.add("Assignment.docx");
        printerQueue.add("Resume.pdf");
        printerQueue.add("Notes.txt");
        printerQueue.add("Report.docx");

        printDocuments(printerQueue);
        }
}
