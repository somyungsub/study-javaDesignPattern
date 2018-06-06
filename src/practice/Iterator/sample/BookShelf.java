package practice.Iterator.sample;

public class BookShelf implements Aggregate {
    Book[] books;
    private int last = 0;


    public BookShelf(int maxSize){
        books = new Book[maxSize];
    }



    public Book getBook(int index) {
        return books[index];
    }


    public int getLength() {
        return last;
    }

    public void appendBook(Book book) {
//        books.add(book);
        books[last] = book;
        last++;

    }


    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
