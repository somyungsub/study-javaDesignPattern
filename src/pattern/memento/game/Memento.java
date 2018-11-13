package pattern.memento.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;
    ArrayList<String> fruitList = new ArrayList<>();


    Memento(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruitList.add(fruit);
    }

    List<String> getFruits() {
        return (List<String>)fruitList.clone();
    }
}
