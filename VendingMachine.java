public class VendingMachine {

    private StockItem[] stockItems;
    private int snacksInStock=0;
    private SoldItem[] soldItems;
    private int itemsSold=0;
    private Receipt[] receipts;
    private int receiptsGiven=0;

    private String VendingMachineName;
    private int vendingMachineSize;
    VendingMachine(String VendingMachineName, int vendingMachineSize) {
        this.VendingMachineName=VendingMachineName;
        this.vendingMachineSize=vendingMachineSize;

        stockItems=new StockItem[vendingMachineSize];
        soldItems=new SoldItem[vendingMachineSize];
        receipts=new Receipt[vendingMachineSize];
    }

    void addSupply(StockItem stockItem) {
        stockItems[snacksInStock]=stockItem;
        snacksInStock++;
    }
    void getReceipt() {
        System.out.println(receipts[receiptsGiven-1]);
    }


    void buyCandy(String snackName) {
        // finds snackLocationInStock
        int snackLocationInStock=-1;
        for(int i=0; i<stockItems.length; i++) {
            if(stockItems[i]!=null) {
                if (stockItems[i].getSnackName().equals(snackName)) {
                    snackLocationInStock = i;
                    break;
                }
            }
        }

        //checks if we are actually buying a candy
        if(stockItems[snackLocationInStock].getSnackType().equals("candy")) {
            //add to itemsSold
            soldItems[itemsSold] = new SoldItem(stockItems[snackLocationInStock].getCost(), stockItems[snackLocationInStock].getSnackType(), stockItems[snackLocationInStock].getSnackName());
            itemsSold++;
            //create receipt
            receipts[receiptsGiven] = new Receipt(stockItems[snackLocationInStock].getCost(), stockItems[snackLocationInStock].getSnackType(), stockItems[snackLocationInStock].getSnackName());
            receiptsGiven++;
            // remove stockItem from stock
            stockItems[snackLocationInStock] = null;
        }
    }
    void buyCookies(String snackName) {
        // finds snackLocationInStock
        int snackLocationInStock=-1;
        for(int i=0; i<stockItems.length; i++) {
            if(stockItems[i]!=null) {
                if (stockItems[i].getSnackName().equals(snackName)) {
                    snackLocationInStock = i;
                    break;
                }
            }
        }

        //checks if we are actually buying cookies
        if(stockItems[snackLocationInStock].getSnackType().equals("cookie")) {
            //add to itemsSold
            soldItems[itemsSold] = new SoldItem(stockItems[snackLocationInStock].getCost(), stockItems[snackLocationInStock].getSnackType(), stockItems[snackLocationInStock].getSnackName());
            itemsSold++;
            //create receipt
            receipts[receiptsGiven] = new Receipt(stockItems[snackLocationInStock].getCost(), stockItems[snackLocationInStock].getSnackType(), stockItems[snackLocationInStock].getSnackName());
            receiptsGiven++;
            // remove stockItem from stock
            stockItems[snackLocationInStock] = null;
        }
    }
    void buyWater(String snackName) {
        // finds snackLocationInStock
        int snackLocationInStock=-1;
        for(int i=0; i<stockItems.length; i++) {
            if(stockItems[i]!=null) {
                if (stockItems[i].getSnackName().equals(snackName)) {
                    snackLocationInStock = i;
                    break;
                }
            }
        }

        //checks if we are actually buying water
        if(stockItems[snackLocationInStock].getSnackType().equals("water")) {
            //add to itemsSold
            soldItems[itemsSold] = new SoldItem(stockItems[snackLocationInStock].getCost(), stockItems[snackLocationInStock].getSnackType(), stockItems[snackLocationInStock].getSnackName());
            itemsSold++;
            //create receipt
            receipts[receiptsGiven] = new Receipt(stockItems[snackLocationInStock].getCost(), stockItems[snackLocationInStock].getSnackType(), stockItems[snackLocationInStock].getSnackName());
            receiptsGiven++;
            // remove stockItem from stock
            stockItems[snackLocationInStock] = null;
        }
    }


    void showStockSupplies() {
        boolean anySuppliesLeft=false;
        System.out.println("\n" + "Remaining Stock: ");
        for(int i=0; i<stockItems.length; i++) {
            if(stockItems[i]!=null) {
                System.out.println(stockItems[i]);
                anySuppliesLeft=true;
            }
        }
        if(!anySuppliesLeft)  System.out.println("No snacks left");
    }
    void showSoldItems() {
        System.out.println("\n" + "Sold Items: ");
        for(int i=0; i<soldItems.length; i++) {
            if(soldItems[i]!=null)
                System.out.println(soldItems[i]);
        }
    }
    void showAllReceipts() {
        System.out.println("\n" + "All Receipts: ");
        for(int i=0; i<receipts.length; i++) {
            if(receipts[i]!=null)
                System.out.println(receipts[i]);
        }
    }

}
