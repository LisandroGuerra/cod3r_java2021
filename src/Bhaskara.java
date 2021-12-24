import java.util.Scanner;
import java.lang.Math;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Let's calculate the roots with Bhaskara !");

        System.out.print("Enter value to a: ");
        double a = entry.nextDouble();

        System.out.print("Enter value to b: ");
        double b = entry.nextDouble();

        System.out.print("Enter value to c: ");
        double c = entry.nextDouble();

        // logic
        double delta = Math.pow(b, 2) - 4 * a * c;
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nThe given values are: a = %.2f, b = %.2f and c = %.2f. \n", a, b, c);
        System.out.printf("The calculated Delta is %.2f. \n", delta);
        System.out.printf("The calculated first root is %.2f. \n", root1);
        System.out.printf("The calculated second root is %.2f. \n", root2);
    }
}
