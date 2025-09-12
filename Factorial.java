public class Factorial {
    int result=1;
    int fact(int n){
        if(n==0)
            return 1;
        else
            for(int i=n;i>0;i--){
               result = result * i;
            }
            return result;
    }

    public static void main(String[] args) {
        int n = 5;
        Factorial fct =new Factorial();
        System.out.println(fct.fact(n));
    }
    
}
