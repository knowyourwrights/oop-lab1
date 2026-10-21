package ie.atu.oop.week1;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private static final int MAX_LOAN_DAYS = 14;
    private final List<Book> books = new ArrayList<>();

    public boolean loanBook(String title, int loanDays) {
        if (loanDays < 1 || loanDays > MAX_LOAN_DAYS) {
            throw new IllegalArgumentException(
                    "Loan days must be from 1 to 14");
        }
        Book book = findBookByTitle(title);
        if (book == null) {
            return false;
        }
        book.borrowBook();
        return true;
    }

    public boolean returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book == null) {
            return false;
        }
        book.returnBook();
        return true;
    }

    public void addBook(Book book)
    {
        if (book == null)
        {
            throw new IllegalArgumentException("Book must not be null");
        }
        books.add(book);
    }

    public int getBookCount()
    {
        return books.size();
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public Book findBookByTitle(String title)
    {
        for (Book book : books)
        {
            if (book.getTitle().equals(title))
            {
                return book;
            }
        }


        return null;
    }

    public boolean removeBook(String title)
    {
        if (findBookByTitle(title) == null)
        {
            return false;
        }
        else
        {
            books.remove(findBookByTitle(title));
            return true;
        }
    }

    public List<Book> getBooks()
    {
        return new ArrayList<>(books); //Returning books directly would give another class a
                                    // reference to LibraryService's internal collection. Returning a new ArrayList
                                // gives the caller the same Book references but prevents it from adding/removing
                            // elements from the service's own List by accident.
    }
}