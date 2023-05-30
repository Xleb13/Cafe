package Service;

import Product.Pizza;
import Product.Drink;
import Product.Product;

import java.util.ArrayList;


public class Menu {
    public ArrayList<Product> menuProduct = new ArrayList<>();
    public Menu(){
        Pizza Assorted = new Pizza(2, "Ассорти");
        Pizza Capybara = new Pizza(5,"Карбонара");
        Pizza Mushroom = new Pizza(4,"Грибная");
        Pizza Triangle = new Pizza(1, "Треугольник");
        Drink Coffee = new Drink(2, "Кофе");
        Drink Juice = new Drink(3,"Сок");
        Drink FruitDrink = new Drink(1,"Морс");

        menuProduct.add(Assorted);
        menuProduct.add(Capybara);
        menuProduct.add(Mushroom);
        menuProduct.add(Triangle);
        menuProduct.add(Coffee);
        menuProduct.add(Juice);
        menuProduct.add(FruitDrink);
    }
}
