package pattern.memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> list = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsName = {
            "사과", "포도", "바나나", "귤"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    // 게임실행
    public void bet() {
        int dice = random.nextInt(6) + 1; // 주사위굴리기

        if (dice == 1) {
            money += 100;
            System.out.println("소지금 증가!");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("소지금이 절반으로 줄었습니다!");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("과일(" + f + ")");
            list.add(f);
        }

    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "맛있는";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String f = it.next();
            if (f.startsWith("맛있는")) {
                memento.addFruit(f);    // 맛있는 과일만 저장
            }
        }
        return memento;
    }

    // undo실행
    public void restoreMemeto(Memento memento) {
        this.money = memento.getMoney();
        this.list = memento.getFruits();
    }

    @Override
    public String toString() {
        return  "[money=" + money +
                ", fruits=" + list +
                ']';
    }
}
