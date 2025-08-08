// Program-1 Java:


// Input && Output:
// Enter the Two numbers:
// 2
// 5
// Which Operation Do You perform:
// 1.add
// 2.subtract
// 3.multiply
// 4.divide
// add
// 7.0


import java.util.*;
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }


    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }


    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return add(a, b);
            case "subtract":
                return subtract(a, b);
            case "multiply":
                return multiply(a, b);
            case "divide":
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Operation not in the list");
        }
    }


    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Two numbers:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            sc.nextLine();
            System.out.println("Which Operation Do You perform:\n1.add\n2.subtract\n3.multiply\n4.divide");
            String operation = sc.nextLine();
            System.out.println(myCalculator.calculate(a,b,operation));

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
