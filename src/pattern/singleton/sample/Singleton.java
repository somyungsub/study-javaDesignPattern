package pattern.singleton.sample;

/**
 * Created by User on 2017-03-28.
 */
public class Singleton {
/*    private static Singleton singleton=new Singleton();
    private Singleton(){
        System.out.println("singleton = " + singleton);
        System.out.println("인스턴스 생성");
    }
    public static Singleton getInstance(){
        return singleton;
    }*/
    private static Singleton singleton=null;
    private Singleton(){
        System.out.println("인스턴스 생성");
    }
    public static Singleton getInstance(){
        if(singleton==null)
            singleton=new Singleton();
        return singleton;
    }
}
