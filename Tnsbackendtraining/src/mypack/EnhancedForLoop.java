package mypack;
//class
public class EnhancedForLoop {
    public static void main(String[] args) {

        // Array of items
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango"};

        System.out.println("List of Fruits:");

        // Enhanced for loop (for-each loop)
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("All fruits are listed!");
    }
}
