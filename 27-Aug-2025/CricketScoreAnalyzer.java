import java.util.*;
public class CricketScoreAnalyzer {
    public static int highestScore(int arr[]){
        int hs = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            hs = Math.max(hs,arr[i]);
        }
        return hs;
    }

    public static int lowestScore(int arr[]){
        int ls = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            ls = Math.min(ls,arr[i]);
        }
        return ls;
    }

    public static double calculateAverageScore(int arr[]){
        int tscore = 0;
        double averageScore = 0;
        for(int i = 0; i<arr.length; i++){
            tscore+=arr[i];
        }
        averageScore = tscore/arr.length;
        return averageScore;
    }

    public static boolean scoredACenturyOrNot(int arr[]){
        boolean flag = false;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=100){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of batsman : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter runs scored by each batsman : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Highest Score : "+highestScore(arr));
        System.out.println("Lowest Score : "+lowestScore(arr));
        System.out.println("Average Score : "+calculateAverageScore(arr));
        if(scoredACenturyOrNot(arr)){
            System.out.println("Century Scorer");
        }
    }
}