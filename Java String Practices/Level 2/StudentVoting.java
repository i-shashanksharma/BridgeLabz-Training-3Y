import java.util.*;
class StudentVoting {
    static int[] generateAges(int n) {
        int[] arr=new int[n];
        Random r=new Random();
        for(int i=0;i<n;i++) arr[i]=10+r.nextInt(90);
        return arr;
    }
    static String[][] canVote(int[] ages) {
        String[][] res=new String[ages.length][2];
        for(int i=0;i<ages.length;i++) {
            res[i][0]=String.valueOf(ages[i]);
            if(ages[i]>=18) res[i][1]="true"; else res[i][1]="false";
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Students");
        int n=sc.nextInt();
        int[] ages=generateAges(n);
        String[][] res=canVote(ages);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i][0]+"\t"+res[i][1]);
    }
}
