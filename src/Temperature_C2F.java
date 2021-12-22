import java.util.Scanner;

public class Temperature_C2F {
    public static void main(String[] args) {
        // (ºC * 5/9) + 32 = ºF
        final int OFFSET = 32;
        final double FACTOR = (5.0/9.0);
        double fahrenheit;
        double celsius;

        System.out.print("Enter the temperature in ºC: ");
        Scanner temperature = new Scanner(System.in);
        celsius = Double.parseDouble(temperature.nextLine());
        temperature.close();

        fahrenheit = (celsius * FACTOR) + OFFSET;
        System.out.printf("%.2fºC corresponds to %.2fºF.", celsius, fahrenheit);
    }
}
