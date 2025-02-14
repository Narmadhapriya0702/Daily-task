import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();

        // Variable to store the sum of even numbers
        int sum = 0;

        // Loop through all numbers from 1 to n and check if they are even
        for (int i = 2; i <= n; i += 2) {
            sum += i; // Add even numbers to sum
        }

        // Output the sum of even numbers
        System.out.println("The sum of all even numbers up to " + n + " is: " + sum);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
