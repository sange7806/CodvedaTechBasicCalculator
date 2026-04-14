import java.util.Scanner;

public class BasicCalculator {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== BASIC CALCULATOR ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Choose an operation: ");

            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;

                try {
                    switch (choice) {
                        case 1:
                            result = add(num1, num2);
                            System.out.println("Result: " + result);
                            break;

                        case 2:
                            result = subtract(num1, num2);
                            System.out.println("Result: " + result);
                            break;

                        case 3:
                            result = multiply(num1, num2);
                            System.out.println("Result: " + result);
                            break;

                        case 4:
                            result = divide(num1, num2);
                            System.out.println("Result: " + result);
                            break;
                    }
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            }

        } while (choice != 0);

        System.out.println("Calculator closed.");
        scanner.close();
    }
}