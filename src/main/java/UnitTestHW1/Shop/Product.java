package UnitTestHW1.Shop;

public class Product {
    private String title;
    private float coast;


    public Product(String title, float coast) {
        this.title = title;
        this.coast = coast;
    }

    public String getTitle() {
        return title;
    }

    public float getCoast() {
        return coast;
    }

    @Override
    public String toString() {
        return String.format("Продукт: %s\n Стоимость: %s р.", getTitle(), getCoast());
    }

}
