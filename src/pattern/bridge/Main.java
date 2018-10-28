package pattern.bridge;

public class Main {
    public static void main(String[] args) {

        // 기능클래스 인수로 구현클래스의 구현체를 받음 -> ex)StringDisplayImpl
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello World!"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));


        System.out.println("###############################");
        d1.display();
        System.out.println("###############################");
        d2.display();
        System.out.println("###############################");
        d3.display();
        System.out.println("###############################");
        d3.multiDisplay(5);

        // 9-1문제 (p.176)
        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Exe."));
        System.out.println("###############################");
        d4.randomDisplay(10);

        // 9-2문제 (p.176)
        CountDisplay d5 = new CountDisplay(new FileDisplayImpl("src/pattern/bridge/9-2.txt"));
        System.out.println("###############################");
        d5.multiDisplay(3);
        d5.display();

        // 9-3문제 (p.176)
        System.out.println("###############################");
        IncreaseDisplay d6 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'),1);
        d6.increaseDisplay(4);
        System.out.println("###############################");
        IncreaseDisplay d7 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'),2);
        d7.increaseDisplay(6);
    }
}
