package ie.atu.oop.week1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//Responsibility: Book knows how one Book behaves. LibraryService owns the List<Book>.
        // BookFileStore knows the file location and CSV
        //representation. Main coordinates the application.


public class BookFileStore {

    private final Path file;

    public BookFileStore(Path file) {
        this.file = file;
    }

    private String toCsvRow(Book book) {
        return book.getTitle() + ","
                + book.getAuthor() + ","
                + book.getPageCount() + ","
                + book.getStatus();
    }

    public void save(List<Book> books) throws IOException {
        Files.createDirectories(file.getParent());
        List<String> lines = new ArrayList<>();
        lines.add("title,author,pageCount,status");
        for (Book book : books) {
            lines.add(toCsvRow(book));
        }
        Files.write(file, lines);
    }

    // The Book constructor creates a valid AVAILABLE object. If the saved CSV row says
    // ON_LOAN, use the existing guarded operation borrowBook(). Persistence should rebuild
    // the object through its public behaviour rather than creating a back door into private state.
    private Book fromCsvRow(String row) {
        String[] parts = row.split(",", -1);
        if (parts.length != 4) {
            throw new IllegalArgumentException(
                    "Invalid CSV row: " + row);
        }
        int pageCount = Integer.parseInt(parts[2]);
        Book book = new Book(
                parts[0],
                parts[1],
                pageCount);
        if (parts[3].equals("ON_LOAN")) {
            book.borrowBook();
        }
        return book;
    }

    public List<Book> load() throws IOException {
        List<Book> books = new ArrayList<>();
        if (Files.notExists(file)) {
            return books;
        }
        List<String> lines = Files.readAllLines(file);
        for (int i = 1; i < lines.size(); i++) { // index 0 is the header so the list of books technically begins at 1
            String row = lines.get(i);
            if (!row.isBlank()) {
                books.add(fromCsvRow(row));
            }
        }
        return books;
    }
}

