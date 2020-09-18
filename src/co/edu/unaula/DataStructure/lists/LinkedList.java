package co.edu.unaula.DataStructure.lists;
import co.edu.unaula.DataStructure.nodes.NodeLinkedList;

public class LinkedList {
    private NodeLinkedList tail;
    private NodeLinkedList head;
    private NodeLinkedList newNode;
    public LinkedList(){
        tail = null;
        head = null;
    }
    public LinkedList addFirst(Object data){
        try {
            newNode = new NodeLinkedList(data);
            if(tail == null && head == null){
                tail = newNode;
                head = newNode;
            }
            else{
                newNode.setNextElement(tail);
                tail.setPreviousElement(newNode);
                tail = newNode;
            }
            return  this;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    public LinkedList addLast(Object data){
        try {
            newNode = new NodeLinkedList(data);
            if(tail == null && head == null){
                tail = newNode;
                head = newNode;
            }
            else{
                head.setNextElement(newNode);
                newNode.setPreviousElement(head);
                head = newNode;
            }
            return  this;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    public  void printTail(){
        try{
            NodeLinkedList current = tail;
            String text;
            while (current != null){
                int sizeString[] = new int[2];

                text = "Previous Element ";
                if(current.getPreviousElement() == null){
                    text = text + " null";
                }
                else{
                    sizeString[0] = current.getPreviousElement().toString().length();
                    text = text + current.getPreviousElement().getData().toString() + "---> Previus " +
                           "Node" + current.getPreviousElement().toString().substring(48,sizeString[0]) ;
                }
                text = text + "\r\nData " + current.getData().toString() + "\r\nNext Element ";

                if(current.getNextElement() == null){
                    text = text + "null";
                }
                else{
                    sizeString[1] = current.getNextElement().toString().length();
                    text = text + current.getNextElement().getData().toString() + "---> Next "+
                            "Node" + current.getNextElement().toString().substring(48,sizeString[1]);
                }
                System.out.println(text + "\r\n");
                current = current.getNextElement();
            }
        }
        catch (Exception ex){
            throw ex;
        }
    }
    //49,57
    //48,57
}
