package UnitTestHW1;
import UnitTestHW1.Shop.BasketOrders;
import UnitTestHW1.Shop.Product;
import UnitTestHW1.Shop.ProductTest;

public class Main {
    public static void main(String[] args) {
        Product broad = new Product("Хлеб", 600);
        Product eggs = new Product("Яйцо, упаковка 3 десятка", 300);
        Product milk = new Product("Молоко", 110);

        BasketOrders basket = new BasketOrders();
        basket.addProductToBasket(broad);
        basket.addProductToBasket(milk);
        basket.addProductToBasket(eggs);
        basket.printBasketContent();
        System.out.println(basket.getMostExpensiveProduct());
        System.out.println(basket.sortProductsByPrice());
        ProductTest.testSorting(basket);

    }
}