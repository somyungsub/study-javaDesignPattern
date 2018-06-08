package pattern.adapter.sample;

/*
    클라이언트

    상속에 의한 어댑터패턴
 */
public class Main {
    public static void main(String[] args) {

        // 클라이언트에 제공되는 인터페이스
        Print print = new PrintBanner("Hello");
        print.printStrong();
        print.printWeak();

    }
}
