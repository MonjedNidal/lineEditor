package src;

public class Main {

    public static void main(String[] args) {
        linkedList list = new linkedList();

        Item line1 = new Item("Monjed Nidal maswadeh");
        Item line2 = new Item("18 y.o");
        Item line3 = new Item("PTUK");

        list.insertBefore(line1);
        list.insertBefore(line2);
        list.print();
    }

}
