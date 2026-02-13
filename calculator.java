package com.example;

import java.util.Scanner;

public class Calculator {

    // Basic Operations
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
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot find square root of negative number!");
        }
        return Math.sqrt(a);
    }

    // Main Method (Console Application)
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Simple Java Calculator =====");

        while (true) {

            System.out.println("\nChoose Operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 8) {
                System.out.println("Exiting Calculator...");
                break;
            }

            try {
                double num1, num2, result = 0;

                if (choice == 7) {
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    result = calc.squareRoot(num1);
                } else {
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    switch (choice) {
                        case 1:
                            result = calc.add(num1, num2);
                            break;
                        case 2:
                            result = calc.subtract(num1, num2);
                            break;
                        case 3:
                            result = calc.multiply(num1, num2);
                            break;
                        case 4:
                            result = calc.divide(num1, num2);
                            break;
                        case 5:
                            result = calc.modulus(num1, num2);
                            break;
                        case 6:
                            result = calc.power(num1, num2);
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            continue;
                    }
                }

                System.out.println("Result: " + result);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
