package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        try
        {
            Book myBook = new Book("Dune", "Frank", 0);
            System.out.println(myBook.getTitle());
            System.out.println(myBook.getAuthor());
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage);
        }
    }
}