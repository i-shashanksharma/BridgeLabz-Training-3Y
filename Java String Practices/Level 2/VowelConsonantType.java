import java.util.*;
class VowelConsonantType {
    static String checkType(char c) {
        if (Character.isLetter(c)) {
            c = Character.toLowerCase(c);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    static String[][] classify(String s) {
        String[][] arr=new String[s.length()][2];
        for(int i=0;i<s.length();i++) {
            arr[i][0]=String.valueOf(s.charAt(i));
            arr[i][1]=checkType(s.charAt(i));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String text=sc.nextLine();
        String[][] res=classify(text);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i][0]+"\t"+res[i][1]);
    }
}
