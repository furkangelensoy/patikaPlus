import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // This program takes 3 integers from user like a,b,c and prints (a+b*c-b).

        //This scanner method takes integers from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();
        //This line of code calculates the result
        int result = a + (b*c) - b;
        //This line of code prints the result
        System.out.println("Result: " + result);
    }
}