package pattern.chain_of_responsibility;

public class Trouble {
    private int number; // 트러블번호

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble [" + number + ']';
    }
}
