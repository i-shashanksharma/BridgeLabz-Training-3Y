import java.util.*;
public class SalarySlip {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers of employee data you have:");
        int n=sc.nextInt();
        String[] name=new String[n];
        int[] salary=new int[n];
        for(int k=0;k<n;k++){
            System.out.println("enter employee name:");
            String s=sc.next();
            name[k]=s;
            System.out.println("enter salary of employee:");
            int t=sc.nextInt();
            salary[k]=t;
        }
        int[] NetSalary=new int[salary.length];
        for(int i=0;i<salary.length;i++){
            NetSalary[i]=(int)(salary[i]+(20*salary[i])/100+(0.10*salary[i])/100);
            if(NetSalary[i]>50000){
                NetSalary[i]=(NetSalary[i]-(10*NetSalary[i])/100);
            }
        }
        for(int j=0;j<salary.length;j++){
            System.out.println(name[j] +" Salary is "+NetSalary[j]);
        }
    }
}