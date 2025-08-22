import java.util.Scanner;
class SubstringCompare {
    static String subStr(String s,int start,int end) {
        String res="";
        for(int i=start;i<end;i++) res+=s.charAt(i);
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
        String text=sc.next();
        System.out.println("Enter Start Index");
        int start=sc.nextInt();
        System.out.println("Enter End Index");
        int end=sc.nextInt();
        String s1=subStr(text,start,end);
        String s2=text.substring(start,end);
        System.out.println("User Method: "+s1);
        System.out.println("Built-in Method: "+s2);
        System.out.println("Compare: "+compare(s1,s2));
    }
}
