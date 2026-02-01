class Book {
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating Book objects
        Book b1 = new Book();
        b1.title = "Java Basics";
        b1.author = "James Gosling";
        b1.price = 450;

        Book b2 = new Book();
        b2.title = "Python for Beginners";
        b2.author = "Guido van Rossum";
        b2.price = 500;

        Book b3 = new Book();
        b3.title = "Data Structures";
        b3.author = "Mark Allen Weiss";
        b3.price = 600;

        // Displaying book details
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}
