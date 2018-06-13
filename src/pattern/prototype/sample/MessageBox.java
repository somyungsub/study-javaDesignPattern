package pattern.prototype.sample;

/**
 * Created by User on 2017-03-28.
 */
public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println(" ");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println(" ");
    }

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
