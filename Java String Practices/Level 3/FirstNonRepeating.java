import java.util.*;
class FirstNonRepeating {
    static char findFirstNonRepeating(String text) {
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
        for (int i = 0; i < n; i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char result = findFirstNonRepeating(text);
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }
}
