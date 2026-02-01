class Printer {

    // Print integer
    void print(int number) {
        System.out.println("Integer: " + number);
    }

    // Print string
    void print(String message) {
        System.out.println("Message: " + message);
    }

    // Print integer and string
    void print(int number, String message) {
        System.out.println("Integer: " + number + ", Message: " + message);
    }

    public static void main(String[] args) {
        Printer p = new Printer();

        p.print(100);                        // calls first method
        p.print("Hello World!");             // calls second method
        p.print(50, "Java Programming");     // calls third method
    }
}
