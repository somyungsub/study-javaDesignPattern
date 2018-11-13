package pattern.mediator;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String label){
        super(label);
    }

    // Mediator(중개자) 저장
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // 유효,무효를 지시
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
