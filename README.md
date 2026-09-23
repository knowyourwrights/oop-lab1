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


-------------------------------------------

fdgkvfbv
This book is Dune
The author of this book is Frank Herbert
The page count of this book is 412
The status of this book is true


Dune borrowed successfully.
This book is Dune
The author of this book is Frank Herbert
The page count of this book is 412
The status of this book is false




This book is The life and times of Thunderbolt
The author of this book is Frank Black
The page count of this book is 12
The status of this book is true


This book is Another Book Code
The author of this book is John Murphy
The page count of this book is 333
The status of this book is true


This book is Student Life
The author of this book is Mary Shelley
The page count of this book is 442
The status of this book is true


Dune is already on loan.

-------------------------------------------