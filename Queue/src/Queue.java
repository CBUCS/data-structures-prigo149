import java.util.LinkedList;

public class Queue
{
    public static void main(String[] args)
    {
        Queue q = new LinkedList<>();


        for (int i=0; i<5; i++) {        // Adds elements {0, 1, 2, 3, 4} to queue
            q.add(i);
        }
        System.out.println("Elements of queue-"+q); //display elements of queue

        int removeElement = q.remove(); // removing the elements of a Queue
        System.out.println("removed elements :" + removeElement);

        System.out.println(q);

        int top = q.peek();
        System.out.println("top of queue-" + top);

        int size = q.size();
        System.out.println("Size of queue-" + size);
    }
}
