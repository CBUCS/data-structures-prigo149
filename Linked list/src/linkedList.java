import java.util.ArrayList;

public class linkedList {
    public static linkedList list;

    public static void main(String[] args) {

        list = new linkedList();

        // add elements to LinkedList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Print list:\t" + list);
        System.out.println("Size of the list\t:" + list.size());
        System.out.println("Three elements:\t" + list.get(3) + "(get element at index 3)");
        System.out.println("Remove an element\t" + list.remove(2) + " (element removed)");
        System.out.println("Three elements): \t" + list.get(3) + " (get element from index 3)");
        System.out.println("Size of the list: \t" + list.size());
        System.out.println("Print again:List:\t" + list);
    }

}

}
