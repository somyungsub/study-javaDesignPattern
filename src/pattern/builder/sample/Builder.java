package pattern.builder.sample;

/**
 * Created by User on 2017-03-28.
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract String getResult();
    public abstract void close();
}
