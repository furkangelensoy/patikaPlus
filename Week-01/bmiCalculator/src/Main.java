import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //This program receives weight(kg) and height(m) information from user and calculates The Body Mass Index.

        //This code line takes weight and height information from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height(m): ");
        double height = input.nextDouble();
        System.out.print("Enter the weight(kg): ");
        double weight = input.nextDouble();
        //This code line calculates bmi(body mass index)
        double bmi = weight / (height * height);

        //Altenative calculate method with Math class
        //double bmi = weight / Math.pow(height,2);

        //This code line prints bmi
        System.out.println("Your Body Mass Index: " + bmi);
    }
}