package pattern.prototype.sample;

/**
 * Created by User on 2017-03-28.
 */
public class UnderlinePen2 extends Product2 {
    private char unchar;

    public UnderlinePen2(char unchar) {
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

}
