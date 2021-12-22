import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = entry.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = entry.nextDouble();

        System.out.print("Choose an operation (+,-,*,/,%): ");
        String op = entry.next();

        //logic
        double result = "+".equals(op) ? number1 + number2 : 0;
        result = "-".equals(op) ? number1 - number2 : result;
        result = "*".equals(op) ? number1 * number2 : result;
        result = "/".equals(op) ? number1 / number2 : result;
        result = "%".equals(op) ? number1 % number2 : result;

        System.out.printf("%.2f %s %.2f = %.2f", number1, op, number2, result);

        entry.close();
    }
}
