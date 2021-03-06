package pattern.singleton.sample;

/**
 * Created by User on 2017-03-28.
 */
public class TestMain {
    public static void main(String args[]){
        System.out.println("Start");
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();

        if(obj1==obj2){
            System.out.println("obj1==obj2");
        }
        else
            System.out.println("obj1 != obj2");

        System.out.println(obj1);   // 주소값
        System.out.println(obj2);   // 주소값
        System.out.println("end");
    }
}
