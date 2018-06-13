package pattern.prototype.practice;

public class UnderlinePen extends Product {
    private char unchar;

    public UnderlinePen(char unchar) {
        this.unchar = unchar;
    }

    @Override
    public void use(String s) {
        System.out.print("\"" + s + "\"");
        System.out.println(" ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(unchar);
        }
        System.out.println(" ");
    }

}
