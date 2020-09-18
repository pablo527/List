package co.edu.unaula.DataStructure.lists;
import co.edu.unaula.DataStructure.nodes.Node;

public class List {

    Node firstNode;
    Node lastNode;
    Node newNode;
    int size;

    public List(){
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
    }
    private boolean isEmpty() {
        if(size==0){
            return true;
        } else{
            return false;
        }
    }

    public List addNode(String data){
        if(isEmpty()){
            newNode = new Node(data);
            firstNode = newNode;
            lastNode = newNode;
        } else {
            newNode = new Node(data);
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        size ++;
        return  this;
    }

   public void printList(){
        Node current;

        if(!isEmpty()){
            int sizeString;

            current = firstNode;
            System.out.println("The elements are:");
            for(int i=0 ; i<size; i++){
                if ( current.getNext() != null){
                    sizeString = current.getNext().toString().length();
                    System.out.println(current.getData() + "---> Next " +
                            "Node"+ current.getNext().toString().substring(38,sizeString) +  "\n" );
                }else{
                    System.out.println(current.getData() + "---> Next " + "null" +  "\n" );
                }

                current = current.getNext();
            }
        } else {
            System.out.println("the list is empty...");
        }
    }

}
