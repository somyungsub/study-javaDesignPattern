package pattern.chain_of_responsibility;

public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    // 해결 메서드 - limit 지정번호 미만 true
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        }
        return false;
    }
}
