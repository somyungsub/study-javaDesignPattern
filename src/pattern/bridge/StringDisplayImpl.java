package pattern.bridge;

/*
    구현클래스계층의 구현부
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;  // 표시해야할 문자열
    private int width;      // 바이트 단위로 계산할 문자열의 '길이'

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");    // 테두리 모서리 표현 '+'
        for (int i = 0; i < width; i++) {
            System.out.print("-");  // 테두리 선 표현 '-'
        }
        System.out.println("+");    // 테두리 모서리 표현 '+'
    }
}
