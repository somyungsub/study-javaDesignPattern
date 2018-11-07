package pattern.chain_of_responsibility;

public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    // 해결 메서드 - 홀수번호의 트러블만
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 1;
    }

}
