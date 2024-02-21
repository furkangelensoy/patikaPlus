import java.util.*;

public class Main {
    public static void main(String[] args) {
        //This program takes an integer value from user and prints it is "perfect number" or "not".
        Scanner input = new Scanner(System.in);
        boolean isNumberPositive = false;
        int number, sum = 0;
        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
            if (number > 0) {
                isNumberPositive = true;
            } else {
                System.out.println("You have entered 0 or a negative integer! Please try again.");
            }
        } while (isNumberPositive == false);

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " is a perfect number!");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}