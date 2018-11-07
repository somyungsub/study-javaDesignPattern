package pattern.chain_of_responsibility;

public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    // 해결 메서드 - 자신은 아무것도 처리하지 않음
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
