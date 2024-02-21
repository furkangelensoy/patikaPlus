import java.util.*;
public class Main {
    public static void main(String[] args) {
        //This program prints largest number and smallest number according to numbers entered by user.
        Scanner input = new Scanner(System.in);

        int largestNumber, smallestNumber, numberCount, firstNumber, number;
        //The loop continues until the user selects at least 2 numbers.
        do{
            System.out.print("How many numbers (You must enter at least 2 numbers!) will you enter: ");
            numberCount = input.nextInt();
        }while (numberCount <= 1);

        //The first number user enters is assumed to be the largest and smallest number
        System.out.print("Enter the 1. number: ");
        firstNumber = input.nextInt();
        largestNumber = firstNumber;
        smallestNumber = firstNumber;
        //This for loop starts from i=2 because the program has already received the first number from user.
        for(int i = 2; i <= numberCount; i++){
            System.out.print("Enter the " + i + ". number: ");
            number = input.nextInt();
            if(number < smallestNumber){
                smallestNumber = number;
            }
            if(number > largestNumber){
                largestNumber = number;
            }

        }

        //This code line prints smallest number and largest number.
        System.out.println("Largest Number: " + largestNumber);
        System.out.println("Smallest Number: " + smallestNumber);
    }
}