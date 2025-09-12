public class SwapIntegers {
    int x = 10 ,y = 20;
    public void Test(){
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        swapCallByValue(x,y);
        System.out.println("After swapping by call by value: x = " + x + ", y = " + y);
        System.out.println();
        
        swapCallByReference(this);
        System.out.println("After swapping by call by reference value: x = " + x + ", y = " + y);


    }

    public static void swapCallByValue(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values inside swapCallByValue: x = " + a + ", y = " + b);

    }

    public static void swapCallByReference(SwapIntegers swp){
        int temp = swp.x;
        swp.x = swp.y;
        swp.y = temp;
        System.out.println("values inside swapcallbyref: x = " + swp.x + ", y = " + swp.y);

    }

    public static void main(String[] args) {
        SwapIntegers swp = new SwapIntegers();
        swp.Test();
        
    }
    
}
