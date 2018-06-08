package pattern.singleton.practice;

/**
 * Created by User on 2017-03-28.
 */
public class TicketMaker {
    private static TicketMaker ticketMaker=new TicketMaker();
    private static int ticket=1000;
    private TicketMaker() {
        System.out.println("티켓생성");
    }

    public static int getNextTicketNumber(){
        return ticket++;
    }
}
