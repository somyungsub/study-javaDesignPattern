package pattern.factory_method.sample.framework;

/*
    객체(인스턴스)생성 담당 추상클래스 (상위)
    - create 메서드를 통해 Product클래스 객체를 생성
    - create 메서드는 템플릿메서드패턴의 으용
    - create 메서드는 객체생성의 큰흐름을 제공
 */
public abstract class Factory {

    // 객체 생성 로직 구현
    public final Product create(String owner) {
        Product p = createProduct(owner); // 객체 생성 후 반환
        registerProduct(p); // 객체 등록
        return p;
    }

    // 하위클래스에 위임
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
