package pattern.factory_method.sample.framework;

/*
   Product 하위에 use구현을 위임
 */
public abstract class Product {

    // 제품이란 무엇이든 사용 - 하위에서 구현
    public abstract void use();
}
