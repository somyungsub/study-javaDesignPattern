package pattern.prototype.sample;

/**
 * Created by User on 2017-03-28.
 */
public abstract class Product2 implements Product {
    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
