package co.edu.unaula.DataStructure.nodes;

public class Node {
    String data;
    Node next;
    public Node(String data){
        this.data = data;
        next = null;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

