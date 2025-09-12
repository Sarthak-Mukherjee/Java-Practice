public class RevString {
    String reverse(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if (str.equals(rev))
            return "Palindrome";
        else
            return "not a palindrome";
    }

    public static void main(String[] args) {
        RevString obj = new RevString();
        String str = "racecar";
        System.out.println(obj.reverse(str));
    }
    
}
