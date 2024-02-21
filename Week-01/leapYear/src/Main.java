import java.util.*;
public class Main {
    public static void main(String[] args) {
        //This program prints the entered value is a leap year or not.
        Scanner input = new Scanner(System.in);
        //This code line takes a value of year from user
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        //This variable calculates leap year according to entered value.
        int leapYear = year % 4;
        //This if block prints "leap year" or "not".
        if(leapYear == 0){
            System.out.println(year + " is a leap year!");
        }else{
            System.out.println(year + " is not a leap year!");
        }
    }
}