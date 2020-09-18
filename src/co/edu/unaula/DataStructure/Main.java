package co.edu.unaula.DataStructure;
import co.edu.unaula.DataStructure.lists.List;
import co.edu.unaula.DataStructure.lists.LinkedList;


import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int response[] = new int[4];

        String element;
        List simpleList = new List();
        LinkedList linkedList = new LinkedList();
        JOptionPane.showMessageDialog(null,"Welcome to my App! \n" + "In this app, you can save elements");

       while (response[3] !=4){
           switch (response[3]){
               case 0:
                   response[3] = Integer.parseInt(JOptionPane.showInputDialog("Please enter: \n" +
                           "1: Simple List \n" +
                           "2: Double List \n" +
                           "3: Print List \n" +
                           "4: exit"));
                   break;
               case 1:
                   response[0] = Integer.parseInt(JOptionPane.showInputDialog("if you want enter a new element, please enter: \n" +
                           "1: yes \n" +
                           "0: no"));
                   while (response[0] == 1) {
                       element = JOptionPane.showInputDialog("Enter the new element");
                       simpleList.addNode(element);
                       response[0] = Integer.parseInt(JOptionPane.showInputDialog("if you want enter a new element, please enter: \n" +
                               " 1: yes \n" +
                               " 0: no"));
                   }
                   response[3] = 0;
                   break;
               case 2:
                   response[0] = Integer.parseInt(JOptionPane.showInputDialog("if you want enter a new element, please enter: \n" +
                           " 1: yes \n" +
                           " 0: no"));

                   while (response[0] == 1) {
                       response[1] = Integer.parseInt(JOptionPane.showInputDialog("In which position do you want to put it \n"
                               + "1: Head \n" +
                               "2: Tail"));
                       if(response[1] != 1 && response[1] != 2) {
                           JOptionPane.showMessageDialog(null,"Invalid Number");

                       }
                       if(response[1] == 1){
                           element = JOptionPane.showInputDialog("Enter the new element");
                           linkedList.addFirst(element);
                       }
                       if(response[1] == 2) {
                           element = JOptionPane.showInputDialog("Enter the new element");
                           linkedList.addLast(element);
                       }

                       response[0] = Integer.parseInt(JOptionPane.showInputDialog("if you want enter a new element, please enter: \n" +
                               " 1: yes \n" +
                               " 0: no"));
                   }
                   response[3] = 0;
                   break;

               case 3:
                   response[2] = Integer.parseInt(JOptionPane.showInputDialog("What list do you want print? \n" +
                           "1: simple list \n" +
                           "2: linked list \n" +
                           "3: the two lists"));

                   switch (response[2]){
                       case 1:
                           simpleList.printList();
                           break;
                       case 2:
                           linkedList.printTail();
                           break;
                       case 3:
                           simpleList.printList();
                           linkedList.printTail();
                           break;
                   }
                   response[3] = 0;
                   break;

               default:
                   JOptionPane.showMessageDialog(null, "Invalid option!");
                   response[3] = 4;
                   break;
           }
       }
    }
}
