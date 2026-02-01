class College {
    String collegeName;
    String location;

    void displayDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + location);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating College objects
        College c1 = new College();
        c1.collegeName = "IIT Delhi";
        c1.location = "New Delhi";

        College c2 = new College();
        c2.collegeName = "NIT Surathkal";
        c2.location = "Karnataka";

        College c3 = new College();
        c3.collegeName = "Anna University";
        c3.location = "Chennai";

        // Printing college details
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}
