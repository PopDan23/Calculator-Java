import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read input from the user
        System.out.println("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Enter an operator (+, -, *, /, %, ^, r): ");
        char operator = input.next().charAt(0);

        double result = 0;
        // Perform the calculation based on the operator
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                result = num1 / num2;
                break;

            case '%':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                result = num1 % num2;
                break;

            case '^':
                result = Math.pow(num1, num2);
                break;

            case 'r':
                if (num1 < 0 ) {
                    System.out.println("Error: Cannot take square root of a negative number.");
                    return;
                }
                result = Math.sqrt(num1);
                break;

            default:
                System.out.println("Error: Invalid operator.");
                return;
        }
        if(operator == 'r')
        // Print the result of the calculation
        {
            System.out.println (num1 + " " + operator + " " + "=" + result);
        }
        else {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}