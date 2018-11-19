package pattern.state;

public interface Context {
    void setClock(int hour);                // 시간설정

    void changeState(State state);          // 상태전환

    void callSecurityCenter(String msg);    // 경비센터 호출

    void recordLog(String msg);             // 경비센터 기록

}
