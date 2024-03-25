import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Takes text input from user.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = input.nextLine();
        //The text splitting according to blanks and assigns an string array.
        String[] words = text.split(" ");
        //Created a hash map.
        HashMap<String, Integer> repeatingWords = new HashMap<>();
        //This loop reads all elements of the word's array.
        for (String word : words) {
            //If the word's first time its value is 1.
            int count = 1;
            word = word.toLowerCase();
            //If the word already exist on the hashmap, calls its value and increases by 1.
            if (repeatingWords.containsKey(word)) {
                count = repeatingWords.get(word);
                count++;
            }
            repeatingWords.put(word, count);
        }
        //Hashmap's values assigns to an arraylist, then it sorts according to values.
        List<Integer> counts = new ArrayList<>(repeatingWords.values());
        Collections.sort(counts, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
            //Then arraylist is reversed.
        }.reversed());
        //The first element is highest repeat count
        int highestRepeat = counts.get(0);
        //Then reads all Hashmap's key elements. When key's value equals to highest repeat, it will print with repeat times.
        for (String s : repeatingWords.keySet()) {
            if (repeatingWords.get(s) == highestRepeat) {
                System.out.println("The Most Repeating Word: " + s + "\t Repeating Times: " + highestRepeat);
            }
        }


    }
}