import java.util.Scanner;

public class TemperatureConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Prompting the user to choose between fahrenheit or celsius
        System.out.println("Press 1 to convert from fahrenheit to celsius,\nPress 2 to convert from celsius to Fahrenheit: ");
        int choice = scanner.nextInt();

        int result;

        //computing for fahrenheit to celsius
        if (choice == 1) {
            System.out.println("Input the fahrenheit value: ");
            int fvalue = scanner.nextInt();

            result = (fvalue - 32) * 5/9;
            System.out.println(fvalue + " " + "fahrenheits converted to celsius is " + result);
        } else if (choice == 2) {
            System.out.println("Input the celsius value: ");
            int cvalue = scanner.nextInt();

            result = (cvalue * 9/5) + 32;
            System.out.println(cvalue + " " + "celsius converted to fahrenheits is " + result);
        }
        else {
            System.out.println("Restart and chose 1 or 2");
        }
        scanner.close();
    }
}

