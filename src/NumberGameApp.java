import java.util.Scanner;

class NumberGame {
    private int num1;
    private int num2;
    private int num3;

    public void setNumbers(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void findSmallestNumber() {
        int smallest = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("The smallest number is: " + smallest);
        }
    }
}

public class NumberGameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number");
        int num3 = scanner.nextInt();

        // Create NumberGame object
        NumberGame numberGame = new NumberGame();

        // Set user input
        numberGame.setNumbers(num1, num2, num3);

        // Find and print the smallest number
        numberGame.findSmallestNumber();

        // Close the scanner
        scanner.close();
    }
}
