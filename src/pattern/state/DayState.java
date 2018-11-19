package pattern.state;

public class DayState implements State {

    // 공통화 가능? 자바 8부터?
    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static State getInstance() {
        if (singleton == null) {
            singleton = new DayState();
        }
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        // 시간설정
        if (hour < 9 || hour >= 17) {
            context.changeState(NightState.getInstance());  // 야간
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고사용(주간)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반통화(주간)");
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}
