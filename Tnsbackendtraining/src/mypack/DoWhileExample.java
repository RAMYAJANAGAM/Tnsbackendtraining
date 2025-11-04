package mypack;

public class DoWhileExample {
    public static void main(String[] args) {

        int i = 1; // initialization

        System.out.println("Even numbers from 1 to 10:");

        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++; // increment
        } while (i <= 10); // condition checked after execution

        System.out.println("All even numbers printed!");
    }
}

