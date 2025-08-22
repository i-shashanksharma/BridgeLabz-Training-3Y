import java.util.*;
class UniqueCharFrequency {
    static char[] uniqueCharacters(String text) {
        int n = 0;
        try {
            while (true) {
                text.charAt(n);
                n++;
            }
        } catch (Exception e) {}
        
        char[] unique = new char[n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index++] = ch;
            }
        }
        
        char[] finalUnique = new char[index];
        for (int i = 0; i < index; i++) {
            finalUnique[i] = unique[i];
        }
        return finalUnique;
    }

    static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int n = 0;
        try {
            while (true) {
                text.charAt(n);
                freq[text.charAt(n)]++;
                n++;
            }
        } catch (Exception e) {}
        
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] frequencies = findFrequency(text);
        System.out.println("Character | Frequency");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("    " + frequencies[i][0] + "      |    " + frequencies[i][1]);
        }
    }
}
