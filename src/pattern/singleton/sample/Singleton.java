package pattern.singleton.sample;

public class Singleton {
    private static Singleton singleton=null;    // static -> 로딩시점에서 메모리영역(메서드 == 클래스영역)에 할당
    private Singleton(){
        System.out.println("인스턴스 생성");
    }

    // 싱글턴 패턴!
    public static Singleton getInstance(){
        if(singleton==null)
            singleton=new Singleton();  // 여기서 한번만 생성
        return singleton;
    }

    public void test() {
       // ...
    }
}
