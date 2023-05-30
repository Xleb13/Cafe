package Service;

import Product.Product;
import java.util.ArrayList;

public class Check{
    private double checkPrice = 0;
    public double CheckPrice(ArrayList<ShoppingCart> pay){
        for (ShoppingCart payItem : pay) {
            Product product = payItem.getProduct();
            double price = product.getPrice();
            int quantity = payItem.getQuantity();
            double finalPrice = price *quantity;
            checkPrice+=finalPrice ;
        }
        return checkPrice;
    }
}