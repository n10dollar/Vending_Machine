package VendingMachineFinal;

public class LinkedList {

    Node head;

    //bigger price = higher priority
    LinkedList() { head = null; }

    private class Node {
        StockItem data;
        Node nextNode;

        Node(StockItem data) {
            this.data=data;
            nextNode=null;
        }

        @Override
        public String toString() { return data.toString(); }
    }

    public void addFirst(StockItem data) {
        Node newestNode = new Node(data);
        if(this.isEmpty())
            head = newestNode;
        else orderList(newestNode);
    }
    public StockItem removeFirst() {
        if(head == null) return null;
        Node oldHead = head;
        head = head.nextNode;
        return oldHead.data;
    }
    public StockItem getFirst() {
        if(head == null) return null;
        return head.data;
    }


    private void orderList(Node newestNode) {
        Node currentNode = head;
        Node prevNode = null;

        while(currentNode != null && currentNode.data.getCost() > newestNode.data.getCost()) {
            prevNode = currentNode;
            currentNode = currentNode.nextNode;
        }

        if(currentNode == null)
            prevNode.nextNode = newestNode;
        else {
            if(prevNode == null) {
                newestNode.nextNode = head;
                head = newestNode;
            }
            else {
                newestNode.nextNode = currentNode;
                prevNode.nextNode = newestNode;
            }
        }
    }


    @Override
    public String toString() {
        String listPrintout = "";
        Node currentNode = head;
        while(currentNode != null) {
            listPrintout += currentNode.toString() + "\n";
            currentNode = currentNode.nextNode;
        }
        return listPrintout;
    }


    public boolean isEmpty() {
        if(head == null) return true;
        else return false;
    }


}
