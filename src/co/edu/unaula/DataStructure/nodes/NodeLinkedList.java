package co.edu.unaula.DataStructure.nodes;

public class NodeLinkedList {
    private  NodeLinkedList previousElement;
    private Object data;
    private  NodeLinkedList NextElement;

    public NodeLinkedList(Object data) {
        this.previousElement = null;
        this.data = data;
        this.NextElement = null;
    }
    public NodeLinkedList getPreviousElement() {
        return previousElement;
    }
    public void setPreviousElement(NodeLinkedList previousElement) {
        this.previousElement = previousElement;
    }
    public Object getData() {
        return data;
    }
    public NodeLinkedList getNextElement() {
        return NextElement;
    }
    public void setNextElement(NodeLinkedList nextElement) {
        NextElement = nextElement;
    }
}
