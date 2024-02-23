import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This program takes a positive number from user and decreases it by 5 until it is smaller than or equal to 0.
        //Then increases by 5 until it equals first input from user.
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int resultFromMinus = patternMinus(number);
        patternSum(resultFromMinus,number);
    }

    //This method takes 2 parameters, 1 - integer value from patterMinus 2- "number" variable received from the user.
    //This method calls itself and increases value of resultFromMinus by 5 until equal to "number".
    public static int patternSum(int resultFromMinus,int number) {
        System.out.print(resultFromMinus + " ");
        if (resultFromMinus < number){
            return patternSum(resultFromMinus + 5,number);
        }else{
            return resultFromMinus;
        }
    }
    //This method takes 1 parameters, 1-"number" variable received from the user.
    //This method calls itself and decreases value of the number until value of number less than or equal to 0.
    public static int patternMinus(int number){
        if (number > 0){
            System.out.print(number + " ");
            return patternMinus(number - 5);
        }else {
            return number;
        }
    }
}