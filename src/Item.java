package src;


public class Item {
    private String line;
    private Item next,prev;

    public Item(String line){
        this.line=line;
    }

    public void setLine(String line){
        this.line=line;
    }

    public String getLine(){
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