package Service;

import Product.Product;

public class ShoppingCart {
    private Product product;
    private int quantity;
    private double price;

    public ShoppingCart(Product product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название: " +product.getName()+
                "\nКоличество: " + quantity +
                "\nЦена: " + price + "\n";
    }
}
