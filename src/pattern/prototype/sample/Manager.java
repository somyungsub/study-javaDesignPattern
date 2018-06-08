package pattern.prototype.sample;

import java.util.HashMap;

/**
 * Created by User on 2017-03-28.
 */
public class Manager {
    private HashMap showcase=new HashMap();
    public void register(String name, Product proto){
        showcase.put(name,proto);
    }
    public Product create(String protoname){
        Product p=(Product)showcase.get(protoname);
        return p.creaClone();
    }

}
