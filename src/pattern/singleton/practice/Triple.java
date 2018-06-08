package pattern.singleton.practice;

/**
 * Created by User on 2017-03-28.
 */
public class Triple {
    private static Triple a=new Triple();
    private static Triple b=new Triple();
    private static Triple c=new Triple();

    public Triple() {
        System.out.println("트리플 생성");
    }

    public static Triple getInstance(int id){
        if (id==0)
            return a;
        else if(id==1)
            return b;
        else if(id==2)
            return c;
        else
            return null;
    }
}
