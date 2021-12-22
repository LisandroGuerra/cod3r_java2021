import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Let's calculate your Body Mass Index!");
        //BMI = weight / (height * height)

        Scanner entry = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        double height = entry.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = entry.nextDouble();

        //Logic
        double bmi = weight / (height * height);

        System.out.printf("Your BMI is %.2f", bmi);


        entry.close();
    }
}
