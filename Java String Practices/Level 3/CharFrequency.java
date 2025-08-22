import java.util.*;
class CharFrequency {
    static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int n = 0;
        try {
            while (true) {
                text.charAt(n);
                n++;
            }
        } catch (Exception e) {}
        for (int i = 0; i < n; i++) {
            freq[text.charAt(i)]++;
        }
        String[][] result = new String[n][2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                index++;
            }
        }
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }
        return finalResult;
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
