package pattern.abstract_factory.listfactory;

import pattern.abstract_factory.factory.Item;
import pattern.abstract_factory.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<li>\n");
        sb.append(caption + "\n");
        sb.append("<ul>\n");

        Iterator<Item> it = tray.iterator();
        while (it.hasNext()) {
            sb.append(it.next().makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
