package UnitTestHW1.Shop;

import UnitTestHW1.Calculator.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/*
Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в класс Shop:
Метод sortProductsByPrice(), который сортирует список продуктов по стоимости. Метод getMostExpensiveProduct(),
который возвращает самый дорогой продукт. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
(правильное количество продуктов, верное содержимое корзины). Напишите тесты для проверки корректности работы метода
getMostExpensiveProduct. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте
правильность сортировки). Используйте класс Product для создания экземпляров продуктов и класс Shop для написания
методов сортировки и тестов.
 */
public class ProductTest {
    public static void main(String[] args) {
        Product broad = new Product("Хлеб", 600);
        Product eggs = new Product("Яйцо, упаковка 3 десятка", 300.50F);
        Product milk = new Product("Молоко", 110);
        Product test = new Product("Икра", 15000);

        BasketOrders basket = new BasketOrders();
        basket.addProductToBasket(broad);
        basket.addProductToBasket(milk);
        basket.addProductToBasket(eggs);
        basket.printBasketContent();
        basket.sortProductsByPrice();
        ProductTest.testSorting(basket);
        Product mostExpensiveProduct = basket.getMostExpensiveProduct();
        System.out.println("Самый дорогой продукт в корзине:\n" + mostExpensiveProduct.getTitle());
        testMostExpensiveProduct(basket, test);

    }

    //Метод проверки сортировки
    public static void testSorting(BasketOrders basket) {
        for (int i = 0; i < basket.getLenth() - 1; i++) {
            assertThat(basket.getProductCoastInBasket(i + 1)).isGreaterThan(basket.getProductCoastInBasket(i));
        }
    }

    public static void testMostExpensiveProduct(BasketOrders basket, Product product) {
        for (int i = 0; i < basket.getLenth() - 1; i++) {
            assertThat(product.getCoast()).isGreaterThan(basket.getProductCoastInBasket(i));
        }
    }

}

