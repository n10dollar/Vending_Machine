package VendingMachineFinal;

public class VendingMachine {

    //fields
    private static final int VENDING_MACHINE_CAPACITY=100;
    private String vendingMachineName;

    private PriorityQueue stockItems;
    private SoldItem[] soldItems;
    private ReceiptLinkedList receipts;

    private int numOfSoldItem=0;

    //constructors
    VendingMachine(String vendingMachineName) {
        this.vendingMachineName=vendingMachineName;
        stockItems = new PriorityQueue();
        soldItems=new SoldItem[VENDING_MACHINE_CAPACITY];
        receipts=new ReceiptLinkedList();
    }
    VendingMachine() {
        this.vendingMachineName="Vending Machine";
        stockItems = new PriorityQueue();
        soldItems=new SoldItem[VENDING_MACHINE_CAPACITY];
        receipts=new ReceiptLinkedList();
    }



    //getters
    public String getVendingMachineName() {
        return vendingMachineName;
    }



    //vendingMachine operation methods
    public void addSupply(StockItem item) {

        StockItem itemInVendingMachine = null;
        PriorityQueue temp = new PriorityQueue();
        while(!stockItems.isEmpty()) {
            if (stockItems.peek().getName().equalsIgnoreCase(item.getName())) {
                itemInVendingMachine = stockItems.peek();
                break;
            }

            temp.enqueue(stockItems.dequeue());
        }
        while(!temp.isEmpty()) { stockItems.enqueue(temp.dequeue()); }


        //item isn't in stock
        if(itemInVendingMachine==null)
            stockItems.enqueue(item);
        else
            itemInVendingMachine.increaseQuantityBy(item.getQuantity());

    }
    public void buy(String itemName, int quantityBought, int customerID) {

        PriorityQueue temp = new PriorityQueue();
        while(!stockItems.peek().getName().equalsIgnoreCase(itemName)) { temp.enqueue(stockItems.dequeue()); }
        StockItem purchasedItem = stockItems.peek();
        while(!temp.isEmpty()) { stockItems.enqueue(temp.dequeue()); }


        //item isn't in stock
        if(purchasedItem==null)
            System.out.println("We don't have " + quantityBought + " of " + itemName + " in stock.");
        else {
            SoldItem newestSoldItem = new SoldItem(purchasedItem, quantityBought);
            receipts.addFirst(new Receipt(newestSoldItem, customerID));
            soldItems[numOfSoldItem++] = newestSoldItem;
            purchasedItem.decreaseQuantityBy(quantityBought);

        }
    }


    //show methods
    public void showStockSupplies() {
        System.out.println("All stock supplies: ");
        System.out.println(stockItems);
    }
    public void showSoldItems() {
        System.out.println("All sold  items: ");
        for(SoldItem item : soldItems) {
            if(item!=null) System.out.println(item);
        }
    }
    public void showReceipts(int customerID) {
        Node currentNode = receipts.getFirst();
        while(currentNode != null) {
            if(currentNode.getReceipt().getCustomerID() == customerID) System.out.println(currentNode.getReceipt());
            currentNode = currentNode.getNextNode();
        }
    }
    public void showAllReceipts() {
        System.out.println("All receipts: ");
        Node currentNode = receipts.getFirst();
        while(currentNode != null) {
            System.out.println(currentNode.getReceipt());
            currentNode = currentNode.getNextNode();
        }
    }
}
