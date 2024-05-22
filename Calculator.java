import java.util.Scanner;

public class Calculator {
    private double first, second;
    private char op;

    //Function for user to call
    public void basicCalculator(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("THIS IS A BASIC CALCULATOR PROGRAM\n");
            char option = '0';

            while (option == '0') {
                input();
                operations(first, second, op);

                System.out.print("\nPress 0 to calculate again: ");
                option = sc.next().charAt(0);
            }
        }
        catch (Exception e){
            System.out.println("\nINPUT MISMATCH, PLEASE TRY AGAIN");
        }
        finally {
            System.out.println("\nThank You for using the Calculator");
        }

    }

    //Takes input from the user
    private void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        first = sc.nextDouble();

        System.out.print("Enter second number: ");
        second = sc.nextDouble();

        System.out.print("Enter operator: ");
        op = sc.next().charAt(0);

    }

    //Performs operations on the given input
    private void operations(double a, double b, char op) {
        switch (op) {
            case '+' -> System.out.println("Sum = " + (a + b));
            case '-' -> System.out.println("Difference = " + (a - b));
            case '*' -> System.out.println("Product = " + (a * b));
            case '/' -> {
                if (b != 0) {
                    System.out.println("Quotient = " + (a / b));
                } else {
                    System.out.println("Cannot Divide by Zero");
                }
            }
            default -> System.out.println("\nIncorrect Operator. Try again.");
        }
    }
}