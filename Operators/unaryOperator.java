package Operators;

public class unaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Unary plus
        int unaryPlusA = +a; // Same as a
        int unaryPlusB = +b; // Same as b

        // Unary minus
        int unaryMinusA = -a; // Negation of a
        int unaryMinusB = -b; // Negation of b

        // Increment operator
        int incrementA = a++; // Post-increment: returns a, then increments
        int incrementB = ++b; // Pre-increment: increments b, then returns it

        // Decrement operator
        int decrementA = a--; // Post-decrement: returns a, then decrements
        int decrementB = --b; // Pre-decrement: decrements b, then returns it

        System.out.println("Unary Plus A: " + unaryPlusA);
        System.out.println("Unary Plus B: " + unaryPlusB);
        System.out.println("Unary Minus A: " + unaryMinusA);
        System.out.println("Unary Minus B: " + unaryMinusB);
        System.out.println("Increment A (post): " + incrementA);
        System.out.println("Increment B (pre): " + incrementB);
        System.out.println("Decrement A (post): " + decrementA);
        System.out.println("Decrement B (pre): " + decrementB);
    }
    
}
