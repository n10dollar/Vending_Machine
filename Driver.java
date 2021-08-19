package VendingMachineFinal;

public class Driver {
    public static void main(String[] args){
        Store store = new Store();

        store.addVendingMachine("Drinks");
        store.addVendingMachine("Snacks");

        StockItem candies = new StockItem("Candies", 150, 1);
        StockItem candies1 = new StockItem("Candies", 150, 1);
        StockItem water = new StockItem("Water", 200, 5);
        StockItem cookies = new StockItem("Cookies", 150, 3);
        StockItem soda = new StockItem("Soda", 100, 10);

        store.addSupply(candies);
//        store.addSupply(candies1);
//        store.addSupply(water);
//        store.addSupply(cookies);
//        store.addSupply(soda);

//        Customer Bob = new Customer("Bob");
//        int bobCID = 0;

//        bobCID = store.addCustomer(Bob);
//        store.buy(bobCID, "Water", 2);
//        store.getReceipts(bobCID);

//        Customer Dan = new Customer("Dan");
//        int danCID = 0;
//
//        danCID = store.addCustomer(Dan);
//        store.buy(danCID, "Water", 1);
//        store.buy(danCID, "Soda", 2);
//        store.buy(danCID, "Cookies", 3);
//        store.buy(danCID, "Candies", 4);
//        store.getReceipts(danCID);

        store.showStockSupplies();

    }
}