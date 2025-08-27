import java.util.*;
public class ATM {
    public static void gettransactions(int n, int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i< n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("the transactions are: ");
        for(int i = 0 ; i< n ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
    public static int typeoftransaction(int[] arr){
        int ans = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]>0){
                System.out.print("deposit ");
                ans+=arr[i];
            }
            else{
                System.out.print("withdrawal ");
                ans+=arr[i];
            }
        }
        return ans;
    }
    
    public static void overdraftornot(int ans){
        if(ans>0){
            System.out.println("ATM balance is: "+ ans);
        }
        else{
            System.out.println("Overdraft! the balance is: " + ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no. of transactions: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        gettransactions(n,arr);
        
        System.out.println();
        typeoftransaction(arr);

        System.out.println();

        overdraftornot(typeoftransaction(arr));
    

    }
}