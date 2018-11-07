package pattern.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("alice");
        Support bob = new LimitSupport("bob", 100);
        Support charlie = new SpecialSupport("charlie", 429);
        Support diana = new LimitSupport("diana", 250);
        Support elmo = new OddSupport("elmo");
        Support fred = new LimitSupport("fred", 333);

        // 사슬형성
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        // 트러블 발생
        for (int i = 0; i < 500; i += ((int)(Math.random() * 10))) {
            alice.support(new Trouble(i));
        }
    }
}
