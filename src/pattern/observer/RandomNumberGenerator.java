package pattern.observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number; // 갱신 대상

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 5; i++) {
            number = random.nextInt(50);    // 난수 발생 : 갱신
            notifyObservers(); //알림
        }
    }
}
