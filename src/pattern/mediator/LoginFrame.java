package pattern.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements Mediator, ActionListener {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;

    private ColleagueTextField textUser;
    private ColleagueTextField textPasswd;

    private ColleagueButton btnOk;
    private ColleagueButton btnCancel;

    public LoginFrame(String title) {
        super(title);

        // 배경설정
       setBackground(Color.lightGray);

        // 레이아웃 설정
        setLayout(new GridLayout(4, 2));

        // Colleague들 생성
        createColleagues();

        // 배치
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPasswd);
        add(btnOk);
        add(btnCancel);

        // 표시
        pack();
        setVisible(true);
    }

    @Override
    public void createColleagues() {
        // 생성
        CheckboxGroup group = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", group, true);
        checkLogin = new ColleagueCheckbox("Login", group, false);

        textUser = new ColleagueTextField("", 10);
        textPasswd = new ColleagueTextField("", 10);
        textPasswd.setEchoChar('*');

        btnOk = new ColleagueButton("OK");
        btnCancel = new ColleagueButton("Cancel");

        // Mediator - LoginFrame
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPasswd.setMediator(this);
        btnOk.setMediator(this);
        btnCancel.setMediator(this);

        // Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPasswd.addTextListener(textPasswd);
        btnOk.addActionListener(this);      // LoginFrame에 구현된 내용 전달
        btnCancel.addActionListener(this);  // LoginFrame에 구현된 내용 전달
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            textUser.setColleagueEnabled(false);
            textPasswd.setColleagueEnabled(false);
            btnOk.setColleagueEnabled(true);
        } else {
            textUser.setColleagueEnabled(true);
            userPasswordChanged();
        }
    }

    private void userPasswordChanged() {
        if (textUser.getText().length() > 0) {
            textPasswd.setColleagueEnabled(true);
            if (textPasswd.getText().length() > 0) {
                btnOk.setColleagueEnabled(true);
            } else {
                btnOk.setColleagueEnabled(false);
            }
        } else {
            textPasswd.setColleagueEnabled(false);
            btnOk.setColleagueEnabled(false);
        }
    }
}
