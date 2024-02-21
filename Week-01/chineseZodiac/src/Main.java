import java.util.*;
public class Main {
    public static void main(String[] args) {
        //This program prints your chinese zodiac according to your birth year.
        Scanner input = new Scanner(System.in);
        //This code line takes birth year from user.
        System.out.print("Enter the birth year: ");
        int birthYear = input.nextInt();
        //This code line calculates your chinese zodiac according to remain of your (birth year / 12)
        int remain = birthYear % 12;

        //This switch block prints your chinese zodiac according to value of "remain".
        switch (remain){
            case 0:
                System.out.println("Your chinese zodiac: Monkey");
                break;
            case 1:
                System.out.println("Your chinese zodiac: Rooster");
                break;
            case 2:
                System.out.println("Your chinese zodiac: Dog");
                break;
            case 3:
                System.out.println("Your chinese zodiac: Pig");
                break;
            case 4:
                System.out.println("Your chinese zodiac: Mouse");
                break;
            case 5:
                System.out.println("Your chinese zodiac: Steer");
                break;
            case 6:
                System.out.println("Your chinese zodiac: Tiger");
                break;
            case 7:
                System.out.println("Your chinese zodiac: Rabbit");
                break;
            case 8:
                System.out.println("Your chinese zodiac: Dragon");
                break;
            case 9:
                System.out.println("Your chinese zodiac: Snake");
                break;
            case 10:
                System.out.println("Your chinese zodiac: Horse");
                break;
            case 11:
                System.out.println("Your chinese zodiac: Sheep");
                break;
            default:
                System.out.println("You entered an invalid birth year!");
        }
    }
}