package src;


public class Item {
    private String line;
    private Item next,prev;

    public Item(String name){
        this.line=name;
    }

    public void setName(String name){
        this.line=name;
    }

    public String getName(){
        return line;
    }

    public void setNext(Item next){
        this.next=next;
    }

    public Item getNext(){
        return next;
    }

    public Item getPrev() {
        return prev;
    }

    public void setPrev(Item prev) {
        this.prev = prev;
    }
}