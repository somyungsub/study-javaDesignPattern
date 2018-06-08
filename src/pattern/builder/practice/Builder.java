package pattern.builder.practice;

/**
 * Created by User on 2017-03-29.
 */
public interface Builder {
    public  void makeTitle(String title);
    public  void makeString(String str);
    public  void makeItems(String[] items);
    public  void close();
}
