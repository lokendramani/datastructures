package mani.samples.linkedList.singlelist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());

        System.out.println("\nLinked List:");
        myLinkedList.printList();
        System.out.println("After Prepend 4");
        myLinkedList.prepend(4);
        myLinkedList.printList();
        System.out.println("After Prepend 5");
        myLinkedList.prepend(5);
        myLinkedList.printList();
        System.out.println("After Prepend 6");
        myLinkedList.prepend(6);
        myLinkedList.printList();
        //add few more node
        myLinkedList.prepend(7);
        myLinkedList.prepend(8);
        myLinkedList.prepend(9);
        myLinkedList.prepend(10);
        // list should be 10->9->8->7->6->5->4;
        myLinkedList.printList();
        System.out.println("Middle value is:"+myLinkedList.findMiddleNode().value);
    }
}
