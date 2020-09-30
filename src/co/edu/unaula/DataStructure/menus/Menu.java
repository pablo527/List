package co.edu.unaula.DataStructure.menus;

import javax.swing.*;

public class Menu {
    public int MainMenu (){
        int opcList;
        do {
            opcList = Integer.parseInt(JOptionPane.showInputDialog("Please enter: \n" +
                    "1: Simple List \n" +
                    "2: Double List \n" +
                    "3: Print List \n" +
                    "4: exit"));
            if (opcList > 4 || opcList < 1){
                JOptionPane.showMessageDialog(null,"the list no exists");
            }
        } while (opcList > 4 || opcList < 1 );
        return  opcList;
    }
    public int anotherNode(){
        int newEelement;
        do {
            newEelement = Integer.parseInt(JOptionPane.showInputDialog("if you want enter a new element, please enter: \n" +
                    " 1: yes \n" +
                    " 0: no"));
            if (newEelement != 1 && newEelement != 0 ){
                JOptionPane.showMessageDialog(null,"Invalid Option");
            }
            if( newEelement == 0){
                return newEelement;
            }
        } while (newEelement != 1);

        return newEelement;
    }
    public int headOrTail(){
        int position;
        do {
            position = Integer.parseInt(JOptionPane.showInputDialog("In which position do you want to put it \n"
                    + "1: Head \n" +
                    "2: Tail"));
            if (position < 1 || position > 2){
                JOptionPane.showMessageDialog(null,"Invalid Option");
            }
        } while (position < 1 || position > 2);
        return position;
    }
    public int menuPrint (){
        int listPrint;
        do {
            listPrint = Integer.parseInt(JOptionPane.showInputDialog("What list do you want print? \n" +
                    "1: simple list \n" +
                    "2: linked list \n" +
                    "3: the two lists"));
        } while (listPrint < 1 || listPrint > 3);

        return listPrint;
    }
}
