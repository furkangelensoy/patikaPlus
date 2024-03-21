import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        print();
        System.out.println("Program has finished!");
    }
    public static void print() {
        //This method has an array with 10 elements and it returns a philosopher's name from array according to input from user.
        //If input value out of array's bound it catches exception with try-catch and prints a message.
        //If input is not a number it catches exception and prints a message.
        String[] philosophers = new String[]{"Immanuel Kant", "David Hume", "Socrates", "Friedrich Nietzsche", "Karl Marx", "Hegel", "Epicurus", "Spinoza", "Confucius", "René Descartes"};
        System.out.println("Enter a number beetween 0-9");
        System.out.print("Number: ");
        Scanner input = new Scanner(System.in);

        try {
            int number = input.nextInt();
            System.out.println(philosophers[number]);
        } catch (IndexOutOfBoundsException var3) {
            System.out.println("You have entered an invalid number. The number, out of array's bounds!");
        } catch (Exception var4) {
            System.out.println("You have entered a not number input!");
        }

    }
}