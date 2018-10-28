package pattern.abstract_factory.factory;

import java.lang.reflect.InvocationTargetException;

public abstract class Factory {
    public static Factory getFactory(String classname){
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);

    // 연습문제 8-2 (p.161)
    public Page createYahooPage() {
        Link yahoo = createLink("Yahoo!", "http://www.yahoo.com/");
        Page page = createPage("Yahoo!!", "Yahoo!!");
        page.add(yahoo);
        return page;
    }

}
