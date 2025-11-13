package person1;

// Define a record
record persons(String name, int age) {}

public class person1 {
    public static void main(String[] args) {
        // Create an array of record objects
        persons[] p = {
            new persons("ijk", 87),
            new persons("abcd", 87)
        };

        // Display the details
        for (persons person : p) {
            System.out.println("Name: " + person.name() + ", Age: " + person.age());
        }
    }
}
