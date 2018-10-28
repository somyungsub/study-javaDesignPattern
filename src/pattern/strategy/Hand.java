package pattern.strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 0;  // 주먹을 표시하는 값
    public static final int HANDVALUE_CHO = 1;  // 가위를 표시하는 값
    public static final int HANDVALUE_PAA = 2;  // 보를 표시하는 값
    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA),
    };
    private static final String[] name = {
            "주먹", "가위", "보"
    };
    private int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;    // this가 hand를 이길 경우 true
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;   // this가 hand에게 질 경우 true
    }

    // 무승부 0, this 승 1, this 패배 -1
    private int fight(Hand hand) {
        if (this.handValue == hand.handValue) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name[handValue];
    }
}
