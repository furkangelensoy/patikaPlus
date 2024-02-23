import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This program calculates the result based on the exponent of a number.
        //Please enter numbers greater than or equal to 0, for exponent value!
        Scanner input = new Scanner(System.in);
        //This code line takes base number and value of exponent from user.
        System.out.print("Enter a base number: ");
        int number = input.nextInt();
        System.out.print("Enter value of exponent: ");
        int power = input.nextInt();
        //Calls the powerCalculator (recursive) method and prints the result to the screen.
        System.out.println("Result: " + powerCalculator(number, power));

    }

    //This method calls itself by decreasing the "power" value by 1 until value of "power" equals to 0.
    public static int powerCalculator(int number, int power) {
        if (power == 0) {
            return 1;
        } else {
            return number * powerCalculator(number, power - 1);
        }
    }
}