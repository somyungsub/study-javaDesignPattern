package pattern.bridge;

// Display에 확장
/*
public class RandomDisplay extends Display{
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times){
        open();
        for (int i = 0; i < time; i++) {
            print();
        }
        close();
    }
}*/

import java.util.Random;

// 답안지 : CountDisplay 하위로 확장
public class RandomDisplay extends CountDisplay{
    private Random random = new Random();

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times){
        multiDisplay(random.nextInt(times));
    }
}
