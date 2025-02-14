import java.util.Scanner;

public class SwapNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Display the numbers before swapping
        System.out.println("Before swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap the numbers using arithmetic operations (without a third variable)
        num1 = num1 + num2;  // Step 1: num1 becomes the sum of num1 and num2
        num2 = num1 - num2;  // Step 2: num2 becomes the original value of num1
        num1 = num1 - num2;  // Step 3: num1 becomes the original value of num2

        // Display the numbers after swapping
        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Close the scanner
        scanner.close();
    }
}
