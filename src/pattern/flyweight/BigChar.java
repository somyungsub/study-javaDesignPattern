package pattern.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charName;      // 문자이름
    private String fontData;    // 큰무자를 표현하는 문자열

    // 생성자
    public BigChar(char charName) {
        this.charName = charName;
        try{
            BufferedReader bf = new BufferedReader(new FileReader("src/pattern/flyweight/big" + this.charName + ".txt"));
            String line;
            StringBuffer sb = new StringBuffer();
            while ((line = bf.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
            this.fontData = sb.toString();
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 큰문자 출력
    public void print() {
        System.out.println(this.fontData);
    }
}
