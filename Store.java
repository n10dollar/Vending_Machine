package VendingMachineFinal;

public class Store {

    //fields
    private static final int STORE_CAPACITY=5;
    private static final int MAX_CUSTOMERS=100;

    private String storeName;
    private VendingMachine vendingMachines[];
    private Customer customers[];

    private int numOfVendingMachine;
    private int currentID;

    //constructors
    Store(String storeName) {
        this.storeName=storeName;
        vendingMachines=new VendingMachine[STORE_CAPACITY];
        customers = new Customer[MAX_CUSTOMERS];
    }
    Store() {
        this.storeName="Store";
        vendingMachines=new VendingMachine[STORE_CAPACITY];
        customers = new Customer[MAX_CUSTOMERS];
    }



    //store operation methods
    public int addCustomer(Customer customer) {
        customers[currentID]=customer;
        customer.setCustomerID(currentID);
        return currentID++;
    }
    public void addVendingMachine(String vendingMachineName) {
        if(numOfVendingMachine < STORE_CAPACITY) vendingMachines[numOfVendingMachine++]=new VendingMachine(vendingMachineName);
        else System.out.println("The store's capacity cannot accommodate another vending machine.");
    }
    public void addSupply(StockItem item) {
        VendingMachine correctVendingMachine=null;
        if(item.getName().equalsIgnoreCase("Water") || item.getName().equalsIgnoreCase("Soda"))
            correctVendingMachine=findVendingMachineOfType("Drink");
        else if(item.getName().equalsIgnoreCase("Candies") || item.getName().equalsIgnoreCase("Cookies"))
            correctVendingMachine=findVendingMachineOfType("Snack");

        if(correctVendingMachine != null) correctVendingMachine.addSupply(item);
        else System.out.println("There's no vending machine to store " + item.getName() + ".");
    }
    public void buy(int customerID, String itemName, int quantity) {
        VendingMachine correctVendingMachine=null;
        if(itemName.equalsIgnoreCase("Water") || itemName.equalsIgnoreCase("Soda"))
            correctVendingMachine=findVendingMachineOfType("Drink");
        else if(itemName.equalsIgnoreCase("Candies") || itemName.equalsIgnoreCase("Cookies"))
            correctVendingMachine=findVendingMachineOfType("Snack");

        if(correctVendingMachine!=null) correctVendingMachine.buy(itemName, quantity, customerID);
        else System.out.println("We don't have " + itemName + " in stock.");
    }



    //show methods
    public void showStockSupplies() {
        System.out.println("___STORE___");
        for(VendingMachine vendingMachine : vendingMachines) { if(vendingMachine!=null) vendingMachine.showStockSupplies(); }
    }
    public void getReceipts(int customerID) {
        for(int i=0; i<numOfVendingMachine; i++) { vendingMachines[i].showReceipts(customerID); }
    }



    //helper methods
    private VendingMachine findVendingMachineOfType(String type) {
        //find itemWithName
        for(int i=0; i<numOfVendingMachine; i++) {
            if(vendingMachines[i].getVendingMachineName().toUpperCase().contains(type.toUpperCase()))
                return vendingMachines[i];
        }

        return null;
    }
}
