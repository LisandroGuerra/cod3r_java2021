import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Entry base value: ");
        double base = entry.nextDouble();

        System.out.print("Entry height value: ");
        double height = entry.nextDouble();

        // Logic Area = b * h / 2

        System.out.printf("The triangle with base %.2f and height %.2f, has an area of %.2f.", base, height, base*height/2);
    }
}
