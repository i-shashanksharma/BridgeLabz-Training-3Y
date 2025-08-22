import java.util.*;
class UniqueCharacters {
    static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static char[] findUnique(String text) {
        int n = getLength(text);
        char[] temp = new char[n];
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char[] unique = findUnique(text);
        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}
