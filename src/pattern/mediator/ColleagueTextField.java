package pattern.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        // Mediator를 저장
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        // mediator에서 유효, 무효를 지시
        setEnabled(enabled);
        setBackground(enabled ? Color.WHITE : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        // 문자열이 변하면 Mediator에게 통지
        mediator.colleagueChanged();
    }
}
