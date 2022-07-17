package testDrillerClass;

public class TestDrillerApp {
    private int amount;

    public int calculateQuantityOfBooks(int quantity){
        if (quantity > 0 && quantity <= 4){
            amount = quantity * 2000;
        }
        if(quantity > 4 && quantity <= 9){
            amount = quantity * 1800;
        }
        if(quantity > 9 && quantity <= 29){
            amount = quantity * 1600;
        }
        if(quantity > 29 && quantity <=49){
            amount = quantity * 1500;
        }
        if(quantity > 49 && quantity <=99){
            amount = quantity * 1300;
        }
        if(quantity > 99 && quantity <=199){
            amount = quantity * 1200;
        }
        if(quantity > 199 && quantity <=499){
            amount = quantity * 1100;
        }
        if(quantity > 500){
            amount = quantity * 1000;
        }
        return amount;
    }
}
