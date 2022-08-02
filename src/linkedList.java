package src;

public class linkedList {

    private Item root;


    public void insertBefore(Item node) {
        if (root == null) {
            root = node;
        } else {
            Item previous = root.getPrev();
            root.setPrev(node);
            node.setNext(root);
            node.setPrev(previous);
            if (previous != null){ //if the root is the first item in the list.
                previous.setNext(node);
            }
        }
    }

    public void insertAfter(Item node){
        if (root == null){
            root = node;
        }else{
            Item after = root.getNext();
            root.setNext(node);
            node.setPrev(root);
            if (after != null){ // check if the root isn't the last item in the list.
                node.setNext(after);
                after.setPrev(node);
            }
        }
    }

    public void moveNext(){
        if (root != null){
            if (root.getNext() != null){
                root = root.getNext();
            }else {
                System.out.println("Valid input, list is empty or the root is the last item!");
            }
        }
    }

    public void moveBack(){
        if (root != null){
        if (root.getPrev() != null){
            root = root.getPrev();
        }else {
            System.out.println("Valid input, list is empty or the root is the first item!");
        }
        }
    }

    public void printToTheLast() {
        Item current;
        for (current = root; current != null; current = current.getNext()) {
            System.out.println(current.getLine());
        }
    }

    public void printLine(){
        if (root != null){
            System.out.println(root.getLine());
        }else {
            System.out.println("LinkedList is empty!");
        }
    }

    public void printToStart() {
        Item current;
        for (current = root; current != null; current = current.getPrev()) {
            System.out.println(current.getLine());
        }
    }
}
