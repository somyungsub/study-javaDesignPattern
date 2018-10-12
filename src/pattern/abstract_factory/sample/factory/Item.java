package pattern.abstract_factory.sample.factory;

public abstract class Item {
    protected String caption;   // 목차
    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();  // HTML 문자열
}
