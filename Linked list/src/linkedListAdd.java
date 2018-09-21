class linkedListAdd {

    private static int counter;
    private newNode head;


    public linkedListAdd() {
    }     // Default constructor

    public void add(Object data) {

        if (head == null) {
            head = new newNode(data); //Initialize newNode
        }

        newNode temp = new newNode(data);
        newNode current = head;

        if (current != null) {


            while (current.getNext() != null) {
                current = current.getNext();  //add element from the last
            }

            // the last newNode's "next" reference set to our new newNode
            current.setNext(temp);
        }
        incrementCounter(); // increase number of elements
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    public Object get(int index) {
        if (index < 0)
            return null;
        newNode current = null;
        if (head != null) {
            current = head.getNext();
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    return null;

                current = current.getNext();
            }
            return current.getData();
        }
        return current;

    }

    // removes the element at the specified position in this list.
    public boolean remove(int index) {

        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;

        newNode current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    return false;

                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            decrementCounter(); //decrease number of elements
            return true;

        }
        return false;
    }

    public int size() {

        return getCounter(); //gives the total number of elements in the list
    }
}

