package co.edu.unaula.DataStructure;
import co.edu.unaula.DataStructure.lists.List;
import co.edu.unaula.DataStructure.lists.LinkedList;
import co.edu.unaula.DataStructure.menus.Menu;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int opcList;
        int newEelement = 1;
        int posirtion;
        int listPrint;
        String element;
        List simpleList = new List();
        LinkedList linkedList = new LinkedList();
        JOptionPane.showMessageDialog(null,"Welcome to my App! \n" + "In this app, you can save elements");
        Menu menu = new Menu();
        opcList = menu.MainMenu();
       while (opcList !=4){
           switch (opcList){
               case 1:
                   while (newEelement == 1) {
                       element = JOptionPane.showInputDialog("Enter the new element");
                       simpleList.addNode(element);
                       JOptionPane.showMessageDialog(null, "Completed, Node add a Simple list");
                       newEelement = menu.anotherNode();
                   }
                   newEelement = 1;
                   opcList = menu.MainMenu();
                   break;
               case 2:
                   while (newEelement == 1) {
                      posirtion = menu.headOrTail();

                       if(posirtion == 1){
                           element = JOptionPane.showInputDialog("Enter the new element");
                           linkedList.addFirst(element);
                       }
                       if(posirtion == 2) {
                           element = JOptionPane.showInputDialog("Enter the new element");
                           linkedList.addLast(element);
                       }
                       newEelement = menu.anotherNode();
                   }
                   opcList = menu.MainMenu();
                   break;

               case 3:
                   listPrint = menu.menuPrint();

                   switch (listPrint){
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
                   JOptionPane.showMessageDialog(null,"Great!!");
                   break;
               case 4:
                   opcList = 4;
               default:
                   JOptionPane.showMessageDialog(null, "Invalid option!");
                   opcList = menu.MainMenu();
                   break;
           }
       }
    }
}
