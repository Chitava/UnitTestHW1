package UnitTestHW1.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BasketOrders {
    private ArrayList<Product> basket = new ArrayList<>();

    public void addProductToBasket(Product product) {
        basket.add(product);

    }

    public ArrayList getBasket() {
        return basket;
    }

    public void printBasketContent() {
        for (Product product : basket) {
            System.out.println(product);
        }
    }

    public Product getMostExpensiveProduct() {
        float maxCoast = 0;
        int index = 0;
        for (Product product : basket) {
            if (product.getCoast() > maxCoast) {
                maxCoast = product.getCoast();
                index = basket.indexOf(product);
            }
        }
        return basket.get(index);
    }




    public ArrayList<Product> sortProductsByPrice() {
        Comparator compare = new CompareByCoast();
        Collections.sort(basket, compare);
        return basket;
    }

}
