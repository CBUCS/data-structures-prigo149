public class newNode {

    newNode next;
    Object data;

    public newNode(Object dataValue) { //defining a constructor
        next = null;
        data = dataValue;
    }

    public newNode(Object dataValue, newNode nextValue) { //new node constructor
        next = nextValue;
        data = dataValue;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object dataValue) {
        data = dataValue;
    }

    public newNode getNext() {
        return next;
    }

    public void setNext(newNode nextValue) {
        next = nextValue;
    }

}
