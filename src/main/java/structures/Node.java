package structures;

public class Node {

    private int key, value;
    private Node next;

    public Node (int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int getKey(){
        return key;
    }
    public int getValue(){
        return value;
    }

    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }

}
