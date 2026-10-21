Lab 1:
-------------------------------------------
Book Tracker application

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

Lab 3:
-------------------------------------------
Encapsulation design The seven-day call reached Book.borrowBook() because 7 
    is within the set range (1-14) for taking a book out. 15 is not

The first Book is listed as AVAILABLE before the fifteen-day call because
    all books are AVAILABLE by default/at the start until they get borrowed.

The constructor checks for null first to avoid a nullpointexception error

title, author and pageCount are final because they cannot be altered. Status
    changes whether or not someone takes a book out.

borrowBook and returnBook are used so that errors can be thrown if someone
    tries to take a book out or return it when someone else has already done so.

LibraryService relates to taking/returning books (and for how long they
    can be taken out for), while Book relates to the books themselves (title, author, pageCount...)

Successful loan: 
N/A. Does not print anything. Only changes the status of the book

Rejected loan: Loan days must be from 1 to 14

Rejected return: Book must not be null


Lab 4:
-------------------------------------------
Lab 4 changes LibraryService from working with a single supplied Book
    to owning a List\<Book>

List\<Book> groups objects under a particular name.

final does not prevent books.add() because final relates to the
    objects inside the array and not the array itself.

The enhanced for loop ensures that no matter how big the
    array of books becomes, the for loop will always
    loop the correct amount of times.

Known: book title ; Unknown: null

Redundancy. If the code to search for a book already
    exists then there is no need to make another loop. Reusing
    findBookByTitle reduces the amount of lines of code needed overall.

Build success:
[INFO] --- jar:3.4.1:jar (default-jar) @ book-Tracker ---
[INFO] Building jar: C:\Users\JESSEPRIETOSOLOVYOVA\IdeaProjects\oop-lab1\target\book-Tracker-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.052 s
[INFO] Finished at: 2026-10-12T10:22:24+01:00
[INFO] ------------------------------------------------------------------------

Process finished with exit code 0


No AI was used in the making of this program

Lab 5:
-------------------------------------------
Lab 5 adds exception handling and CSV persistence (states being remembered even after reset)
    to the library application.

throw will return an exception which halts the program. catch
    decides what to do if a particular exception is returned, e.g.
    printing something. The program handles exceptions during catch whereas
    throw just puts them out.

Path.of(...) shows which files/folders lead to the file you're looking for
    (which is often in the brackets). One Path method: "Path.of("data", "books.csv"));"
    and one Files method: "Files.exists(file)". The former checks the path of books.csv
    and the latter checks if the file itself exists.

IOException is a general error while NumberFormatException is an exception
    specifically for when a certain type of number is expected & not given.

Path handles the direction the program goes in to get the files, while Files
    concerns the files themselves rather than how to get to them


CSV contents:

"title,author,pageCount,status

Dune,Frank Herbert,412,ON_LOAN

Clean Code,Robert C. Martin,464,AVAILABLE"

No AI assistance or materials were used in the making of this lab.