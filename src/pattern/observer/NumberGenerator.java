package pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NumberGenerator {
    private List<Observer> list = new ArrayList<>();

    public void addObserver(Observer observer) {
        list.add(observer);
    }

    public void deleteObserver(Observer observer) {
        list.remove(observer);
    }

    // Observer에 알림
    public void notifyObservers() {
        Iterator<Observer> it = list.iterator();
        while (it.hasNext()) {
            it.next().update(this); // 여기에서는 RandomNumberGenerator가 됨
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
