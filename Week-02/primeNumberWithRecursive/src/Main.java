import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This program takes a number from user and checks it is "prime" or "not".
        Scanner input = new Scanner(System.in);
        //Takes an integer from user.
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        //This variable will be used to divide the number received from the user.
        int divider = 2;
        //
        if (isPrime(number, divider)){
            System.out.println(number + " is a prime number!");
        }else {
            System.out.println(number + " is not a prime number!");
        }
    }

    //This isPrime(recursive)method calls itself by increasing the "divider"
    // value by 1 until "divider" equals to "number"(from user).
    //Or until the "number" is evenly divided.
    //This method returns "true" or "false".
    public static boolean isPrime(int number, int divider) {
        if (divider == number || number == 2){
            return true;
        }
        if (number % divider == 0 || number < 2){
            return false;
        }
        return isPrime(number,divider + 1);
    }
}