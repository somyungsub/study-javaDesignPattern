package pattern.Iterator.practice;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
    List<Book> books;
    private int last = 0;

    public BookShelf() {
        if (books == null) {
            books = new ArrayList<>();
        }
    }


    public Book getBook(int index) {
        return books.get(index);
    }


    public int getLength() {
        return last;
    }

    public void appendBook(Book book) {
        books.add(book);
        last++;
    }


    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
