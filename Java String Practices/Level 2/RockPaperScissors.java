import java.util.*;
class RockPaperScissors {
    static String computerChoice() {
        int r=(int)(Math.random()*3);
        if(r==0) return "rock";
        if(r==1) return "paper";
        return "scissors";
    }
    static int findWinner(String user,String comp) {
        if(user.equals(comp)) return 0;
        if(user.equals("rock")&&comp.equals("scissors")) return 1;
        if(user.equals("paper")&&comp.equals("rock")) return 1;
        if(user.equals("scissors")&&comp.equals("paper")) return 1;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Games");
        int n=sc.nextInt();
        int userWins=0,compWins=0;
        for(int i=0;i<n;i++) {
            System.out.println("Enter String");
            String user=sc.next().toLowerCase();
            String comp=computerChoice();
            int res=findWinner(user,comp);
            if(res==1) userWins++;
            else if(res==-1) compWins++;
            System.out.println("User: "+user+" Computer: "+comp);
        }
        System.out.println("User Wins: "+userWins+" Computer Wins: "+compWins);
        System.out.println("User Win%: "+(userWins*100.0/n));
        System.out.println("Computer Win%: "+(compWins*100.0/n));
    }
}
