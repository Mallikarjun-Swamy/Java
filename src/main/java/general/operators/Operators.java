package general.operators;

public class Operators {

    public static void main(String[] args) {

        System.out.println("========= ARITHMETIC OPERATORS =========");

        int a = 10;
        int b = 3;
        System.out.println("Initial a = "+ a +" and b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); // integer division
        System.out.println("a % b = " + (a % b));
        System.out.println("----------------------------------------\n");


        System.out.println("========= UNARY OPERATORS =========");
        int x = 5;

        System.out.println("Initial x = " + x);
        System.out.println("Pre-increment (++x) = " + (++x));
        System.out.println("Post-increment (x++) = " + (x++));
        System.out.println("Value of x now = " + x);

        System.out.println("Pre-decrement (--x) = " + (--x));
        System.out.println("Post-decrement (x--) = " + (x--));
        System.out.println("Value of x now = " + x);

        System.out.println("Unary plus (+x) = " + (+x));
        System.out.println("Unary minus (-x) = " + (-x));

        boolean flag = true;
        System.out.println("Logical NOT (!flag) = " + (!flag));
        System.out.println("----------------------------------------\n");


        System.out.println("========= ASSIGNMENT OPERATORS =========");

        int p = 20;

        System.out.println("Initial p = " + p);
        p += 5; // p = p + 5
        System.out.println("p += 5 → " + p);
        p -= 3;
        System.out.println("p -= 3 → " + p);
        p *= 2;
        System.out.println("p *= 2 → " + p);
        p /= 4;
        System.out.println("p /= 4 → " + p);
        p %= 3;
        System.out.println("p %= 3 → " + p);
        System.out.println("----------------------------------------\n");


        System.out.println("========= RELATIONAL OPERATORS =========");
        int r1 = 10;
        int r2 = 20;
        System.out.println("r1 == r2 = " + (r1 == r2));
        System.out.println("r1 != r2 = " + (r1 != r2));
        System.out.println("r1 > r2 = " + (r1 > r2));
        System.out.println("r1 < r2 = " + (r1 < r2));
        System.out.println("r1 >= r2 = " + (r1 >= r2));
        System.out.println("r1 <= r2 = " + (r1 <= r2));
        System.out.println("----------------------------------------\n");


        System.out.println("========= LOGICAL OPERATORS =========");
        boolean t = true, f = false;

        System.out.println("t && f = " + (t && f));
        System.out.println("t || f = " + (t || f));
        System.out.println("!t = " + (!t));
        System.out.println("----------------------------------------\n");


        System.out.println("========= BITWISE OPERATORS =========");
        int bitA = 5;   // 0101
        int bitB = 3;   // 0011

        System.out.println("bitA & bitB = " + (bitA & bitB)); // AND
        System.out.println("bitA | bitB = " + (bitA | bitB)); // OR
        System.out.println("bitA ^ bitB = " + (bitA ^ bitB)); // XOR
        System.out.println("~bitA = " + (~bitA));             // NOT

        System.out.println("bitA << 1 = " + (bitA << 1)); // Left shift
        System.out.println("bitA >> 1 = " + (bitA >> 1)); // Right shift
        System.out.println("bitA >>> 1 = " + (bitA >>> 1)); // Unsigned right shift
        System.out.println("----------------------------------------\n");


        System.out.println("========= TERNARY OPERATOR =========");
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Result = " + result);
        System.out.println("----------------------------------------\n");


        System.out.println("========= TYPE CASTING OPERATORS =========");

        // Primitive Casting
        double d = 10.75;
        int i = (int) d; // Narrowing
        System.out.println("Narrowing casting double→int: " + i);

        int num = 100;
        double num2 = num; // Widening
        System.out.println("Widening casting int→double: " + num2);

        // Object Casting
        Animal animal = new Dog(); // Upcasting
        Dog dog = (Dog) animal;    // Downcasting

        System.out.println("Upcasting example executed.");
        System.out.println("Downcasting example executed.");
        System.out.println("----------------------------------------\n");


        System.out.println("========= INSTANCEOF OPERATOR =========");
        System.out.println("animal instanceof Dog = " + (animal instanceof Dog));
        System.out.println("dog instanceof Animal = " + (dog instanceof Animal));
        System.out.println("----------------------------------------\n");
    }
}

// Supporting Classes for Casting Examples
class Animal { }

class Dog extends Animal { }