import java.util.*;

public class Main {
    public static void main(String[] args) {
       //This program takes age, ticket type, distance informations from user and applies discount according to age and ticket type.
        double distance = 0, pricePerKm, totalPrice, discountPrice, Price, ageDiscount = 0, ticketDiscount = 0, totalDiscount = 0;
        int age = 0, ticketType = 0;

        Scanner input = new Scanner(System.in);
        //Takes age information from user. This while loop, runs until user enter an age value bigger than 0.
        pricePerKm = 0.10;
        boolean statusAge = true;
        while (statusAge) {
            System.out.print("Enter your age: ");
            age = input.nextInt();
            if (age < 1) {
                System.out.println("You have entered an invalid age!");
            } else {
                break;
            }
        }
        //Takes distance information from user. This while loop, runs until user enter a distance value bigger than 0.
        boolean statusDistance = true;
        while (statusDistance) {
            System.out.print("Enter the distance(km): ");
            distance = input.nextDouble();
            if (distance <= 0) {
                System.out.println("You have entered an invalid distance value!");
            } else {
                statusDistance = false;
            }
        }
        //Takes ticket type information from user. This while loop, runs until user enter a valid ticket type value(1 or 2).
        boolean statusTicket = true;
        while (statusTicket) {
            System.out.println("Select trip type:\n1- Round trip\n2- One direction");
            ticketType = input.nextInt();
            if (ticketType == 1 || ticketType == 2) {
                statusTicket = false;
            } else {
                System.out.println("You have entered an invalid value!");
            }
        }
        //Price without discount.
        Price = pricePerKm * distance;
        //Calculates age discount value according to age.
        if (age < 12) {
            ageDiscount = Price * 0.20;
        } else if (age >= 12 && age <= 24) {
            ageDiscount = Price * 0.10;
        } else if (age > 65) {
            ageDiscount = Price * 0.30;
        }

        discountPrice = Price - ageDiscount;
        //Calculates total price, total discount according to ticket type value (1 or 2) and prints total price,
        // total discount, age discount, ticket discount.
        if (ticketType == 1) {
            System.out.println("Price(per ticket): " + Price);
            System.out.println("Age discount(per ticket): " + ageDiscount);
            ticketDiscount = discountPrice * 0.20;
            System.out.println("Ticket type discount(per ticket): " + ticketDiscount);
            totalDiscount = ticketDiscount + ageDiscount;
            System.out.println("Total discount(per ticket): " + totalDiscount);
            double perTicketPrice = discountPrice - ticketDiscount;
            System.out.println("Discounted total price(per ticket): " + perTicketPrice);
            totalPrice = (discountPrice - ticketDiscount) * 2;
            System.out.println("Total Price(x2): " + totalPrice);

        } else {
            System.out.println("Price: " + Price);
            System.out.println("Age discount: " + ageDiscount);
            System.out.println("Ticket type discount: " + ticketDiscount);
            totalDiscount = ticketDiscount + ageDiscount;
            System.out.println("Total Discount: " + totalDiscount);
            totalPrice = discountPrice - ticketDiscount;
            System.out.println("Total Price: " + totalPrice);
        }

    }
}