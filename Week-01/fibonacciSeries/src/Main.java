import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This program prints Fibonacci series according to the depth value received from user.
        int firstNumber = 0, secondNumber = 1, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the depth of fibonacci: ");
        int depth = input.nextInt();
        //Prints Fibonacci's first and second element.
        System.out.print(firstNumber + ", " + secondNumber + ", ");
        //Prints Fibonacci
        for (int i = 1; i <= depth - 1; i++) {
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            System.out.print(sum + ", ");
        }
    }
}