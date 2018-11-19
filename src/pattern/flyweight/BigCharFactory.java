package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private Map<String, BigChar> pool;  // 관리 : 저장공간

    private static BigCharFactory singleton = new BigCharFactory(); // 팩토리는 싱글턴으로 구현
    private BigCharFactory() {
        pool = new HashMap<>();
    }

    public static BigCharFactory getInstance() {
        if (singleton == null) {
            singleton = new BigCharFactory();
        }
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname) {
        String key = String.valueOf(charname);
        if (!pool.containsKey(key)) {
            pool.put(key, new BigChar(charname));
        }
        return pool.get(key);
    }
}
