import java.util.*;
public class Main {
    public static void main(String[] args) {
        //This program takes 2 variables integer,double and changes data types integer to double, double to integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int integer = input.nextInt();
        System.out.print("Enter a decimal number: ");
        double decimal = input.nextDouble();
        //Changes data types
        double newInteger = integer;
        int newDecimal = (int) decimal;
        //Prints new types
        System.out.println("Integer to double: " + newInteger);
        System.out.println("Double to integer: " + newDecimal);
    }
}