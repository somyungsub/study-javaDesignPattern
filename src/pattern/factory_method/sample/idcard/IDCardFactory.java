package pattern.factory_method.sample.idcard;

import pattern.factory_method.sample.framework.Factory;
import pattern.factory_method.sample.framework.Product;

import java.util.ArrayList;
import java.util.List;

/*
    상위  Factory         - 객체생성 흐름은 create메서드에 구현 되어있음
    하위  IDCardFactory   - 기능구현 (createProduct, registerProduct)
 */
public class IDCardFactory extends Factory {
    List<String> owners = new ArrayList<>();  // 등록을 위한 리스트 구조

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);   // 카드 객체생성
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());   // 인식번호 등록
    }

    // 인식번호 리스트 반환
    public List<String> getOwners() {
        return owners;
    }

}
