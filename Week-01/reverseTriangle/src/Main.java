import java.util.*;
public class Main {
    public static void main(String[] args) {
        //This program prints inverted triangle with "*".
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the hegiht of triangle: ");
        int height = input.nextInt();

        for(int i = height; i > 0; i--){
            for(int j = 0; j < (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}