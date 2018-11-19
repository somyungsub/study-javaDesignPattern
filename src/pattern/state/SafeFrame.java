package pattern.state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements Context, ActionListener {

    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);

    private Button buttonUse = new Button("금고사용");
    private Button buttonAlarm = new Button("비상벨");
    private Button buttonPhone = new Button("일반통화");
    private Button buttonExit = new Button("종료");

    private State state = DayState.getInstance();   // 현재상태

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());

        // textClock 배치
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);

        // textScreen 배치
        add(textScreen, BorderLayout.CENTER);

        // 패널에 버튼을 저장
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);

        // 그패널을 배치
        add(panel, BorderLayout.SOUTH);
        pack();
        show();


        //리스터 설정
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonExit.addActionListener(this);
        buttonPhone.addActionListener(this);
    }

    // 시간설정
    @Override
    public void setClock(int hour) {
        String clockStr = "현재 시간은";
        if (hour < 10) {
            clockStr += "0" + hour + ":00";
        } else {
            clockStr += hour + ":00";
        }
        System.out.println(clockStr);
        textClock.setText(clockStr);
        state.doClock(this, hour);  //
    }

    // 상태전환
    @Override
    public void changeState(State state) {
        System.out.println(this.state + "에서" + state + "로 상태가 변화했습니다");
        this.state = state;
    }

    // 경비센터의 호출
    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + System.lineSeparator());
    }

    // 경비센터의 기록
    @Override
    public void recordLog(String msg) {
        textScreen.append("record... " + msg + System.lineSeparator());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());

        Object source = e.getSource();
        if (source == buttonUse) {
            state.doUse(this);      // 금고사용
        } else if (source == buttonAlarm) {
            state.doAlarm(this);    // 알람
        } else if (source == buttonPhone) {
            state.doPhone(this);    // 일반통화
        } else if (source == buttonExit) {
            System.exit(0);          // 종료
        } else {
            System.out.println("??");
        }
    }

}
