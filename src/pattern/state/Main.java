package pattern.state;

public class Main {
    public static void main(String[] args) {
        SafeFrame safeFrame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                safeFrame.setClock(hour);   // 시간설정
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
