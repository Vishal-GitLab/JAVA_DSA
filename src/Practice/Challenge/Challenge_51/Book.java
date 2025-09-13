package src.Practice.Challenge.Challenge_51;

public class Book {
    // A static variable shared by all objects of this class
    // It keeps track of the total number of Book objects created.
    static  int totalNumberOfBook;
    String author;
    String title;
    String isbn;
    boolean isBorrowed; // To check if book is borrowed or not (default = false)


// Static block: runs only once when the class is first loaded
    static {
        totalNumberOfBook = 0;
    }
    // Instance initializer block: runs every time a new object is created
    {
        totalNumberOfBook++;
    }

// Constructor with 3 parameters
    Book(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }
      Book(String isbn) {this(isbn, "Unknown","Unknown");}
    // Static method to return how many books were created
    static  int getTotalNumberOfBook() { return totalNumberOfBook;}

    // Static method to return how many books were created
    void barrowBook() {
        if (isBorrowed) {
            System.out.println("You are already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    // Method to return a book
    void returnBook() {
        if (isBorrowed) { // If the book was borrowed
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please Leave a review");
        }
        else {  // If already in library (not borrowed)
            System.out.println("This book is the already in library");
        }
    }


    public static void main(String[] args) {
        // Create first book object (author="1", title="Design", isbn="Author")
        Book DesignOfThings  = new Book("1", "Design","Author" );
        // Create second book object using constructor with only 1 parameter
        // Actually saves: author="2", title="Unknown", isbn="Unknown"
        Book myBook = new Book("2");
        // Print total number of books created
        System.out.println(Book.getTotalNumberOfBook());
        DesignOfThings.barrowBook();
        // Borrow myBook → not borrowed yet → success
        myBook.barrowBook();
        // Try borrowing DesignOfThings again → already borrowed
        DesignOfThings.barrowBook();
        // Return DesignOfThings → changes back to available
        DesignOfThings.returnBook();
        // Borrow DesignOfThings again → now works
        DesignOfThings.barrowBook();
    }
}


