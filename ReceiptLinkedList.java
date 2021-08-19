package VendingMachineFinal;

import VendingMachineInitial.Receipt;

public class ReceiptLinkedList {

    private Node head;

    public ReceiptLinkedList() {
        head=null;
    }

    //change methods
    public void addFirst(Receipt receipt) {
        Node newestNode = new Node(receipt);
        if(head != null) newestNode.setNextNode(head);
        head = newestNode;
    }
    public void addFirst(Node newestNode) {
        if(head != null) newestNode.setNextNode(head);
        head = newestNode;
    }
    public void removeFirst() { head=head.getNextNode(); }



    //get methods
    public Node getFirst() { return head; }



    //show methods
    public void printList() {
        Node node = head;
        while(node.getNextNode() != null) {
            System.out.println(node);
            node = node.getNextNode();
        }
        System.out.println(node);
    }



    //info methods
    public int size() {
        int size=0;
        Node currentNode = head;
        while(currentNode != null) {
            size++;
            currentNode = currentNode.getNextNode();
        }
        return size;
    }

}


class Node {
    private Receipt receipt;
    private Node nextNode;

    Node(Receipt receipt) {
        this.receipt=receipt;
        nextNode=null;
    }

    //getters
    public Receipt getReceipt() { return receipt; }
    public Node getNextNode() { return nextNode; }

    //setters
    public void setNextNode(Node nextNode) { this.nextNode = nextNode; }

    @Override
    public String toString() { return receipt.toString(); }
}
