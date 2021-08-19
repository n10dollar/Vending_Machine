package VendingMachineFinal;

public class PriorityQueue {

    private LinkedList list;

    //max priority queue
    PriorityQueue() {
        list = new LinkedList();
    }

    public void enqueue(StockItem data) {
        list.addFirst(data);
    }
    public StockItem dequeue() {
        if(list.getFirst() == null)
            return null;
        return list.removeFirst();
    }
    public StockItem peek() {
        return list.getFirst();
    }

    @Override
    public String toString() { return list.toString(); }

    public boolean isEmpty() { return list.isEmpty(); }

}
