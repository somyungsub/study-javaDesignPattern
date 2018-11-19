package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private Map<String, BigChar> pool;

    private static BigCharFactory singleton = new BigCharFactory();

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
