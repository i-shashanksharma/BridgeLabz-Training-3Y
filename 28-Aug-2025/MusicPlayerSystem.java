import java.util.*;
public class MusicPlayerSystem {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String[] songs={"Shape of You","Blinding Lights","Senorit","Closer","Believer","Faded"};
        int choice;
        System.out.println("following are the songs name with their indices:");
        for(int i=0;i<songs.length-1;i++){
             System.out.println(i+1+" "+songs[i]);
        }
        System.out.println();
        System.out.println("select number of service which you want to choose:");
        System.out.println("1. play all songs");
        System.out.println("2. play a song by index");
        System.out.println("3. Search a song by name");
        System.out.println("4. exit");
        do{
            choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("music is playing");
                break;

                case 2:
                    System.out.println("Enter index of song");
                    int x=sc.nextInt();
                    System.out.println(songs[x]+" is playing");
                    break;

                case 3:
                String name=sc.next();
                int count=0;
                for(String s: songs){
                    if(name.equals(s)){
                        System.out.println(s+" is playing");
                        count=1;
                        break;
                    }
                }
                if(count==0){
                    System.out.println(name+" is not in playlist");
                }
                break;

                case 4:
                break;

                default:
                System.out.println("Type Mistake");
            }
        }while(choice!=4);
    }
}