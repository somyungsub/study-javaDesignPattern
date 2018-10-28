package pattern.bridge;

public class Display {
    private DisplayImpl impl; // 기능과 구현의 다리역할 (bridge)

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    // 구현의 표시를 실행하는 메서드
    public final void display() {
        open();
        print();
        close();
    }

}
