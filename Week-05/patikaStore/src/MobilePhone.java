import java.util.Scanner;

public class MobilePhone extends Product {
    private static int idCounter = 1;
    private int batteryPower;
    private String colour;

    public MobilePhone(String name, double price, Brand brand, int memorySize, double screenSize, int ram, int stockAmount, double discountRate, int batteryPower) {
        super(idCounter, name, price, brand, memorySize, screenSize, ram, stockAmount, discountRate);
        this.idCounter++;
        this.batteryPower = batteryPower;
        this.colour = chooseColour();
    }

    public String chooseColour() {
        String[] colours = {"Black", "Red", "Blue"};
        System.out.println("Choose a colour");
        int counter = 1;
        for (String c : colours) {
            System.out.println(counter + "- " + c);
            counter++;
        }
        System.out.print("Colour id: ");
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt() - 1;
        if (choose >= 0 && choose < colours.length){
            return colours[choose];
        }
        return colours[0];
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
