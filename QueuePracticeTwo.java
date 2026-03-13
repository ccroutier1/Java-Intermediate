import java.util.Queue;
import java.util.LinkedList;

//Customer Queue using Queue
public class QueuePracticeTwo {

    public static void addCustomer
            (Queue<String> queue, String name) {

        queue.add(name);
        System.out.println("Customer Added: " + name);
    }

    public static void serveCustomer(Queue<String> queue) {

        if(!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        } else {
            System.out.println("No customers in queue.");
        }
    }

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        addCustomer(queue, "Ana");
        addCustomer(queue, "Mark");
        addCustomer(queue, "John");
        serveCustomer(queue);
        serveCustomer(queue);
    }
}