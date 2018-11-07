package pattern.decorator;

public class StringDisplay extends Display {
    private String string;  // 표시 문자열

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        // 문자수
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        // 행수 1 (문자열이므로 1로 제한)
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        }
        return "";
    }


}
