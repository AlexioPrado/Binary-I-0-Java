// Main.java — ENTRY POINT  [20 pts]
// Responsibility: Creates the three MVC components and wires them together.
// Run this file to test your complete implementation.

public class Main {
    public static void main(String[] args) {

        // TODO (1): Create a Book model with:
        //             title  = "Clean Code"
        //             author = "Robert C. Martin"
        //             year   = 2008
        Book book1 = Book("Clean Code", "Robert C. Martin", 2008);

        // TODO (2): Create a BookView
        BookView bookView1 = BookView();

        // TODO (3): Create a BookController, passing in your Book and BookView
        BookController bookCtrl = BookController(book1, bookView1);

        // TODO (4): Call showBook() to display the book's initial details
        bookCtrl.showBook();

        // TODO (5): Call updateYear(2020), then call showBook() again
        //           Expected: "Year updated." followed by the updated details
        bookCtrl.updateYear(2020);

        // TODO (6): Call updateYear(3000)
        //           Expected: "Invalid year."
        bookCtrl.updateYear(3000);
    }
}
