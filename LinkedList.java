public class LinkedList {
    public Node head;
    public Node tail;
    public void addToTail(int data) {
        //your code is here
    	if(this.head==null){
    		this.head.value =data;
    	}else{
    		this.head.next=data;
    		this.tail.value=data;
    	}
    }

    public boolean contains(int value) {
        //your code is here
    }

    public int removeHead() {
        //your code is here
    }

    public void printList() {
        //your code is here
    }

    public int getHead() {
        //your code is here
    }

    public class Node {
        //your code is here
    	int value =(Integer) null;
    	Object next = null;
    }

}