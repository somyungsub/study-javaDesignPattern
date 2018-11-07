package pattern.visitor;

public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    /*
        핵심 Visitor에게 호출된 객체를 넘겨 방문된걸 알림
     */
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
