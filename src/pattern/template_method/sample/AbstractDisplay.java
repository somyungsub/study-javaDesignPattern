package pattern.template_method.sample;

/*
    상위클래스
    - 하위클래스에 Template 제공
 */

public abstract class AbstractDisplay {

    // 템플릿메서드
    public final void display(){
        // print를 5회 호출하는 프로세스
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    // 기능구현메서드 (하위클래스 정의)
    public abstract void open();        // 열기
    public abstract void print();       // 출력
    public abstract void close();       // 닫기
}
