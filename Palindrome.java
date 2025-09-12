import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String rev = "";
        for(int i = s.length()-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }

        if(s.equals(rev))
            System.out.printf("The string %s is a palindrome.", s);
        else
            System.out.printf("The string %s is not a palindrome.", s);

            sc.close();
    }
    
}
