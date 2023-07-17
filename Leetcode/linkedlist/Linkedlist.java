public class Linkedlist {
    private Node head;
    private Node tail;
    private int length;
    
    class Node{
    int value;
    Node next;
     
    Node(int value){
        this.value = value;
    }
}
public Linkedlist(int value){
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length=1;
}

public void println(){
    Node temp=head;
    while(temp != null){
        System.out.println( temp.value);
        temp=temp.next;
    }
}
public void append(int value){
    Node newNode = new Node(value);
    if(length==0){
        head = newNode;
        tail = newNode;
        System.out.println("-->" );
        
       
    }
    else{
        tail.next=newNode;
        tail=newNode;
        
    }
    length++;
}
public Node RemoveLast(){
    if(length==0){
        return null;
    }
    Node temp =head;
    Node pre = head;
    while (temp.next != null) {
        pre = temp;
        temp = temp.next;
    }
    tail =pre;
    tail.next =null;
    length--;
    if (length==0){
        head=null;
        tail = null;
    }
    return temp;
} 
 

    public void getHead(){
        System.out.println("head: "+head.value);
        
    }
    
    public void getTail(){
        System.out.println("tail: "+tail.value);

    }
    public void getLength(){
        System.out.println("length : "+length);

    }

public static void main(String[] args){
    Linkedlist myLinkedList = new Linkedlist(2);
    myLinkedList.append( 9);
    myLinkedList.append(78);
    myLinkedList.append(7);
    myLinkedList.println();
    myLinkedList.RemoveLast();
    myLinkedList.getHead();
    myLinkedList.getTail();
    myLinkedList.getLength();

    myLinkedList.println();
}
}