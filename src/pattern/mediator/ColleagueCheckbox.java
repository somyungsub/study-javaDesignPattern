package pattern.mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;

    public ColleagueCheckbox(String text, CheckboxGroup group, boolean state) {
        super(text, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;   // mediator(중개자) 저장
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        // mediator에서 유효/무효 지시
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // 상태가 바뀌면 mediator에게 통지
        mediator.colleagueChanged();
    }
}
