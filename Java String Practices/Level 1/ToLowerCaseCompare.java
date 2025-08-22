import java.util.Scanner;
class ToLowerCaseCompare {
    static String toLower(String s) {
        String res="";
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(c>='A' && c<='Z') res+=(char)(c+32);
            else res+=c;
        }
        return res;
    }
    static boolean compare(String s1,String s2) {
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++) if(s1.charAt(i)!=s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String text=sc.nextLine();
        String s1=toLower(text);
        String s2=text.toLowerCase();
        System.out.println("User Method: "+s1);
        System.out.println("Built-in Method: "+s2);
        System.out.println("Compare: "+compare(s1,s2));
    }
}
