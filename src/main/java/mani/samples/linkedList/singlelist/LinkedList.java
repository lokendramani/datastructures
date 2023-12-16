package mani.samples.linkedList.singlelist;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public Node addFirst(Node node){
        node.next = this.head;
        this.head = node;
        return head;
    }
    public void addLast(Node node){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void printList(){
        Node node = head;
        System.out.print("head->");
        while(node != null){
            System.out.print(node.data+"=>");
            node = node.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        LinkedList list = new LinkedList();
        list.addFirst(node1);
        list.addFirst(node2);
        list.addFirst(node3);
        list.addFirst(node4);
        list.addFirst(node5);
        list.printList();
        Node node6 = new Node(6);
        list.addLast(node6);
        list.printList();
        Node node7 = new Node(7);
        list.addLast(node7);
        list.printList();
        list.delete(2);
        list.printList();
        list.delete(7);
        list.printList();
        list.delete(5);
        list.printList();
        list.delete(7);
        list.delete(4);
        list.delete(3);
        list.delete(1);
        list.delete(6);
        list.printList();
        list.delete(6);
    }

    private void delete(int i) {
        Node temp = head;
        Node prev = null;
        while(temp != null && temp.data != i){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null)
            return;
        if(temp != head){
            prev.next = temp.next;
        }else if(temp == head){
            head = head.next;
        }
        if(temp != null)
            temp.next = null;

    }
}
