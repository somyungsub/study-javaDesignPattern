package pattern.prototype.sample;

/**
 * Created by User on 2017-03-28.
 */
public class UnderlinePen implements Product {
    private char unchar;

    public UnderlinePen(char unchar) {
        this.unchar = unchar;
    }

    @Override
    public void use(String s) {
        System.out.println("\""+s+"\"");
        System.out.println(" ");
        for (int i=0;i<s.length();i++){
            System.out.print(unchar);
        }
        System.out.println(" ");
    }

    @Override
    public Product creaClone() {
        Product p=null;
        Object obj=null;
        try {
            p=(Product)clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();

        }
        return p;
    }
}
