package pattern.bridge;

/*
    기능의 클래스 계층
    - 지정된 횟수만큼 표시한다. (지정된 횟수 기능 추가)
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    /*
        times 만큼 반복표시
        상속메서드를 활용
     */
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}
