package abstraction;

public class abstractmain {

    public static void main(String[] args) {
        // We can't create an object of an abstract class directly.
        // But we can reference it using a subclass object.
        
        abstractiondemo ob = new abstractimpl();
        ob.add();   // Calls implemented method
          // Calls concrete method from abstract class
    }
}
