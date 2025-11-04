package mypack;

public class operators {
    public static void main(String[] args) {

        int a = 10, b = 5, c = 2;

        // Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        System.out.println("\n=== Logical Operators ===");
        System.out.println("(a > b) && (b > c): " + ((a > b) && (b > c)));
        System.out.println("(a > b) || (b < c): " + ((a > b) || (b < c)));
        System.out.println("!(a > b): " + !(a > b));

        // Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int x = 10;
        System.out.println("x = " + x);
        x += 5;
        System.out.println("x += 5 → " + x);
        x -= 3;
        System.out.println("x -= 3 → " + x);
        x *= 2;
        System.out.println("x *= 2 → " + x);
        x /= 4;
        System.out.println("x /= 4 → " + x);

        // Unary Operators
        System.out.println("\n=== Unary Operators ===");
        int y = 7;
        System.out.println("y = " + y);
        System.out.println("++y = " + (++y)); // pre-increment
        System.out.println("--y = " + (--y)); // pre-decrement
        System.out.println("y++ = " + (y++)); // post-increment
        System.out.println("y-- = " + (y--)); // post-decrement
        System.out.println("Final y = " + y);

        // Bitwise Operators
        System.out.println("\n=== Bitwise Operators ===");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1)); // Left shift
        System.out.println("a >> 1: " + (a >> 1)); // Right shift
    }
}

