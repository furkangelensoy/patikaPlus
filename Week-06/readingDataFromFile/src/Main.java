import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Week-06/ReadingDataFromFile/numbers.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String i = bufferedReader.readLine();
            int total = 0;
            while (i != null) {
                total += Integer.parseInt(i);
                i = bufferedReader.readLine();
            }
            System.out.println(total);
            reader.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}