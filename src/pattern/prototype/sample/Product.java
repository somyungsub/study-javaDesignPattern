package pattern.prototype.sample;

/**
 * Created by User on 2017-03-28.
 */
public interface Product extends Cloneable{
    void use(String s);
    Product createClone();
}
