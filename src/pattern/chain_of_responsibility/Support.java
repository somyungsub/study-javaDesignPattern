package pattern.chain_of_responsibility;

/*
    이 클래스 역할에서 컴포지트 패턴이 자주 등장함
 */
public abstract class Support {
    private String name;    // 트러블의 해결자 이름
    private Support next;   // 떠넘기는곳

    public Support(String name) {
        this.name = name;
    }

    // 떠넘기는 곳 설정
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    //  트러블 해결의 수순 : 템플릿메서드 패턴
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        // 해결
        System.out.println(trouble + " is resolved by" + this + ".");
    }

    protected void fail(Trouble trouble) {
        // 미해결
        System.out.println(trouble + " cannot be resolved");
    }
}
