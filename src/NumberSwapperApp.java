import java.util.Scanner;

class NumberSwapper {
    private int first;
    private int second;

    public void setNumbers(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void swapNumbers() {
        System.out.println("Before swapping: first = " + first + ", second = " + second);

        // Using bitwise XOR to swap the numbers
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After swapping: first = " + first + ", second = " + second);
    }
}

public class NumberSwapperApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter the first number");
        int first = scanner.nextInt();

        System.out.println("Enter the second number");
        int second = scanner.nextInt();

        // Create NumberSwapper object
        NumberSwapper numberSwapper = new NumberSwapper();

        // Set user input
        numberSwapper.setNumbers(first, second);

        // Swap and print the numbers
        numberSwapper.swapNumbers();

        // Close the scanner
        scanner.close();
    }
}
