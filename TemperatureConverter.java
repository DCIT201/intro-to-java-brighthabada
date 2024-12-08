import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose a conversion option
        System.out.println("Choose an option:\n1. Convert Celsius to Fahrenheit\n2. Convert Fahrenheit to Celsius");
        
        // Validate user's choice
        int choice;
        while (true) {
            System.out.print("Enter 1 or 2: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                }
            } 
            System.out.println("Invalid input. Please enter 1 or 2.");
            scanner.nextLine(); // Clear the invalid input
        }

        // Perform the appropriate conversion
        if (choice == 1) {
            System.out.print("Enter the Celsius value: ");
            if (scanner.hasNextDouble()) {
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("%.2f°C converted to Fahrenheit is %.2f°F%n", celsius, fahrenheit);
            } else {
                System.out.println("Invalid temperature input. Please enter a numeric value.");
            }
        } else {
            System.out.print("Enter the Fahrenheit value: ");
            if (scanner.hasNextDouble()) {
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.printf("%.2f°F converted to Celsius is %.2f°C%n", fahrenheit, celsius);
            } else {
                System.out.println("Invalid temperature input. Please enter a numeric value.");
            }
        }

        scanner.close();
    }
}
