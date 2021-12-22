import java.util.Scanner;

public class Temperature_F2C {

    public static void main(String[] args) {
        // (ºF - 32) * 5/9 = ºC
        final int OFFSET = 32;
        final double FACTOR = (5.0/9.0);
        double fahrenheit;
        double celsius;

        System.out.print("Enter the temperature in ºF: ");
        Scanner temperature = new Scanner(System.in);
        fahrenheit = Double.parseDouble(temperature.nextLine());
        temperature.close();

        celsius = (fahrenheit - OFFSET) * FACTOR;
        System.out.printf("%.2fºF corresponds to %.2fºC.", fahrenheit, celsius);
    }
}
