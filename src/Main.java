package src;

public class Main {

    public static void main(String[] args) {
        linkedList list = new linkedList();


        list.insertAfter(new Item("AHMAD"));
        list.insertAfter(new Item("MONJED"));
        list.insertAfter(new Item("NIDAL"));

        list.printLine();
        list.moveBack();
        list.moveNext();
        list.printLine();
        list.moveNext();
        list.printLine();
        list.moveBack();
        list.printLine();


    }

}
