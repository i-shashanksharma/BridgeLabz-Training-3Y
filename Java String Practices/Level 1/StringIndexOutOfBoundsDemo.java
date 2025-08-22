import java.util.Scanner;
class StringIndexOutOfBoundsDemo {
    static void generate(String s) {
        System.out.println(s.charAt(s.length()));
    }
    static void handle(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Handled: "+e);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String text=sc.next();
        handle(text);
    }
}
