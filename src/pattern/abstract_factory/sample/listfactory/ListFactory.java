package pattern.abstract_factory.sample.listfactory;

import pattern.abstract_factory.sample.factory.Factory;
import pattern.abstract_factory.sample.factory.Link;
import pattern.abstract_factory.sample.factory.Page;
import pattern.abstract_factory.sample.factory.Tray;

public class ListFactory extends Factory {


    @Override
    public Link createLink(String caption, String url) {
        return null;
    }

    @Override
    public Tray createTray(String caption) {
        return null;
    }

    @Override
    public Page createPage(String title, String author) {
        return null;
    }
}
