package pattern.composite;

public class File extends Entry {
    private String name;    // 파일 이름
    private int size;       // 파일 크기

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    // 상위 Entry클래스 재정의
    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this); // this는 ->this.toString호출 하위에 없으므로 상위(Entry)클래스 toString 호출됨
    }
}
