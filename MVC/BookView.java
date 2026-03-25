// BookView.java — VIEW  [25 pts]
// Responsibility: Handles ALL console output for the application.
// Rule: This class must contain NO business logic (no if/else, no validation).
//       It only prints what it is given.

public class BookView {

    // TODO (1): Write a method called displayBook that accepts:
    //             - title  (String)
    //             - author (String)
    //             - year   (int)
    //           It should print each field on its own line with a label, e.g.:
    //             Title:  Clean Code
    //             Author: Robert C. Martin
    //             Year:   2008
    public void displayBook(String title, String author, int year){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }

    // TODO (2): Write a method called displayMessage that accepts:
    //             - msg (String)
    //           It should print the message to the console.
    public void displayMessage(String msg){
        System.out.println(msg);
    }
}
