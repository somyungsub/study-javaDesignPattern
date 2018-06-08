package pattern.prototype.sample;

/**
 * Created by User on 2017-03-28.
 */
public interface Product extends Cloneable{
    public abstract void use(String s);
//    public  abstract Product creaClone();
    public abstract Product creaClone();
}
