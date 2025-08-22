import java.util.*;
class SplitCompare {
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    static String[] splitWords(String s) {
        int len = getLength(s);
        int spaces = 1;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') spaces++;
        String[] words = new String[spaces];
        int idx = 0, start = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                words[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = s.substring(start, len);
        return words;
    }
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String text = sc.nextLine();
        String[] custom = splitWords(text);
        String[] builtin = text.split(" ");
        System.out.println("Arrays Equal: " + compareArrays(custom, builtin));
    }
}
