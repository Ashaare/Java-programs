package LLClass;

public class ClassLL {
    private Node head;
    private Node tail;
    private int size;
    void addFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value=value;
            this.next = next;
        }
    }
}
