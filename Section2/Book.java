class Book {
    private String title;
    private boolean isAvailable;

    // Constructor to set title and availability
    Book(String title) {
        this.title = title;
        this.isAvailable = true; // initially available
    }

    // Method to borrow book
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry! \"" + title + "\" is already borrowed.");
        }
    }

    // Method to return book
    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned \"" + title + "\".");
        } else {
            System.out.println("\"" + title + "\" was not borrowed.");
        }
    }

    // Method to display status
    void displayStatus() {
        System.out.println("Book: " + title + " | Available: " + isAvailable);
    }

    public static void main(String[] args) {
        Book b = new Book("Java Programming");

        b.displayStatus();
        b.borrowBook();   // borrow
        b.borrowBook();   // try to borrow again
        b.returnBook();   // return
        b.returnBook();   // try to return again
        b.displayStatus();
    }
}
