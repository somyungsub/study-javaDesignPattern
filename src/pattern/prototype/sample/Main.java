package pattern.prototype.sample;

/**
 * Created by User on 2017-03-28.
 */
public class Main {
    public static void main(String args[]){
        Manager manager=new Manager();
        UnderlinePen pen=new UnderlinePen('~');
        MessageBox mbox=new MessageBox('*');
        MessageBox sbox=new MessageBox('/');
        manager.register("strong message", pen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);


        Product p1=manager.create("strong message");
        p1.use("테스트!!!");
        Product p2=manager.create("warning box");
        p2.use("테스트 mbox");
        Product p3=manager.create("slash box");
        p3.use("테스트 sbox!!!");

    }
}
