public class DoublyLinkedList{
    public static void main(String[] args){
    DLL list = new DLL();
    list.insertionAtFirst(3);
    list.insertionAtFirst(7);
    list.traverseForward();
    }
}

class DLL{
    private Node head;
    private Node tail;

    private class Node {

        private int val;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.val = value;
            this.next = null;
            this.prev = null;
        }

    }

    public void insertionAtFirst(int data){
        Node temp = new Node(data);
        if(head == null)
        {
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    public void traverseForward(){
    Node current = head;
    while (current != null) {
        System.out.print(current.val + " ");
        current = current.next;
    }
}
}