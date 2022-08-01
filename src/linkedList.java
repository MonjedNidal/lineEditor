package src;

public class linkedList {

    private Item root;


    public void insertBefore(Item item) {
        if (root == null) {
            root = item;
        } else {
            Item previous = root.getPrev();
            root.setPrev(item);
            item.setNext(root);
            item.setPrev(previous);
            if (previous != null){
                previous.setNext(item);
            }else {

            }
        }
    }

    public void print() {
        Item current;
        for (current = root; current != null; current = current.getNext()) {
            System.out.println(current.getName());
        }
    }
}
