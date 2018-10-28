package pattern.abstract_factory.tablefactory;

import pattern.abstract_factory.factory.Item;
import pattern.abstract_factory.factory.Tray;

import java.util.Iterator;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public void add(Item item) {
        super.add(item);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<td>");
        sb.append("<table width = \"100%\" border=\"1\">");
        sb.append("<tr>");
        sb.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"")
                .append(tray.size())
                .append("\"><b>").append(caption).append("</br><td>");
        sb.append("</tr>\n");

        sb.append("<tr>\n");
        Iterator<Item> it = super.tray.iterator();
        while (it.hasNext()) {
            sb.append(it.next().makeHTML());    // Item -> Tray / Link의 makeHTML
        }
        sb.append("</tr>");
        sb.append("</table>");
        sb.append("</td>");
        return sb.toString();
    }
}
