package Service;

import Product.Product;
import Product.Pizza;
import Product.Drink;

import java.util.ArrayList;

public class Discount {
    private int pizzaCounter = 0;
    private int drinkCounter = 0;

    public double Discount(ArrayList<ShoppingCart> cart, double checkPrice){

        for (ShoppingCart shoppingCart : cart) {
            Class<? extends Product> productClass = shoppingCart.getProduct().getClass();
            Product product = shoppingCart.getProduct();

            int price = product.getPrice();
            int quantity = shoppingCart.getQuantity();

            if (productClass == Pizza.class) {
                for (int pizzaIndex = 0; pizzaIndex < quantity; pizzaIndex++) {
                    pizzaCounter++;
                    if (pizzaCounter == 5) {
                        pizzaCounter = 0;
                        checkPrice -= price;
                    }
                }
            }
            if (productClass == Drink.class) {
                if (price > 2){
                    checkPrice -= checkPrice * 0.15;
                }
            }
            if (drinkCounter > 2) {
                checkPrice -= checkPrice * 0.2;
            }
        }
        return checkPrice;
    }
}
