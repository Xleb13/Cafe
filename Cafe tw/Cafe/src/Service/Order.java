package Service;

import Product.Product;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Order{
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
    ArrayList<Product> menuList = menu.menuProduct;
    ArrayList<ShoppingCart> cartList = new ArrayList<>();

    public void createOrder(){
        while(true) {
            System.out.println("0 Получить чек");
            System.out.println("-9 Выход\n");

            for (int productCode = 1; productCode <= menuList.size(); productCode++) {
                Product menuItem = menuList.get(productCode - 1);
                System.out.println(productCode + " " + menuItem);
            }
            int i = scanner.nextInt();

            if(i == 0){
                System.out.println("******************************");
                System.out.println("\nВаш чек:");
                Check check = new Check();
                double checkPrice = check.CheckPrice(cartList);
                cartList.forEach(System.out::println);
                Discount discount = new Discount();
                double discountCheck = discount.Discount(cartList, checkPrice);
                System.out.println("\nИтого к оплате - " + discountCheck);
                cartList.clear();
                System.out.println("******************************");
                continue;
            }
            if(i == -9){
                System.exit(0);
            }

            if( i > 0 && i<= menuList.size()){
                System.out.print("Введите колличество: ");
                Product menuTest = menuList.get(i - 1);
                int count = scanner.nextInt();
                int price=0;
                price =count * menuTest.getPrice();
                if(count<0)
                {
                    System.out.println("Вы ввели отрицательное значение!");
                }
                else {
                    ShoppingCart shoppingCart = new ShoppingCart(menuTest,count, price);
                    cartList.add(shoppingCart);
                }
            } else {
                System.out.println("Такого продукта нет");
            }
        }
    }
}
