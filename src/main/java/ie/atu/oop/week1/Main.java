package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("fdgkvfbv");

        Book firstBook = new Book();
        firstBook.title = "Dune";
        firstBook.author = "Frank Herbert";
        firstBook.pageCount = 412;

        firstBook.displayDetails();
        firstBook.borrowBook();
        firstBook.displayDetails();

        /*

        Book secondBook = new Book();
        secondBook.title = "The life and times of Thunderbolt";
        secondBook.author = "Frank Black";
        secondBook.pageCount = 12;
        secondBook.available = true;

        secondBook.displayDetails();

        */

        // creating new books
        Book secondBook = createBook("The life and times of Thunderbolt", "Frank Black", 12);
        Book thirdBook = createBook("Another Book Code", "John Murphy", 333);
        Book fourthBook = createBook("Student Life", "Mary Shelley", 442);

        System.out.println("\n");
        secondBook.displayDetails();
        thirdBook.displayDetails();
        fourthBook.displayDetails();

        firstBook.borrowBook();
    }
    private static Book createBook(String title, String author, int pageCount)
    {
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.pageCount = pageCount;
        return book;
    }
}