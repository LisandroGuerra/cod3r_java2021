import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = entry.nextDouble();

        System.out.printf("The number is %.2f, the square is %.2f and the cube is %.2f.", number, number*number, number*number*number);
    }
}
