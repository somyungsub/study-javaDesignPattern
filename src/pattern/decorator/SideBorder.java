package pattern.decorator;


/*
    Border      - 추상
    SideBorder  - 구현체
 */
public class SideBorder extends Border {

    private char borderChar;    // 장식이 되는 문자


    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;    // 양옆 문자수 + 문자수
    }

    @Override
    public int getRows() {
        return display.getRows();   // 여기에서는 그대로
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;   // 장식 + 내용물 + 장식
    }
}
