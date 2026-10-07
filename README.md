Lab 1: Book Tracker application

Open this project in IntelliJ with JDK 24 and run Main.java

The class book defines title, author, pageCount and whether the book
    is available to take out.
displayDetails() is a void function that shows the specifics of any
    registered book (e.g. firstBook, secondBook ...)
borrowBook changes the availability of a book to false (takes it
    "off the shelf"). If the user attempts to take out a book a second time,
    an error message displays.

Verification of successful run
    The below output shows four different books being displayed. firstBook
    is borrowed at the beginning and the function to borrow it again is
    called at the very end.

Lab 3: Encapsulation design
The seven-day call reached Book.borrowBook() because 7 is within the set
    range (1-14) for taking a book out. 15 is not

The first Book is listed as AVAILABLE before the fifteen-day call because
    all books are AVAILABLE by default/at the start until they get borrowed.

The constructor checks for null first to avoid a nullpointexception error

title, author and pageCount are final because they cannot be altered. Status
    changes whether or not someone takes a book out.

borrowBook and returnBook are used so that errors can be thrown if someone
    tries to take a book out or return it when someone else has already
    done so.

LibraryService relates to taking/returning books (and for how long they can
    be taken out for), while Book relates to the books themselves (title,
    author, pageCount...)

Successful loan:
    N/A. Does not print anything. Only changes the status of the book
Rejected loan:
Loan days must be from 1 to 14
Rejected return:
    Book must not be null

-------------------------------------------