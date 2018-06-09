package pattern.factory_method.sample;

import pattern.factory_method.sample.framework.Factory;
import pattern.factory_method.sample.framework.Product;
import pattern.factory_method.sample.idcard.IDCardFactory;

/*
    클라이언트 (팩토리메서드 패턴)
    - Factory   객체 생성 담당 상위클래스
    - Product   객체정의 및 기능 구현 상위클래스
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();      // IDCard 객체 생성 담당 팩토리

        Product card1 = factory.create("홍길동1");  // Factory를 통해 객체생성
        Product card2 = factory.create("홍길동2");
        Product card3 = factory.create("홍길동3");

        // 기능 실행
        card1.use();
        card2.use();
        card3.use();
    }
}
