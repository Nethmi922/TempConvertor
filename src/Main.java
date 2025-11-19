
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temperature;
        double newTemperature;
        String unit;

        System.out.println();
        System.out.println("------**Temperature Conversion Program**------");
        System.out.println();

        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Enter the unit(F/C): ");
        unit = scanner.next().toUpperCase();

        newTemperature = (unit.equals("C")) ? (temperature*5/9)+32 : (temperature-32)*5/9;

        System.out.printf("%.2f°%s in °%s is: %.2f\n",temperature,unit,(unit.equals("C")) ? "F":"C",newTemperature);


        scanner.close();

    }
}