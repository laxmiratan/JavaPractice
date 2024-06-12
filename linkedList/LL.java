package linkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void inserFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertAtEnd(int val){
        if (tail == null){
            inserFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.print("end");
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL first = new LL();
        
        first.inserFirst(2);
        first.inserFirst(3);
        first.inserFirst(4);
        first.insertAtEnd(5);
        first.insertAtEnd(6);
        first.insertAtEnd(7);

        first.display();
    }
}
