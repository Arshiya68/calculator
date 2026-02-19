import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java Calculator <num1> <num2>");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + ((double) a / b));
    }
}
