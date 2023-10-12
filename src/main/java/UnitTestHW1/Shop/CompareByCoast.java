package UnitTestHW1.Shop;

import java.util.Comparator;

public class CompareByCoast implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return (int) (p1.getCoast() - p2.getCoast());
    }
}
