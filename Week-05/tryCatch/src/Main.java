import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        print();
        System.out.println("Program has finished!");
    }
    public static void print(){
        //This method has an array with 10 elements, and it returns a philosopher's name from array according to input from user.
        //If the input value out of array's bounds it catches the exception with try-catch blocks and prints a message.
        //Or the input is not a number it catches the exception and prints a message
        String[] philosophers = {"Immanuel Kant","David Hume","Socrates",
                "Friedrich Nietzsche","Karl Marx","Hegel","Epicurus",
                "Spinoza","Confucius","René Descartes"};
        System.out.println("Enter a number beetween 0-9");
        System.out.print("Number: ");
        Scanner input = new Scanner(System.in);

        try {
            int number = input.nextInt();
            System.out.println(philosophers[number]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("You have entered an invalid number. The number, out of array's bounds!");
        }catch (Exception e){
            System.out.println("You have entered a not number input");
        }
    }
}