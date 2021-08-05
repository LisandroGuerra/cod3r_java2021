import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        // (ºF - 32) * 5/9 = ºC
        final int OFFSET = 32;
        final double FACTOR = (5.0/9.0);
        double fahrenheit;
        double celsius;

        System.out.println("Enter the temperature in ºF: ");
        Scanner temperature = new Scanner(System.in);
        fahrenheit = Double.parseDouble(temperature.nextLine());

        celsius = (fahrenheit - OFFSET) * FACTOR;
        System.out.println(fahrenheit + "ºF corresponds to " + celsius + "ºC.");
    }
}
