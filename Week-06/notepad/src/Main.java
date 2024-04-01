import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Week-06/notepad/notes.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String lastLine = "", line;
            while ((line = bufferedReader.readLine()) != null) {
                lastLine = line;
            }
            if (lastLine.isEmpty()){
                lastLine = "There is no note, let's write your first note!";
            }
            System.out.println("Your last note: " + lastLine);

            Scanner input = new Scanner(System.in);
            System.out.print("Enter a text: ");
            String text = input.nextLine();
            text = text + "\n";

            PrintWriter writer = new PrintWriter(new FileOutputStream("Week-06/notepad/notes.txt", true));
            writer.write(text);
            bufferedReader.close();
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}