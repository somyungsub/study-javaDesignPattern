package pattern.prototype.sample;

/**
 * Created by User on 2017-03-28.
 */
public class UnderlinePen implements Product {
    private char unChar;

    public UnderlinePen(char unChar) {
        this.unChar = unChar;
    }

    @Override
    public void use(String s) {
        System.out.println("\"" + s + "\"");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(unChar);
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
