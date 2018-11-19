package pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class BigString{

    // 큰문자의 배열
    private List<BigChar> list;

    // 생성자
    public BigString(String string) {
        list = new ArrayList<>();
        BigCharFactory factory = BigCharFactory.getInstance();

        for (int i = 0; i < string.length(); i++) {
            list.add(factory.getBigChar(string.charAt(i)));
        }
    }

    // 표시
    public void print() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).print();
        }
    }

}
