package mani.samples.linkedList.singlelist;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;

    }
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node findMiddleNode(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node removeFirst(){
        Node temp = head;
        if(length == 0){
            return null;
        }else{
            head = head.next;
            temp.next = null;

        }
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;

    }
    public Node removeLast(){
        if(length == 0)
            return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next =null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }
    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
