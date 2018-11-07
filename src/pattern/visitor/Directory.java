package pattern.visitor;


import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;
        Iterator<Entry> it = entries.iterator();

        while (it.hasNext()) {
            size += it.next().getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        entries.add(entry);
        return this;
    }

    public Iterator<Entry> iterator() {
        return entries.iterator();
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
