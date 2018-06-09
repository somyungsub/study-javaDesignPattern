package pattern.factory_method.sample.idcard;

import pattern.factory_method.sample.framework.Product;

/*
    상위  Product
    하위  IDCard (구현체) - use 메서드 기능 구현
 */
public class IDCard extends Product {

    private String owner;   // 인식번호를 나타냄

    public IDCard(String owner) {
        this.owner = owner;
    }

    // 구체적인 내용 구현
    @Override
    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
    }

    public String getOwner() {
        return owner;
    }
}
