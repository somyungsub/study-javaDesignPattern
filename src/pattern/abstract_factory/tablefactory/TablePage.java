package pattern.abstract_factory.tablefactory;


import pattern.abstract_factory.factory.Item;
import pattern.abstract_factory.factory.Page;

import java.util.Iterator;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public void add(Item item) {
        super.add(item);
    }

    @Override
    public void output() {
        super.output();
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>").append(title).append("</title>");
        sb.append("</head>\n");

        sb.append("<body>\n");
        sb.append("<h1>").append(title).append("</h1>\n");

        sb.append("<table width=\"80%\" border=\"3\">\n");
        Iterator<Item> it = super.content.iterator();
        while (it.hasNext()) {
            sb.append("<tr>").append(it.next().makeHTML()).append("</tr>");
        }
        sb.append("</table>");
        sb.append("<hr><address>").append(author).append("</address>");
        sb.append("</body></html>\n");
        return sb.toString();
    }
}




