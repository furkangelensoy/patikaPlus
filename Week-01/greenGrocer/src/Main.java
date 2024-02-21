import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //This code line keeps prices of products
        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;
        double total = 0;
        //This code line takes information of product's kilogram
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of Pear: ");
        double pearWeight = input.nextDouble();
        System.out.print("Enter the wegiht of Apple: ");
        double appleWeight = input.nextDouble();
        System.out.print("Enter the weight of Tomato: ");
        double tomatoWeight = input.nextDouble();
        System.out.print("Enter the weight of Banana: ");
        double bananaWeight = input.nextDouble();
        System.out.print("Enter the weight of Eggplant: ");
        double eggplantWeight = input.nextDouble();
        //This code line calculate total price
        total = (pearPrice * pearWeight) + (applePrice * appleWeight) + (tomatoPrice * tomatoWeight) +
                (bananaPrice * bananaWeight) + (eggplantPrice * eggplantWeight);
        //This code line prints total price
        System.out.println("Total Price: " + total);

    }
}