import java.util.*;
class TrimString {
    static int[] findBounds(String s) {
        int start=0,end=s.length()-1;
        while(start<=end && s.charAt(start)==' ') start++;
        while(end>=start && s.charAt(end)==' ') end--;
        return new int[]{start,end};
    }
    static String substring(String s,int start,int end) {
        String res="";
        for(int i=start;i<=end;i++) res+=s.charAt(i);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String text=sc.nextLine();
        int[] b=findBounds(text);
        String custom=substring(text,b[0],b[1]);
        String builtin=text.trim();
        System.out.println("Custom: "+custom);
        System.out.println("Built-in: "+builtin);
        System.out.println("Equal: "+custom.equals(builtin));
    }
}
