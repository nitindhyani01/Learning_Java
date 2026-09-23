public class SinglyLinkedList {
        public static void main(String[] args) {
            LL list = new LL();
            list.insertionAtFirst(3);
            list.insertionAtFirst(7);
            list.insertionAtFirst(9);
            list.insertionAtFirst(1);
            list.insertionAtLast(63);
            list.insertionAtIndex(27, 3);
            System.out.print(list.deletefirst());
            list.display();
        }

    }

    class LL {

        private Node head;
        private Node tail;

        public int size;

        public LL() {
            this.size = 0;
        }

        public void insertionAtFirst(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;
            if (tail == null) {
                tail = head;
            }
            size += 1;
        }

        public void insertionAtLast(int val) {
            if (tail == null) {
                insertionAtFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }

        public void insertionAtIndex(int val, int index) {
            if (index == 0) {
                insertionAtFirst(val);
                return;
            }
            if (index == size) {
                insertionAtLast(val);
                return;
            }
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node;
        }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public int deletefirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    private class Node {

        private int val;
        private Node next;

        public Node(int value) {
            this.val = value;
        }

        public Node(int value, Node next) {
            this.val = value;
            this.next = next;
        }
    }
}
