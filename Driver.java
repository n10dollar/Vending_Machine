public class Driver {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine("Vending Machine", 10);

        StockItem candy = new StockItem(.5, "candy", "Snickers");
        StockItem cookie = new StockItem(1, "cookie", "Famous Amos");
        StockItem cheapWater = new StockItem(1.5, "water", "Dasani");
        StockItem expensiveWater = new StockItem(5, "water", "Fiji");

        vendingMachine.addSupply(candy);
        vendingMachine.addSupply(cookie);
        vendingMachine.addSupply(cheapWater);
        vendingMachine.addSupply(expensiveWater);

        vendingMachine.buyCandy("Snickers");
        vendingMachine.getReceipt();

        vendingMachine.buyCookies("Famous Amos");
        vendingMachine.getReceipt();

        vendingMachine.buyWater("Dasani");
        vendingMachine.getReceipt();

        vendingMachine.showStockSupplies();
        vendingMachine.showSoldItems();
        vendingMachine.showAllReceipts();

    }

}
