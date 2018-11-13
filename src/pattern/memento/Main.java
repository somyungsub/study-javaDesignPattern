package pattern.memento;

import pattern.memento.game.Gamer;
import pattern.memento.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);        // 최초의 소지금 100
        Memento memento = gamer.createMemento();    // 최초 상태 저장

        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);         // 개수표시
            System.out.println("현상 : " + gamer);    // 현재 게이머 상태

            // 게임 실행
            gamer.bet();
            System.out.println("소지금은 " + gamer.getMoney() + "원이 되었습니다!");

            // Memento의 취급 결정 -> undo, memento설정 등
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("(많이 증가했으므로 현재의 상태를 저장하자)");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("(많이 감소했으므로 이전의 상태로 복원하자)");
                gamer.restoreMemeto(memento);
            }

            // 시간 기다림
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
