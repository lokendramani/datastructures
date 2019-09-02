package mani.samples.linkedList;

public class EmployeeSingleLinkedList {
    EmployeeNode head;
    private int size;

    public void add(Employee employee){
        EmployeeNode newNode= new EmployeeNode(employee);
        newNode.setNext(head);
        head = newNode;
        size++;
        }

        public int getSize(){
        return size;
        }

        public EmployeeNode delete(Employee employee){

            if(isEmpty()){
                return null;
            }else{
                EmployeeNode temp=head;
                head = head.getNext();
                size--;
                temp.setNext(null);
                return temp;
            }


        }
        public boolean isEmpty(){
            if (head == null)
                return true;
            else
                return false;
        }
        public void printList(){
        EmployeeNode current= head;
            System.out.println("HEAD -> ");
        while(current != null){
            System.out.print(current+" -> ");
            current = current.getNext();
        }
            System.out.println("");
        }

    public static void main(String[] args) {
        EmployeeSingleLinkedList list = new EmployeeSingleLinkedList();
        Employee janeJones = new Employee("Jane", "Jones","123");
        Employee johnDoe = new Employee("John", "Doe","456");
        Employee marySmith = new Employee("Mary", "Smith","1223");
        Employee mikeWilliam = new Employee("Mike", "William","3455");

        list.add(janeJones);
        list.add(johnDoe);
        list.add(marySmith);
        list.add(mikeWilliam);
        list.printList();

        list.delete(janeJones);
        list.printList();




    }
}
