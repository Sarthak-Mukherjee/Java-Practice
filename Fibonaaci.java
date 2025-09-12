public class Fibonaaci {
    int fibo(int n){
        if(n==1)
            return 1;
        else if(n==0)
            return 0;
        else
            return fibo(n-1)+fibo(n-2);

    }

    public static void main(String[] args) {
        int n = 5;
        Fibonaaci fibo = new Fibonaaci();
        for(int i=0;i<=n;i++){
            System.out.print(fibo.fibo(i)+" ");
        }
        
    }

}
