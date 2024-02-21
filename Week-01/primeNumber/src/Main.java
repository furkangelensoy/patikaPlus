public class Main {
    public static void main(String[] args) {
        //This program prints prime numbers 1 to 100.
        for (int i = 2; i < 100; i++) {
            //Count keeps the number of numbers that are divisible whole
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(i + ", ");
            }
        }

    }
}