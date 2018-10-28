package pattern.bridge;

/*
    구현클래스 계층의 최상위
 */
public abstract class DisplayImpl {
    public abstract void rawOpen();
    public abstract void rawPrint();
    public abstract void rawClose();
}
