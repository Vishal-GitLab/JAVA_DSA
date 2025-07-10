package src.ProgramingChallenge_2;

public class Book {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;


    static {
        totalNoOfBooks = 0;
    }
    {                    // object init                non static
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author) {                              // ye hai mera constructor
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(String isbn) {
        this(isbn,"Unknown","Unknown" );
    }

    static int getTotalNoOfBooks() {                         // method 1
        return totalNoOfBooks;
    }

     void barrowBook() {                                      // method 2
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
     }

     void returnBook() {                                       // method 2
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        } else {
            System.out.println("This book is already in the library");
        }
     }

     public static void main(String[] args) {
         Book designOfThings = new Book("1", "Design", "Author");
         Book myBook = new Book("2");
         System.out.println(Book.getTotalNoOfBooks());
         designOfThings.barrowBook();
         myBook.barrowBook();
         designOfThings.barrowBook();
         designOfThings.returnBook();
         designOfThings.returnBook();
     }














}
