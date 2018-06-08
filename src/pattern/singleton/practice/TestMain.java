package pattern.singleton.practice;

/**
 * Created by User on 2017-03-28.
 */
public class TestMain {
    public static void main(String args[]) {
        System.out.println("시작!!");
/*        int a=TicketMaker.getNextTicketNumber();
        System.out.println("a = " + a);
        int b=TicketMaker.getNextTicketNumber();
        System.out.println("b = " + b);
        int c=TicketMaker.getNextTicketNumber();
        int d=TicketMaker.getNextTicketNumber();
        System.out.println("c = " + c);
        System.out.println("d = " + d);*/

        Triple triple1=Triple.getInstance(0);
        Triple triple2=Triple.getInstance(0);
        Triple triple3=Triple.getInstance(1);
        Triple triple4=Triple.getInstance(1);
        Triple triple5=Triple.getInstance(2);
        Triple triple6=Triple.getInstance(2);
        Triple triple7=Triple.getInstance(3);
        Triple triple8=Triple.getInstance(3);

        System.out.println(triple1);
        System.out.println(triple2);
        System.out.println(triple3);
        System.out.println(triple4);
        System.out.println(triple5);
        System.out.println(triple6);
        System.out.println(triple7);
        System.out.println(triple8);

        System.out.println("END");

    }
}
