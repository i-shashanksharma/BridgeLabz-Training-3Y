import java.util.*;
public class WordsWithLength {
    static String[] splitWords(String s) {
        return s.trim().split("\\s+");
    }

    static String[][] wordLength(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(words[i].length());
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] table = wordLength(words);
        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}