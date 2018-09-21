import java.util.LinkedList;


public class Deque {
    public static void main(String[] args) {
        Deque<String> deque=new LinkedList<>();

        deque.add("One");
        deque.addFirst("Two");
        deque.addLast("Three");
        deque.offer("Four");
        deque.offerFirst("Five");
        deque.offerLast("Six");
        deque.push("Seven");

        System.out.println("Elements in deque: "+deque);
        System.out.println();

        System.out.println("element() : "+deque.element());
        System.out.println("getFirst() : "+deque.getFirst());
        System.out.println("getLast() : "+deque.getLast());
        System.out.println("peek() : "+deque.peek());
        System.out.println("peekFirst() : "+deque.peekFirst());
        System.out.println("peekLast() : "+deque.peekLast());


        System.out.println();

        System.out.println("remove() : "+deque.remove());
        System.out.println("Elements in deque after removal : "+deque);

        System.out.println("removeFirst() : "+deque.removeFirst());
        System.out.println("Elements in deque after removal : "+deque);

        System.out.println("removeLast() : "+deque.removeLast());
        System.out.println("Elements in deque after removal : "+deque);

        System.out.println("poll() : "+deque.poll());
        System.out.println("Elements in deque after removal : "+deque);

        System.out.println("pollFirst() : "+deque.pollFirst());
        System.out.println("Elements in deque after removal : "+deque);

        System.out.println("pollLast() : "+deque.pollLast());
        System.out.println("Elements in deque after removal : "+deque);

        System.out.println("pop() : "+deque.pop());
        System.out.println("Elements in deque after removal : "+deque);
    }


}
